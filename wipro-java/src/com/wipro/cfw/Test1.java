package com.wipro.cfw;

public class Test1 {

	public static void main(String[] args) {
		/*
		 * //variable declaration int x[];
		 * 
		 * //initialize the variable- allocating the memory size
		 * 
		 * x = new int[3];
		 * 
		 * //assign the values
		 * 
		 * x[0]=10;x[1]=20;x[2]=30;x[3]=40;
		 */
		/*
		 * System.out.println(x[0]); 
		 * System.out.println(x[1]); 
		 * System.out.println(x[2]);
		 */
		
		int x[]= {10,20,30};
		
		/*
		 * for(int i=0;i<x.length;i++) {
		 *  System.out.println(x[i]); 
		 *  }
		 */
		
		int index = 0;
		
		for(int y:x)
		{
			System.out.println("Index:" + index + ", value:" + y);
			index++;
		}
		
	}
}
