package com.wipro.java;

public class Student {
	
	int stid = 100;
	String stname= "Rk";
	static String collegeName="wipro";
	
	/*
	 * public void getStudentInfo() { System.out.println(stid);
	 * System.out.println(stname); }
	 */
	public static void main(String[] args) {
		
		//create the object 
		Student rk = new Student();
		System.out.println("student id is:" + rk.stid);
		System.out.println("student name is:" + rk.stname);
	
		//using object i want to change the data
		
		rk.stid=200;
		rk.stname="kabeer";
		
		System.out.println("student id is: " + rk.stid);
		System.out.println("student name is: " + rk.stname);
	
		System.out.println("student college name is: " + Student.collegeName );
	}
	
	

}
