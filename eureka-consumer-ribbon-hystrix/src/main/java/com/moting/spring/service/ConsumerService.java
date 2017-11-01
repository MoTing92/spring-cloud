package com.moting.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class ConsumerService {

	@Autowired
    RestTemplate restTemplate;
	
    @HystrixCommand(fallbackMethod = "fallback")
    public String consumer1() {
        return restTemplate.getForObject("http://eureka-client1/dc", String.class);
    }
    
    @HystrixCommand(fallbackMethod = "fallback")
    public String consumer2() {
        return restTemplate.getForObject("http://eureka-client2/dc", String.class);
    }
    
    public String fallback() {
        return "fallback";
    }
}
