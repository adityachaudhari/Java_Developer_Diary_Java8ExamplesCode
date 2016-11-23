package com.examples.java8.ListTomap;

/**
 * Created by adityacchaudhari on 21/11/2016.
 */
public class Employee
{

	private Integer ID;
	private String name;
	private String emailID;
	private String departmentName;

	public Employee(Integer ID, String name, String emailID, String departmentName)
	{
		this.ID = ID;
		this.name = name;
		this.emailID = emailID;
		this.departmentName = departmentName;
	}

	public Integer getID()
	{
		return ID;
	}

	public void setID(Integer ID)
	{
		this.ID = ID;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getEmailID()
	{
		return emailID;
	}

	public void setEmailID(String emailID)
	{
		this.emailID = emailID;
	}

	public String getDepartmentName()
	{
		return departmentName;
	}

	public void setDepartmentName(String departmentName)
	{
		this.departmentName = departmentName;
	}

}
