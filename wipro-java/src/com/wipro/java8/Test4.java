package com.wipro.java8;

import java.util.Scanner;
import java.util.function.Consumer;

public class Test4 {
//void accept(T t);
	public static void main(String[] args) {
		
      Consumer<String> consumer = x -> System.out.println("Mr." + x);
	
	  Scanner scanner = new Scanner(System.in);
	  
	  System.out.println("enter the candidate name");
	  
	  String candidateName = scanner.nextLine();
	  
	  consumer.accept(candidateName);
	}
}
