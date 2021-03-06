package com.xuxg.cloud.eureka.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author xuxg
 * @since 20170110
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApp {
	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaServerApp.class).web(true).run(args);
	}
}
