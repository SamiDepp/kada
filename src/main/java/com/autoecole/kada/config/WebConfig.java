package com.autoecole.kada.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class WebConfig extends WebMvcConfigurationSupport {

//	@Override
//	protected void addCorsMappings(CorsRegistry registry) {
//		registry.addMapping("/**")
//        .allowedOrigins("*")
//	    .allowedMethods("*")
//	    .allowedHeaders("*")
//        .allowCredentials(true)
//        .maxAge(3600);
//	}

	
}
