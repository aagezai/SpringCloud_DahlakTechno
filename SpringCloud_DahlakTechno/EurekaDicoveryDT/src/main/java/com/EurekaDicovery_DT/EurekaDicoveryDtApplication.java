package com.EurekaDicovery_DT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaDicoveryDtApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaDicoveryDtApplication.class, args);
	}

}
