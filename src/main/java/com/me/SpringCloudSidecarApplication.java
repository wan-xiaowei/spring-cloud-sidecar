package com.me;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@SpringBootApplication
@EnableSidecar  //整合了EnableCircuitBreaker  EnableDiscoveryClient  EnableZuulProxy
public class SpringCloudSidecarApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudSidecarApplication.class, args);
	}
}
