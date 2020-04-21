package com.revature.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyList {
	/*
	 * List
	 * 	A list is indexed
	 * 	Allows duplicates
	 * 	An ordered sequence
	 */
	
	public static void main(String[] args) {
		List<String> myFirstList = new ArrayList<>();
		myFirstList.add("HI");
		myFirstList.add("my");
		myFirstList.add("name");
		myFirstList.add("is");
		myFirstList.add("Jordan");
		
		System.out.println(myFirstList);
		System.out.println(myFirstList.get(2));
		myFirstList.set(2, "inserted another string");
		System.out.println(myFirstList);
		
		List<String> myOtherList = new LinkedList<>();
		myOtherList.addAll(myFirstList);
		System.out.println(myOtherList);
		
		System.out.println(myFirstList.subList(2, 3));
		
		//Linked List is only good, if you're adding and removing a lot of elements
		//Array List is more efficient overall.
		
		/*
		 * Access via index (positional access): interact with the elements based on their position in the ArrayList
		 * 							get, set, add, addAll, and remove
		 */
		
		myOtherList.get(2);
		myOtherList.set(1, "Whatever I type");
		System.out.println(myOtherList);
		myOtherList.add(2, "My addded element");
		myOtherList.add("This should be added to the end");
		System.out.println(myOtherList);
		
		/*
		 * Search: find a specified object in the list and return its position.
		 * 				indexOf(); 
		 * 				lastIndexOf();
		 * If obj does not exist then it will return a -1
		 */
		
		
		/*
		 * Range view methods: 
		 * 		sublist();
		 * 
		 */
		
		System.out.println(myOtherList.subList(1, 4));//First index is inclusive and the last index is exclusive.
	}
}
