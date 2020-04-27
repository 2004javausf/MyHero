package com.revature.generics;

public class NextGen {
	public static void main(String[] args) {
		//Create a Gen1 reference for Integers
		Gen1<Integer> i;
		i = new Gen1<Integer>(88);
		// show type
		i.showType();
		
		//get value
		int v = i.getObj();
		System.out.println(v);
		
		
		Gen1<String> s = new Gen1<String>("Generics Test");
		s.showType();
		String str = s.getObj();
		System.out.println(str + " is the value");
		
	}
}
