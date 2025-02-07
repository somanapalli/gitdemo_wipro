package com.wipro.java;

public class Test4 {
	//class level variables
	int stid;
	String stname;
	
	Test4(int stid, String stname){
		this.stid=stid;
		this.stname=stname;
	}
	public void display() {
		System.out.println("student id is: " +stid);
		System.out.println("student name is: " + stname);
	}

	public static void main(String[] args) {
		
		Test4 obj = new Test4(200,"srishti");
		obj.display();
	}
}
