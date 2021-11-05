package com.ordered;

import java.util.Scanner;

import com.unordered.MyLinkedList;

public class OrderedMain {

	public static void main(String[] args) {
		
		MyLinkedList<Integer> mylist = new MyLinkedList<>();
		
		// adding data to list
		mylist.add(12);
		mylist.add(15);
		mylist.add(10);
		mylist.add(8);
		mylist.add(17);
				
		//printing the data available in list
		mylist.print();
		
		//sorting and reprinting the data in list
		mylist.sortAsc();
		System.out.println("\n Data after sorting");
		mylist.print();
		
		/*
		 * asking user to enter the number
		 * if number available deleting and reprinting the list
		 * if not then adding to mylist and reprinting the list
		 */
		System.out.println("\n Enter number to search into list");
		Scanner scan = new Scanner(System.in);
		Integer num = scan.nextInt();
				
		if(mylist.search(num)) {
					
			int pos1 = mylist.searchPosition(num);
			mylist.deletePosition(pos1);
		}
		else {
			System.out.println(num + " is not available into list, so adding to list \n");
			mylist.add(num);
		}
		
		System.out.println("New List: ");
		mylist.sortAsc();
		mylist.print();
				
		scan.close();

	}

}
