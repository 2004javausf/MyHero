package com.revature.varargs;

public class FunWithVarargs {
	/*
	 * Variable Length Arguments
	 * Method that will take a variable number of arguments.
	 * Automates and hides the process of creating and saving the values into an array prior
	 * to invoking the method.
	 * VarArg MUST be the last argument
	 * Can be of any type
	 */

	
	public static void vaTest(int ... v) {
		System.out.print("Number of Arfs is: " + v.length + " the contents are as such: ");
		for(int num: v) {
			System.out.print(num + " ");
		}
	}
	
	public static void main(String[] args) {
		vaTest(10, 5 , 6);//Can take in any amount of args as long as they are the last set of arguments.
		System.out.println();
		vaTest(1,2,3,4, 5, 8, 54, 67, 12);
		System.out.println();
		vaTest();//Will still work.
	}
}
