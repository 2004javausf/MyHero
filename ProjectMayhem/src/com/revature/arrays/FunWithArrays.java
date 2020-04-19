package com.revature.arrays;

import java.util.Arrays;

public class FunWithArrays {
	/*
	 * Arrays are a group of like-typed variables that referred by a common name.
	 */
	public static void main(String[] args) {
		//int array w/6 "buckets"
		int [] myArray = new int[6];
		// can change the values within the array, but you cannot change the length. The lengths are fixed.
		
		
		int [] chaos = {22, 345, 3432, 537, 2089, 211, 322, 123,234,365, 1000};
		chaos[5] = 99;
		//System.out.println(chaos[5]);
//		
//		for(int i =0; i < myArray.length; i++) {
//			myArray[i] = i * 4;
//		}
//		
//		for(int num: myArray) {
//			System.out.println("The number is: " + num);
//		}
		Arrays.sort(chaos);
		for(int num: chaos) {
			System.out.println(num);
		}
		System.out.println(Arrays.toString(chaos));

	}

}
