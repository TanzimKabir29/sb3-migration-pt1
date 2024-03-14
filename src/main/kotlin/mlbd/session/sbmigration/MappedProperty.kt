package mlbd.session.sbmigration

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConfigurationProperties(prefix = "custom-property")
@ConstructorBinding
data class MappedProperty(
    val name: String,
    val type: String
)
