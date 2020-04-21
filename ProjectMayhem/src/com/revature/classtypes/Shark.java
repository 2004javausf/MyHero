package com.revature.classtypes;
/*
 * 
 */
public class Shark extends Fish implements Hunt{
	
	@Override
	public void swim() {
		// implement method
		System.out.println("I'm swimming under water and I'm teriffying");
	}
	
	@Override
	public void breathe() {
		System.out.println("I breathe underwater, meeeeeeehh");
	}
	
	@Override
	public void findPrey() {
		System.out.println("I ate fishes!");
	}
}
