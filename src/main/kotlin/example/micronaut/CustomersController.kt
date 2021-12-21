package example.micronaut

import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Status
import io.micronaut.validation.Validated
import javax.validation.Valid

@Validated
@Controller("/v1/customers")
class CustomersController {

    @Post
    @Status(HttpStatus.CREATED)
    fun createCustomer(@Valid @Body request: CreateCustomerRequest) {
    }

}