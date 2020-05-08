package com.revature.design;

public class Singleton {
	/*
	 * Sjngleton Design Pattern
	 * Ensure a class has only one instance and provides global access to it.
	 * 
	 * private static instance of itself
	 * 
	 */
	
	//private static instance of itself
	private static Singleton instance;
	
	//private constructor
	private Singleton() {
		//logic here
	}
	
	//Static method to get the unique instance - if it does not exists, we create it.
	public static synchronized Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public void doSomething() {
		//logic - what the object should do.
	}
	
	
	//Heap holds on the object
	//The stack holds the reference
}
