package com.moting.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DcController {

    @Autowired
    RestTemplate restTemplate;
    
    @GetMapping("/consumer/client1")
    public String dc1() {
        return restTemplate.getForObject("http://eureka-client1/dc", String.class);
    }
    
    @GetMapping("/consumer/client2")
    public String dc2() {
    	return restTemplate.getForObject("http://eureka-client2/dc", String.class);
    }
}
