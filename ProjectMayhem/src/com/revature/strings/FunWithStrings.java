package com.revature.strings;

public class FunWithStrings {
	/*
	 * Strings!
	 * not char or character
	 * java.lang.String -- fully qualified class name:
	 * String literal is 0+ characters ex "" or String a = "Roll Tide"
	 * concatenate Strings w/ + or .concat("something")
	 * "goodbye" + "earth"
	 * String pool - collection of unique String literals in heap memory.
	 * String API has utility methods!
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String a = "Roll"; //This creates a new  reference in the string pool
//		System.out.println(a.hashCode());
//		a = a.concat(" Tizidee");
//		System.out.println(a);
//		System.out.println(a.hashCode());
//		String b = "Roll";
//		System.out.println(b.hashCode());
//		String c = "Roll"; // compiler searches string pool to see if this exists already.
//		System.out.println(c.hashCode());
		String d = new String("Roll");
		System.out.println(d.hashCode());
		System.out.println(d.charAt(3));
		
		/*
		 * String - String pool, immutable, thread safe (sychronized), fast
		 * String Builder - no string pool, mutable, not thread safe, fast
		 * String Buffer - no string pool, mutable, is thread safe, slow
		 */
		
		StringBuilder sb = new StringBuilder("Hey");
		System.out.println(sb);
		StringBuffer t = new StringBuffer("Woo");
		System.out.println(t);
	}

}
