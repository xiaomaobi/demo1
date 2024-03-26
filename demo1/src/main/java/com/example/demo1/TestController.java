package com.example.demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {

    @Value("${server}")
    private String server;

    @GetMapping("/test")
    public String test(){
        return server;
    }

    public void setServer(){
        this.server = "123";
    }
}
