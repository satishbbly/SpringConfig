package com.satish.java.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.satish.java.config.DBConfiguration;

@RestController
public class GreetingControoller {

	@Value("${my.greeting}")
	private String greeting;
	
	@Value("${my.greeting1:This is geering 1}")
	private String greeting1;

	@Value("${my.listvalues}")
	private List<String> listvalues;
	
	@Value("#{${my.mapvalues}}")
	private Map<String,String> mapvalues;
	
	@Autowired
	private DBConfiguration dbconfig;
	
	@GetMapping("/greeting")
	public String greeting()
	{
		return greeting+greeting1+listvalues+mapvalues+dbconfig.toString();
	}
}
