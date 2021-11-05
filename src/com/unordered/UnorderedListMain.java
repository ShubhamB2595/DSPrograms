package com.unordered;

import java.util.Scanner;

/*
 * main method class
 */
public class UnorderedListMain {

	public static void main(String[] args) {
		
		MyLinkedList<String> mylist = new MyLinkedList<>();
		
		// adding data to list
		mylist.add("cat");
		mylist.add("dog");
		mylist.add("apple");
		mylist.add("cow");
		mylist.add("banana");
		
		//printing the data available in list
		mylist.print();
		
		/*
		 * asking user to enter the word
		 * if word available deleting and reprinting the list
		 * if not then adding to mylist and reprinting the list
		 */
		System.out.println("\n Enter word to search into list");
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		
		if(mylist.search(word)) {
			
			int pos1 = mylist.searchPosition(word);
			mylist.deletePosition(pos1);
		}
		else {
			System.out.println(word + " is not available into list, so adding to list \n");
			mylist.add(word);
		}
		
		System.out.println("New List");
		mylist.print();
		
		scan.close();
	}
	

}
