package com.revature.threadz;

import java.util.Iterator;

public class ThreadDemo {
	/*2 ways to spin up a thread
	 * 1. Extend the thread class
	 * 2. Implement Runnable and overwrite Run()
	 */
	public static void main(String[] args) {
		//List<Type> = new ArrayList<>();
		//Thread State-new
		Thread extendThread = new ExtendThread();
		Thread implementThread = new Thread(new ImplementRunnable());
		
		//Setting priority
		implementThread.setPriority(10);
		//Thread State - start
		extendThread.start();
		implementThread.start();
		
		
		for (int i = 0; i < 100; i++) {
			System.out.println("Hey-Driver");
		}
	}

}
