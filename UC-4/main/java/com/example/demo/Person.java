package com.example.demo;


public class Person 
{
	private String fname;
	private String lname;
	private int id;
	
	public Person(String fname,String lname,int id)
	{
		super();
		this.fname = fname;
		this.lname = lname;
		this.id = id;
	}
	
	public Person()
	{
		
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
