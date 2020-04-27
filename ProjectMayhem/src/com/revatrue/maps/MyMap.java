package com.revatrue.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MyMap {
	
	/*
	 * Consists of key/value pair.
	 * Each key has to be unique and can be only mapped to one value.
	 * A key can be mapped to a duplicate value
	 * 
	 * 
	 * Methods
	 * 	Basic Operations:
	 * 		put, get, remove, containsKey, containsValue, size, and empty.
	 * 	
	 * Bulk Operations:
	 * 		putAll, clear
	 * 	
	 * Collection Views:
	 * 		keySet, entrySet, and values.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> myMap = new HashMap<>();
		/*
		 * It allows duplicate values, but not duplicate keys.
		 * Allows a single null key, and it allows multiple null values.
		 * Does not guarantee order.
		 */
		Map<String, Integer> treeMap = new TreeMap<>();
		/*
		 * Does not allow null keys, but does allow null values.
		 * Sorted according to the natural ordering of the keys.
		 * 
		 */
		Map<String, String> linkedHashMap = new LinkedHashMap<>();
		/*
		 * It maintains insertion order
		 */
		
		myMap.put(1, "This is the first values");
		myMap.put(1, "Here's another value. Let's see if it overrides");
		myMap.put(2, "This is the second most important value");
		System.out.println(myMap);
		
		//If you want to iterate through the Hash Map Keys
		//You have to create a set, then...
		Set<Integer> myKeySet = myMap.keySet();//<<<
		
		for(Integer i: myKeySet) {
			//Iterate through the set
			System.out.println(myMap.get(i));
		}
		
		//If you want to iterate through the Hash Map K,V
		Set<Entry<Integer, String>> myPairs = myMap.entrySet();
		
		for(Entry<Integer, String> i: myPairs) {
			System.out.println(i);
		}
		
	}

}
