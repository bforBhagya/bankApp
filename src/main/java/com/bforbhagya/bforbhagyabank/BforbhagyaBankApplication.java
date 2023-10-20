package com.bforbhagya.bforbhagyabank;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "bforbhagya BankApp",
                description = "Backend REST API for Bank",
                version = "v1.0",
                contact = @Contact(
                        name = "Bhagya Prabhashwara",
                        email = "bhagya.ariyarathne@gmail.com",
                        url = "http://github.com/---"
                ),
                license = @License(
                        name = "Bhagya Prabhashwara",
                        url = "http://github.com/"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "bforbhagya Bank App Documentation",
                url = "http://github.com/"
        )
)
public class BforbhagyaBankApplication {
    public static void main(String[] args) {

        SpringApplication.run(BforbhagyaBankApplication.class, args);
    }
}
