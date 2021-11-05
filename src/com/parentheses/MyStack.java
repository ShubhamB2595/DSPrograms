package com.parentheses;

import java.util.Stack;

public class MyStack {

	Stack<Character> mystack = new Stack<>();

	//method for checking the given parentheses is valid or not
	public boolean isValid(String str) {
		
		for(int i=0; i<str.length(); i++) {
			
			char current = str.charAt(i);
			
			if(current == '(') {
				mystack.push(current);
			}
			if(current == ')') {
				if(mystack.isEmpty()) {
					return false;
				}
				
				char last = mystack.peek();
				if(current == ')' && last == '(') {
					mystack.pop(); 	
				}
				else {
					return false;
				}	
			}
		}
		
		if(mystack.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//constructor
	public MyStack() {
		
	}

}
