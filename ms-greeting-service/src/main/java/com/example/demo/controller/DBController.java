package com.example.demo.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@ConfigurationProperties(prefix = "noofmonths")
@RestController
@RefreshScope
public class DBController {
	
//	private String holiday ;
	
//	@Value("${noOfMonths}")
	private String month ;
	
//	@GetMapping("/holidays")
//	public String holidays() {
//		System.out.println("holidays : "+holiday);
//		return holiday;
//	}
	
	@GetMapping("/month")
	public String month() {
		System.out.println("month : "+month);
		return month;
	}

}
