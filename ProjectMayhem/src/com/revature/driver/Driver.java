package com.revature.driver;

import com.revature.beans.Human;

public class Driver {
	//single line comment
	public static void main(String[] args) {
		System.out.println("Go Raiders");
		
		Human h = new Human();
		h.setName("Jordan");
		h.setAge(27);
		h.setWeight(145);
		System.out.println(h.getName());
		
	}
}
