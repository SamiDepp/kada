package com.autoecole.kada.config.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class WebConfig extends WebMvcConfigurationSupport {

	@Override
	protected void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
        .allowedOrigins("*")
	    .allowedMethods("*")
	    .allowedHeaders("*")
        .allowCredentials(true)
        .maxAge(3600);
	}

	
}
