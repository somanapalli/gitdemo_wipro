package com.wipro.cfw;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class MyComparator implements Comparator<Map.Entry<Long, Student>> {

	

	@Override
	public int compare(Entry<Long, Student> o1, Entry<Long, Student> o2) {
		// TODO Auto-generated method stub
		return o1.getValue().getStid().compareTo(o2.getValue().getStid());
	}

}
