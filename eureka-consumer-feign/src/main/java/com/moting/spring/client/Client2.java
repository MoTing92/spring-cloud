package com.moting.spring.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-client2")
public interface Client2 {

	@GetMapping("/dc")
    String consumer();
}
