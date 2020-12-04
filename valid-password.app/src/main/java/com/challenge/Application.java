package com.challenge;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.info.*;

@OpenAPIDefinition(
        info = @Info(
                title = "Valid Password",
                version = "v1.0",
                description = "API Valid Password",
                license = @License(name = "MIT License", url = "https://TBD"),
                contact = @Contact(name = "Luiz Teixeira", email = "luiz.teixeira5@fatec.sp.gov.br",
                url = "https://github.com/luizhdteixeira/challenge-valid-password/issues")
        )
)
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}
