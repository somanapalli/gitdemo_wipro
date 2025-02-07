package com.wipro.abstraction;

public interface i3 {
	public static void sum(int x, int y)
	{
		System.out.println(x+y);
	}
	
	public default void sub(int x, int y)
	{
		System.out.println(x-y);
	}

	
}
