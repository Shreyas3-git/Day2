package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController 
{
	@RequestMapping("/person")
	public List<Person> personDetails()
	{
		return Arrays.asList(
				new Person("Robert","Downey",1001),
				new Person("Jonny","Deep",1002),
				new Person("Tom","Cruise",1003));
	}
}
