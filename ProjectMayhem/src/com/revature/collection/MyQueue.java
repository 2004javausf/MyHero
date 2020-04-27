package com.revature.collection;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class MyQueue {
	/*
	 * Ordered list of objects related to insertion order
	 * 
	 * Follows the 
	 * 	First-In-First-Out (FIFO) principle.
	 * 		-OR-
	 *  First-In-Last-Out(FIFO or LIFO) -- Stack
	 * 
	 * Methods:
	 * 		poll, remove, peek, and element.
	 * 
	 * The Poll and Remove will return the first element in the queue
	 * and then delete it from the queue. However if the collection is EMPTY, 
	 * REMOVE  will throw an exception.
	 * 
	 * The PEEK and ELEMENT allow you to see the first element. HOWEVER; if the queue is empty
	 * then ELEMENT will throw an exception.
	 * 
	 */
	
	public static void main(String[] args) {
		
		Queue<String> myFirstQueue = new LinkedList<>();
		Queue<String> linkedList = new PriorityQueue<>();//Preserves insertion order
		Queue<String> 	deque = new ArrayDeque<>();
		List<String> myStack = new Stack<>();
		
		myFirstQueue.add("Peter Pan");
		myFirstQueue.add("Captain Hook");
		myFirstQueue.add("Megan Thee Stallion");
		
		System.out.println(myFirstQueue);
		
		System.out.println(myFirstQueue.peek());
		System.out.println(myFirstQueue.element());
		
		
	}
}
