package com.revature.design;

//Factories create an object w/o exposing creation logic to the client
public class HondaFactory {
	/*
	 * use a "factory" method to return a Car Model based on 
	 * what String is given
	 * if the method is given a parameter of something besides 
	 * crv or civic, it will return null.
	 */
	
	public Car makeCar(String whatCar, String color) {
		if("civic".equalsIgnoreCase(whatCar)) {
			return new Car("Honda", 2020, "Civic", color);
		}else if("crv".equalsIgnoreCase(whatCar)) {
			return new Car("Honda", 2020, "CRV", color);
		}else {
			return null;
		}
	}
}
