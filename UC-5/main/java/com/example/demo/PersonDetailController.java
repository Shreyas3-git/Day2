package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonDetailController 
{
	@Autowired 
	PersonDetailService personService;
	
	@RequestMapping("/person")
	public List<PersonDetail> getData()
	{
		return personService.getPersonDetail();
	}
	
	@RequestMapping(method = RequestMethod.PUT,value = "/person/{fname}")
	public void updateRecord(@RequestBody PersonDetail person,@PathVariable String fname)
	{
		 personService.updateContent(fname, person);
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/person/{fname}")
	public void addRecord(@RequestBody PersonDetail personinfo)
	{
		personService.addPerson(personinfo);
	}
}
