package com.revature.constructor;

public class ConstructorDemo extends D {
	
	/*Constructors
	 * how we instantiate an object 
	 * No return type but it does return the object that it created.
	 * super() calls the parent class.
	 */
	public static void main(String[] args) {
		System.out.println("In main");
		C c = new C();
//		
	}

}

class A{
	{System.out.println("A's instance code block");}
	public A() {
		System.out.println("Inside A's constructor");
	}
}

class B extends A{
	static {System.out.println("Inside B's static code block");}
	public B() {
		System.out.println("Inside B's constructor");
	}
}

class C extends B{
	
 static	{System.out.println("Inside C's static block");}
	public C(){
		System.out.println("Inside C's constructor");
	}
}

class D{
	static{System.out.println("D's static code block");}
	D(){
		System.out.println("Inside D's constructor");
	}
}