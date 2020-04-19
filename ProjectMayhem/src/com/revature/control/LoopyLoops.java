package com.revature.control;

public class LoopyLoops {
	/*If Statement
	 * for decision making
	 * providing multiple paths of execution.
	 * 
	 * Switch Case
	 * 
	 * 
	 * 
	 * For Loops
	 * for(a;b;c;){do something}
	 * a is variable declaration (counter)
	 * b is the condition that controls how far the loop will go
	 * c is the incrementor/decrementor
	 * 
	 */
//==========================================================
//	* Enhanced For Loop
//	 * for(<Type> word: <Array or Collection>){do something}
//	 * good for moving through collections, arrays and other iterable
//	 * more CPU efficient
//	 * no issues w/index out of bound - not size dependent
//	 * good for access elements in one collection
//	 * bad for adding and removing
//	 * 
//	 */
//	
	static int [] myArray = {11, 33, 44, 5, 77, 22, 66, 243};
	
	public static void forEachFun(int [] a) {
		for(int i:a) {
			System.out.println(i);
		}
	}
//============================================================	
	/*
	 * While Loops
	 * while(<condition>) {do something}
	 * 
	 * do while
	 * do {<do thing>} while (<condition>);
	 */

	public static void wileyWhile(int i) {
		while(i < 10) {
			System.out.println("Boring");
			i++;
		}
	}
	
	public static void doWileyWhile(int i) {
		do { 
			System.out.println("not so boring" + i);
		} while( i++ < 10);
	}
//============================================================	
	/* Conditionals
	 * Logical Operators
	 * < > <= >= != ==
	 * 
	 * "OR"
	 * a|b - bit wise
	 * a||b - short circuit OR If a is true, return w/o b
	 * 
	 * "AND"
	 * a&b - bit wise
	 * a&&b checks both and evaluates true if both are true
	 * 
	 * "EQUALS"
	 * ==
	 * compares values of primitives
	 * compare the reference for objects. NOT THE CONTENTS
	 * != is good for checking nulls
	 * .equals()
	 * method inherited Object
	 * All reference types have it looking at content
	 */

//============================================================	
	//DRIVER MAIN
	public static void main(String[] args) {
		//forEachFun(myArray);
		//wileyWhile(3);
		doWileyWhile(2);
	}

}
