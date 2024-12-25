package com.hans.example.vuestudy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {
	
	@Bean
	public OpenAPI openAPI() {
		return new OpenAPI()
				.components(new Components())
				.info(
						new Info()
						.title("API for Vue Study")
						.description("API for Vue Study Example Server")
						.version("0.1.0"));
						
						
	}
}