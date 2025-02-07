package com.wipro.inheritance;

public class Employee  {
	
	int empid;
	String empname;

	@Override
	public String toString()
	{
		return empid +  " " + empname;
	}
	public Employee()
	{
		empid=100;
		empname="shivimalik";
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employee emp = new Employee();
	System.out.println(emp);
	}
}
