package com.wipro.cfw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Test7 {

	public static void main(String[] args) {

		// create the object of Map interface

		// Map<Integer,String> map = new HashMap<>();

		/*
		 * SortedMap<Integer,String> map = new TreeMap<>();
		 * 
		 * map.put(100, "mayank");
		 * 
		 * 
		 * map.put(20, "lokeshwar");
		 * 
		 * map.put(200, "rajat raj");
		 * 
		 * Set<Entry<Integer,String>> s = map.entrySet();
		 * 
		 * 
		 * for(Object o: s) { System.out.println(o); }
		 * 
		 * for(Map.Entry<Integer, String> me : s) { System.out.println(me.getKey() + " "
		 * + me.getValue()); }
		 */

		SortedMap<Long, Student> sm = new TreeMap<>();

		Student kumar = new Student(10, "kumar");
		Student mayank = new Student(4, "mayank");
		Student rajat = new Student(56, "rajat");

		sm.put(9848426L, kumar);
		sm.put(7657776L, mayank);
		sm.put(8767678L, rajat);

		List<Map.Entry<Long, Student>> list = new ArrayList<>(sm.entrySet());

		
		Collections.sort(list, new MyComparator());

		for (Map.Entry<Long, Student> entry : list) {
			System.out.println(
					entry.getKey() + " -> " + entry.getValue().getStid() + " ," + entry.getValue().getStname());
		}

	}
}
