package com.staging.frame.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebFrameApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebFrameApplication.class, args);
	}
}
