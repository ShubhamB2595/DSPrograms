package com.hashing;

import java.util.HashMap;

public class HashClass {
	
	void hashing(int[] num) {
		HashMap<Integer, Integer> myMap = new HashMap<>();
		
		int rem;
		for(int i=0; i<num.length; i++) {
			rem = num[i] % 10;
			System.out.println(rem);
			myMap.put(rem, num[i]);
			System.out.println(myMap);
		}	
	}
	
	
	public HashClass() {
		
	}
	

}
