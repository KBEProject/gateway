package com.kbe.service.gateway.controller;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Gateway {

    private final String USER = "http://localhost:8084";
    private final String CONVERTER = "http://localhost:8083";

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("register", r -> r.path("/user/register")
                        .and()
                        .uri(USER))
                .route("login", r -> r.path("/user/login")
                        .and()
                        .uri(USER))
                .route("getConversions", r -> r.path("/conversions/findConversionOfUser")
                        .and()
                        .uri(CONVERTER))
                .route("insert", r -> r.path("/conversions/insert")
                        .and()
                        .uri(CONVERTER))
                .route("delete", r -> r.path("/conversions/deleteAll")
                        .and()
                        .uri(CONVERTER))
                .build();

    }
}
