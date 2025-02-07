package com.wipro.cfw;

import java.util.ArrayList;

public class Test3 {

	public static void main(String[] args) {
		
		//Set s = new LinkedHashSet();
		
		ArrayList<Integer> s = new ArrayList();
		
		for(int i = 1;i<=10;i++) {
			s.add(i);
		}
		
		//s.add("rk");
		
		  for(Integer i : s) { 
		
		  if(i%2==0) 
		  { 
			  System.out.println(i); 
		  } 
		  }
		 
		/*
		 * ListIterator itr = s.listIterator();
		 * 
		 * while(itr.hasNext()) { System.out.println(itr.next()); }
		 * 
		 * System.out.println("retrieving the elements in bakcward direction");
		 * 
		 * while(itr.hasPrevious()) { System.out.println(itr.previous()); }
		 */
	}

}
