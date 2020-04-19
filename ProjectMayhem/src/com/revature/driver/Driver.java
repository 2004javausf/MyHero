package com.revature.driver;


import com.revature.beans.Human;
//static import - this only grabs static members of the class.
//Fully qualified names would be: java.util.Date (basically the package name)

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
