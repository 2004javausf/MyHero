package com.revature.iterate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {
	/*
	 * Iterator
	 * Anything that can be used as the subject of a for each loop uses an iterator
	 * AKA they implement the Iterable interface
	 * Every collection has an iterator that allows traversal between elements and
	 * allows safe removal of elements in place.
	 */
	public static void main(String[] args) {
		//create an ArrayList
		List<String> al = new ArrayList<>();
		//add elements
		al.add("C");
		al.add("D");
		al.add("A");
		al.add("G");
		al.add("B");
		al.add("F");
		al.add("E");
		//use the iterator to display the contents of al.
		System.out.println("Original contents of al: ");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			String element = itr.next();
			System.out.println(element + " ");
		}
		
		//Modify objects being iterated
		ListIterator<String> litr = al.listIterator();
		while(litr.hasNext()) {
			String element = litr.next();
			litr.set(element + " + ");
		}
		
		System.out.println("\nModified Contents of al: ");
		itr = al.iterator();
		while(itr.hasNext()) {
			String element = itr.next();
			System.out.println(element + " ");
		}
		
		//Display the List Backwards
		System.out.println("\n Modified list backwards");
		while(litr.hasPrevious()) {
			String element = litr.previous();
			System.out.println(element + "  ");
		}
		
	}
}
