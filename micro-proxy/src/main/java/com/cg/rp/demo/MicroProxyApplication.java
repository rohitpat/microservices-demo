package com.cg.rp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class MicroProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroProxyApplication.class, args);
	}
}
