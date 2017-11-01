package com.moting.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moting.spring.service.ConsumerService;

@RestController
public class DcController {

    @Autowired
    ConsumerService consumerService;
    
    @GetMapping("/consumer/client1")
    public String dc1() {
        return consumerService.consumer1();
    }
    
    @GetMapping("/consumer/client2")
    public String dc2() {
    	return consumerService.consumer2();
    }
}
