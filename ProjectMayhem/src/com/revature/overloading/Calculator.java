package com.revature.overloading;

public class Calculator {
	static int a;
	static double b;

	public static void main(String[] args) {
		a = 5;
		b = a;
		b = 3.1;
		a = (int)b;
		Double d = 3.45;
		Integer e = 5;
//		System.out.println(b);
//		System.out.println(a);
		add(3,6);
		add(4.3, 5.7);
		add(2,3,4);
		add(2,3,4,5,6,7,6);
		add(d, 7.1);

	}
	//PARAMETRIC POLYMORPHISM
	// \/ \/ \/ \/
	
//The first method 'add' being written
	public static int add(int a, int b) {
		System.out.println("This is the 1st");
		System.out.println(a+b);
		return a+b;
	}
//	The first method 'add' is being overloaded because the return type is different
//	 and the parameters are switched to double. You could also input more parameters and that
//	 would also be a way to overload.
	public static double add(double a, double b) {
		System.out.println("This is the 2nd");
	 System.out.println(a+b);
	 return a + b;
	}
//Added more parameters which overloaded the previous 'add' method.
	public static int add(int a, int b, int c) {
		System.out.println("This is the 3rd");
		System.out.println(a+b+c);
		return a+b+c;
	}
	
	public static int add(int ... a) {
		System.out.println("This is the 4th");
		int sum = 0;
		for(int num: a) {
			sum += num;
		}
		System.out.println(sum);
		return sum;
	}

}
