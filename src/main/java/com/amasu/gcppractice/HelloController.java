package com.amasu.gcppractice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/hello")
public class HelloController {

    @Value("${application.secret}")
    private String userName;
    @GetMapping
    public String getSecret() {
        return "hello world : " + userName;
    }
}
