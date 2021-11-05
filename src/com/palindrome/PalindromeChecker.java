package com.palindrome;

import java.util.Deque;
import java.util.LinkedList;

public class PalindromeChecker {

		static Deque<Character> my = new LinkedList<>(); 
		
		//method for checking is string palindrome or not
		public String isPalindrome(String str) {
		
		char first, last;
			for(int i=0; i<str.length(); i++) {
				my.add(str.charAt(i));
			}
		
			for(int i=0; i<my.size(); i++) {
				first = str.charAt(i);
				last = my.removeLast();
				
				if(first != last) {
					return str + " is not Palindrome";
				}
			}
			return str + " is Palindrome";
			
		}

}
