package com.sb.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.sb.demo.controller.BankController;

@SpringBootApplication
@ComponentScan(basePackages = "com.sb.demo")
public class BankApplication {
	private static Logger logger = LoggerFactory.getLogger(BankApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);
		logger.info(" Started ");
		System.out.println("Started...");
	}

}
