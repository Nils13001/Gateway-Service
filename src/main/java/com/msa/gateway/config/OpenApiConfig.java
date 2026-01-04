package com.msa.gateway.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Gateway Service API",
                version = "v1",
                description = "APIs for gateway-service"
        )
)
public class OpenApiConfig {
}
