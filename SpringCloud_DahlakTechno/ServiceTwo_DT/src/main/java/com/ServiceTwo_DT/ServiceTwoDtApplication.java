package com.ServiceTwo_DT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceTwoDtApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceTwoDtApplication.class, args);
	}

}
