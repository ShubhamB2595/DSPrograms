package com.unordered;
/*
 * class for maintaining the linked list operations
 */
public class MyLinkedList < T extends Comparable<T> >{

	Node<T> head;
	
	// class for operations of Linked List
	class Node <T extends Comparable<T>> {
		T data;
		Node<T> next;
		
		//Constructor for class Node
		public Node(T data) {
			super();
			this.data = data;
			next = null;
		}	
	}
	
	//constructor for class MyLinkedList
	public MyLinkedList() {
		
		head = null;
	}
	
	//method for adding the data to linked list
	public void add(T data) {
			
		Node<T> toAdd = new Node<T>(data);
		
		if(isEmpty()) {
			head = toAdd;
			return;
		}
		else {
			Node<T> temp = head;
				
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = toAdd;
		}
	}
		
	//method for printing the linked list data
	public void print(){
			
		if(isEmpty()) {
			System.out.println("Linked list is Empty");
			return;
		}
		else {
			Node<T> temp = head;
				
			while(temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
		}
	}
	
	// method for checking head is null
	boolean isEmpty() {
			
		if(head == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//method for deleting element as specific position
	public void deletePosition(int pos) {
					
		if(isEmpty()) {
			System.out.println("Linked list is Empty");
			return;
		}
		else {
			Node<T> temp = head;
			Node<T> temp1 = temp.next;
				
			for(int i=0; i<pos-1; i++) {
				temp = temp1;
				temp1 = temp1.next;
			}
			temp.next = temp1.next;
		}
	}
	
	//method for searching the data and its position
	public int searchPosition(T data) {
			
		if(isEmpty()) {
			System.out.println("Linked list is Empty");
		}
		else {
			Node<T> temp = head;
			int index = 0;
			while(temp != null) {
				if(data == temp.data) {
					System.out.println("Position for data: " + data + " at index: " + index);
					return index;
				}
				else {
					index++;
					temp = temp.next;
				}
			}
		}
		return -1;
	}
	
	//method for searching the data and its position
	public boolean search(T data) {
				
		if(isEmpty()) {
			System.out.println("Linked list is Empty");
			return false;
		}
		else {
			Node<T> temp = head;
			while(temp != null) {
				if(data == temp.data) {
					return true;
				}
				else {
					temp = temp.next;
				}
			}
		}
		return false;
	}
	
	//method to insert the data into list
	public void insert(T data) {
		
		if(search(data)) {
			int pos = searchPosition(data);
			deletePosition(pos);
		}
		else {
			add(data);
		}
	}
}
