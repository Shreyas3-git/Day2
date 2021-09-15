package com.example.demo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PersonDetailService 
{
	List<PersonDetail> person = Arrays.asList(
			new PersonDetail("Hello from","Shreyas","Shinde"),
			new PersonDetail("Hello from","Sanket","Tulsankar"),
			new PersonDetail("Hello from","Sarthak","Jadhav"));
	
	public List<PersonDetail> getPersonDetail()
	{
		return person;
	}
	
	public PersonDetail getPerson(String fName)
	{
		return person.stream().filter(name -> name.getFname().equals(fName)).findFirst().get();
	}
	
	public void updateContent(String fname, PersonDetail personinfo)
	{
		for(int i = 0; i < person.size(); i++)
		{
			PersonDetail persons = person.get(i);
			if (persons.getFname().equals(fname)) 
			{
				person.set(i, personinfo);
			}
		}
	}
	
	public void addPerson(PersonDetail personinfo)
	{
		person.add(personinfo);
	}
}
