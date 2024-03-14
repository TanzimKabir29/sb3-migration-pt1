package mlbd.session.sbmigration.service

import mlbd.session.sbmigration.MappedProperty
import mlbd.session.sbmigration.entity.Item
import mlbd.session.sbmigration.model.AddDataRequestBody
import mlbd.session.sbmigration.repository.ItemRepository
import org.springframework.stereotype.Service

@Service
class ItemService(
    private val itemRepository: ItemRepository,
    private val mappedProperty: MappedProperty
) {

    fun addData(request: AddDataRequestBody) =
        Item(
            number = request.id,
            name = request.name,
            type = request.type
        ).let(itemRepository::save)

    fun getData() = mappedProperty.toString()
}
