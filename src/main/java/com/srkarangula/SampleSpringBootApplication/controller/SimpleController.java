package com.srkarangula.SampleSpringBootApplication.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @Value("${sample.value}")
    private String value;

    @GetMapping("/simpleGet")
    public String simpleGetMethod() {
        return value;
    }

}
