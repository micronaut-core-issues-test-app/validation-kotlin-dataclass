package example.micronaut

import com.fasterxml.jackson.annotation.JsonIgnore
import io.micronaut.core.annotation.Introspected
import io.swagger.v3.oas.annotations.media.Schema
import java.time.LocalDate
import javax.validation.constraints.NotNull
import javax.validation.constraints.PastOrPresent

@Introspected
data class CreateCustomerRequest(

    @field:NotNull
    val customerName: String,

    @field:NotNull
    @field:PastOrPresent
    val birthDate: LocalDate
)
