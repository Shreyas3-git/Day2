package com.example.demo;

public class PersonDetail 
{
	private String msg;
	private String fname;
	private String lname;
	
	public PersonDetail(String msg,String fname,String lname)
	{
		this.msg = msg;
		this.fname = fname;
		this.lname = lname;
	}
	
	public PersonDetail()
	{
		
	}

	public String getMsg() 
	{
		return msg;
	}

	public void setMsg(String msg) 
	{
		this.msg = msg;
	}

	public String getFname() 
	{
		return fname;
	}

	public void setFname(String fname) 
	{
		this.fname = fname;
	}

	public String getLname() 
	{
		return lname;
	}

	public void setLname(String lname) 
	{
		this.lname = lname;
	}
	
	
}
