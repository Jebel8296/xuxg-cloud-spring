package com.xuxg.cloud.service.user;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaUserServiceApp {

	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaUserServiceApp.class).web(true).run(args);
	}

}
