package com.spring.helloworld.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController 
{
	@RequestMapping(value = "/hello/{name}",method = RequestMethod.GET)
	public String sayHi(@PathVariable String name,Model model)
	{
		model.addAttribute("Name of employee" ,name);
		return " Hello " + name +" from BridgeLabz:";
	}
}
