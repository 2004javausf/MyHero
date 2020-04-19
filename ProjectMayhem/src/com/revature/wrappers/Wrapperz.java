package com.revature.wrappers;

public class Wrapperz {
	/*
	 * These are wrapper classes of the primitive types
	 * Character - char
	 * Boolean - boolean
	 * Byte - byte
	 * Short - short
	 * Integer - int
	 * Long - long
	 * Float -float
	 * Double - double
	 */
	
	static int myInt = 3;
	static Integer myInteger = 5;
	static Double myDouble = 45.94;
	/* (Auto) boxing - implicit conversion from primitive type to wrapper class.
	 * (Auto) unboxing - implicit conversion from wrapper to primitive type.
	 * Both boxing and unboxing are expensive.
	 */
	
	public static int addEmUp(int a , int b) {
		return a + b;
	}
	public static Integer multiplyThem(Integer a, Integer b) {
		return a*b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addEmUp(myInt, myDouble.intValue()));//unboxing - conversion to primitive type
		System.out.println(multiplyThem(7, 4));// boxing - conversion to wrapper class.

	}

}
