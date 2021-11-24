package com.kbe.service.gateway.controller;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.io.IOException;

@RestController
@RequestMapping("/gateway")
public class api {

    private final OkHttpClient ok = new OkHttpClient();
    private final String LIVE = "http://localhost:8082/livedata";
    private final String CONVERTER = "http://localhost:8083/live";
    private final String USER = "http://localhost:8084/live";

}
