package com.wipro.cfw;

import java.util.PriorityQueue;
import java.util.Queue;

public class Test4 {

	public static void main(String[] args) {
		
		//create a PriorityQueu
		Queue<Integer> priorityQueue = new PriorityQueue<>();
		//add the element to the queue
		
		priorityQueue.add(30);
		priorityQueue.add(10);
		priorityQueue.add(20);
		
		//display the queue
		
		System.out.println(priorityQueue);
		
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue);
		
		System.out.println(priorityQueue.peek());
		System.out.println(priorityQueue);
		
		
		
	}
}
