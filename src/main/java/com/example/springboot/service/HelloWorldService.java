package com.example.springboot.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Deven on 2016-02-17.
 */
@Component
public class HelloWorldService {

    @Value("${name:World}")
    private String name;

    public String getHelloMessage() {
        return "Hello " + this.name;
    }

}
