package com.wipro.inheritance;
//child class
public class B extends A {

	 public void sub(int x, int y)
	 {
		 System.out.println(x-y);
	 }
	
	public static void main(String[] args) {
	
		 B obj = new B();
		 obj.sum(2, 3);
		 obj.sub(5, 4);
		
		
	}
}
