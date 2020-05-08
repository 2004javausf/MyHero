package com.revature.design;

public class Driver {
	private static HondaFactory hf = new HondaFactory();
	public static void main(String[] args) {
		Car c1 = hf.makeCar("crv", "teal");
		Car c2 =hf.makeCar("civic", "chartruse");
		Car c3 = hf.makeCar("potato", "mauve");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
}
