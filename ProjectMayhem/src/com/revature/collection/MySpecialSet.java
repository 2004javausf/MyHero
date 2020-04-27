package com.revature.collection;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MySpecialSet {
	/*
	 * Collection Framework
	 * List, Set, Queue All interfaces in the Collection
	 * 
	 * Why?
	 * Array object within Java is limited. Mainly that the array is immutable and you're given not
	 * many methods to work with.
	 * 
	 * 
	 * Called a framework (more library), provides interfaces and classes that allow developers to more easily
	 * manage a group of objects.
	 * 
	 * Advantages:
	 * 		Reduces effort (provides data structure and algorithms for you)
	 * 		Increase performance
	 * 		Encourages software reuse
	 * 
	 * BUT! 
	 * 		convert primitive values into objects
	 * 		int -> Integer
	 * 		boolean -> Boolean
	 *		byte ->  Byte
	 *	
	 *		The process of converting a primitive data types into its Wrapper class is called boxing.
	 */
	
	/*
	 * What is a SET????
	 * 	Does not allow duplicate objects
	 * 	Does not in general guarantee insertion order
	 * 	Sets are equal if they contain the same elements.
	 * 
	 * HashSet:
	 * 		Maintains no order, stores in hash table, best performance
	 * 
	 * LinkedHashSet:
	 * 		Maintains insertion order, weaker performance
	 * 
	 * TreeSet: 
	 * 		Maintains value order, very slow performance
	 */
	
	 public static void main(String[] args) {
		 
//		 Set<Object> myFirstSet = new HashSet<Object>();
//		 
//		 myFirstSet.add("Hello There");
//		 System.out.println(myFirstSet.add("Peter Pan"));// returns a boolean when you use .add method
//		 System.out.println(myFirstSet.add("Peter Pan"));
//		 
//		 System.out.println(myFirstSet);
//		 
//		 Set<Object> myOtherSet = new HashSet<>();
//		 
//		 myOtherSet.add("Spice Girls");
//		 myOtherSet.add(12);
//		 
//		 myOtherSet.addAll(myFirstSet);// Adds in previous values from another set.
//		 myFirstSet = myOtherSet;// By reference, so other sets will change.
//		 
//		 System.out.println(myOtherSet);
//		 
//		 Set<RandomObject> randomSet = new HashSet<>();
//		 
//		 RandomObject rand1 = new RandomObject("Cameron");
//		 RandomObject rand2 = new RandomObject("Chad");
//		 
//		 randomSet.add(rand1);
//		 randomSet.add(rand2);
//		 
//		 System.out.println(randomSet);
//		 
		 //TreeSet: Will keep value order.
		 Set<Object> myFirstTreeSet = new TreeSet<>(); //Created a tree set
		 myFirstTreeSet.add(4);
		 myFirstTreeSet.add(2);
		 myFirstTreeSet.add(1);
		 myFirstTreeSet.add(37);
		 myFirstTreeSet.add(5);
		 myFirstTreeSet.add("apple"); // Uses a comparator so you can't have different types.
		 
		 System.out.println(myFirstTreeSet);
		 
		 //LinkedHashSet
//		 Set<Integer> myLinkedHashSet = new LinkedHashSet<>();//Preserves insertion order.
//		 
//		 myLinkedHashSet.add(12);
//		 myLinkedHashSet.add(23);
//		 myLinkedHashSet.add(34);
//		 
//		 System.out.println(myLinkedHashSet);
//		 
//		 //This is how you traverse Sets and pull which element you need.
//		 for(Integer num: myLinkedHashSet) {
//			 System.out.println(num);
//		 }
		 
	 }
	 
}
