package com.revature.classtypes;
	/* Special class that can't be instantiated. -- Can't create an object of this class.
	 * They will contain at least 1 abstract method.
	 * Can contain concrete methods.
	 * "contract based" - abstract methods MUST be overridden in sub-class.
	 */
public abstract class Animal {
	//abstract method
	public abstract void breathe();
}
