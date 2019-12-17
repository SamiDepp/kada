package com.autoecole.kada.config;

import com.autoecole.kada.entity.Candidat;
import com.autoecole.kada.entity.Examen;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import java.awt.print.Book;


@Configuration
public class GlobalRepositoryRestConfigurer implements RepositoryRestConfigurer {

    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.getCorsRegistry()
                .addMapping("/**")
                .allowedOrigins("*")
                .allowedHeaders("*")
                .allowedMethods("*");
        config.exposeIdsFor(Candidat.class);
        config.exposeIdsFor(Examen.class);
    }

}
