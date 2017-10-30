package com.moting.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DcController {

	@Autowired
    LoadBalancerClient loadBalancerClient;
	
    @Autowired
    RestTemplate restTemplate;
    
    @GetMapping("/consumer/client1")
    public String dc1() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-client1");
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/dc";
        System.out.println(url);
        return restTemplate.getForObject(url, String.class);
    }
    
    @GetMapping("/consumer/client2")
    public String dc2() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-client2");
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/dc";
        System.out.println(url);
        return restTemplate.getForObject(url, String.class);
    }
}
