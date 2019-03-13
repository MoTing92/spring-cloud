package com.moting.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {
	//在idea中测试使用git
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}
}
