package com.revature.beans;
import com.revature.classtypes.Hunt;

public class Human implements Hunt {
	
	/*
	 * Members of a class - couple of forms.
	 * Instance variables- property of a specific object (human's name)
	 * Static variables - property of the class shared by all of it's instances
	 * Instance methods - behavior relative to a specific object.
	 * Static methods - behavior relative to entire class.
	 * constructor - instantiates the class using the keyword "new"
	 * 
	 * Code Blocks - {things between}
	 * 
	 * 	 */
	
	//Instance code block run during instantiation.
	{System.out.println("I'm in an instance code block");}
	
	//Static code block *on load into the compiler, the static block will go ahead and run first.
	static {System.out.println("I'm in the static code block instance");}
	
	String name;
	int age;
	int weight;
	

	
	public Human (String name, int age, int weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	public Human () {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void findPrey() {
		System.out.println("I'm going to get groceries tonight!");
	}
	
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}
	
	
	
	
}
