package com.sb.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sbi")
public class BankController {
	Logger logger = LoggerFactory.getLogger(BankController.class);

	@GetMapping
	public String welcome() {
		logger.info("inside /sbi welcome()");
		return "welcome to sbi";
	}

	@GetMapping("/{name}")

	public String welcome(@PathVariable String name) {
		logger.info("inside /sbi/name welcome()");
		return "welcome " + name;
	}
}
