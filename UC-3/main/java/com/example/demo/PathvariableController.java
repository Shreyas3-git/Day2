package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController 
{
	@RequestMapping("/hello/{empname}/{empid}")
	public String sayHi(@PathVariable String empname,@PathVariable String empid)
	{
		return "Hello "+empname+ " from BridgeLabz:";
	}
}
