package com.wipro.cfw;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

//to organize the imports in eclipse short cut key is : ctrl + shift + o

public class Test2 {

	public static void main(String[] args) {
		
		//create the object of List collectino 
		List l = new LinkedList();
		l.add(100);
		l.add(false);
		l.add("rk");
		l.add(100);
		l.add(null);
		
		//for each loop
		
		/*
		 * for(Object o:l) { System.out.println(o);
		 * 
		 * }
		 */
		
		/*
		 * System.out.println(l.size());
		 * System.out.println("is my list collection is empty ? " + l.isEmpty());
		 * System.out.println(l.get(0)); System.out.println(l.contains(1000));
		 * System.out.println(l.indexOf(100)); System.out.println(l.lastIndexOf(100));
		 * System.out.println(l.remove(0));//100 System.out.println(l.remove(null));
		 * //System.out.println(l.remove(3));//IndexOutOfBoundsException
		 * System.out.println(l.remove(Boolean.valueOf(true)));//false
		 * 
		 * l.add(1, 3.4); System.out.println(l);
		 * 
		 * l.clear();
		 * 
		 * System.out.println(l);
		 */
		//converting List collection to Set Collection
		Set s = new LinkedHashSet<>(l);
		System.out.println(l);
		System.out.println(s);
		
	}
}
