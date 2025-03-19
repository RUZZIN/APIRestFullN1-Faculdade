package N1Avaliacao.APIRestFull;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(info = @Info(
        title = "API Rest Full",
        version = "1.0",
        description = "API para gerenciamento de recursos",
        contact = @Contact(name = "Ruan", email = "ruanp9725@gmail.ocm"))
)
@SpringBootApplication
public class ApiRestFullApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiRestFullApplication.class, args);
    }
}