package mlbd.session.sbmigration.controller;

import mlbd.session.sbmigration.entity.Item
import mlbd.session.sbmigration.model.AddDataRequestBody
import mlbd.session.sbmigration.service.ItemService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/item")
class ItemController(
    private val itemService: ItemService
) {

    @PostMapping
    fun addData(@RequestBody requestBody: AddDataRequestBody): ResponseEntity<Item> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(itemService.addData(requestBody))
    }

    @GetMapping
    fun getMappedData():ResponseEntity<String> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(itemService.getData())
    }
}
