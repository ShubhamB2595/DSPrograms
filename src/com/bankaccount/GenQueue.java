package com.bankaccount;

import java.util.Scanner;

public class GenQueue<T> {

	Node front = null;
	Node rear = null;
	
	class Node {
		
		T data;
		Node next;
		
		Node(T data) {
			this.data = data;
			this.next = null;
		}
	}

	//declaration
	static double balance = 100000;
	double amount;
	Scanner scan = new Scanner(System.in);
	
	//method to adding data to queue
	void enqueue(T data) {
		
		Node newnode = new Node(data);
		
		if(front == null) {
			front = newnode;
			rear = newnode;
		}
		else {
			rear.next = newnode;
			rear =newnode;
		}
	}
	
	//method to display the data from queue
	void display() {
		
		Node temp = front;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	//method to deleting first element from queue
	void dequeue() {
			
		if(front == null) {
			System.out.println("Queue is empty");
		}
		else {
			front = front.next;
		}
	}

	//method to deposit cash
	public void deposit() {
		System.out.println("Welcome to deposit counter");
		System.out.println("Enter amount to deposit");
		amount = scan.nextDouble();
		
		balance = balance + amount;
		System.out.println(amount + " Successfully deposited");
		dequeue();
	}
	
	//method to deposit cash
	public void withdraw() {
		System.out.println("Welcome to withdraw counter");
		System.out.println("Enter amount to withdraw");
		amount = scan.nextDouble();
			
		balance = balance - amount;
		System.out.println(amount + " Successfully withdrawed");
		dequeue();
	}
	
	
	
	public static double getBalance() {
		return balance;
	}

	//Constructor
	public GenQueue() {
		
	}

}
