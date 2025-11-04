package com.senai.infob.atividade_api.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Churrascaria",
        version = "1.0",
        description = "Churrasco é bão"
    )
)
public class Swagger {

}