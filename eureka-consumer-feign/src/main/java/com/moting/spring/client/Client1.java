package com.moting.spring.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-client1")
public interface Client1 {

	@GetMapping("/dc")
    String consumer();
}
