package com.parentheses;
/*
 * main method class
 */

public class ParenthesesChecker {

	public static void main(String[] args) {

		//declaring the string
		String myString = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
		
		//checking the parentheses is balance or not and printing the result
		MyStack checker = new MyStack();
		
		if(checker.isValid(myString)) {
			System.out.println(myString + " Is valid Parentheses");
		}
		else {
			System.out.println(myString + " Is Invalid Parentheses");
		}
		
	}

}
