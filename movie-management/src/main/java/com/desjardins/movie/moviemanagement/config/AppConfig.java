package com.desjardins.movie.moviemanagement.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.projection.ProjectionFactory;
import org.springframework.data.projection.SpelAwareProxyProjectionFactory;

@Configuration
public class AppConfig {

    @Bean
    public ProjectionFactory factory() {
        return new SpelAwareProxyProjectionFactory();
    }
}
