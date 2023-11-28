package com.ServiceOne_DT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceOneDtApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceOneDtApplication.class, args);
	}

}
