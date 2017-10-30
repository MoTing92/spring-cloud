package com.moting.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moting.spring.client.Client1;
import com.moting.spring.client.Client2;

@RestController
public class DcController {

	@Autowired
	Client1 client1;
	
	@Autowired
	Client2 client2;
    
    @GetMapping("/consumer/client1")
    public String dc1() {
    	return client1.consumer();
    }
    
    @GetMapping("/consumer/client2")
    public String dc2() {
    	return client2.consumer();
    }
}
