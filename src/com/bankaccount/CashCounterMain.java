package com.bankaccount;

import java.util.Scanner;

public class CashCounterMain {
	


	public static void main(String[] args) {
		
		/*
		 * Cash Deposit
		 * Cash Withdraw
		 * Checking Cash
		 * Peoples in Queue
		 */
		
		GenQueue<Integer> myQueue = new GenQueue<>();
		
        Scanner scan = new Scanner(System.in);
		
		while(true)
	    {
	         System.out.println("\n	Choose Option ") ;
	         System.out.println("1.	Deposit ") ;
	         System.out.println("2.	Withdraw ") ;
	         System.out.println("3.	People in Queue ") ;
	         System.out.println("4.	User will see cash at Counter ") ;
	         System.out.println("5.	Exit ");

	         int choice = scan.nextInt();
	         
	         switch(choice)
	         {
	             case 1:
	            	 myQueue.enqueue(choice);
	            	 myQueue.deposit();
	                 break;
	             case 2:
	            	 myQueue.enqueue(choice);
	            	 myQueue.withdraw();
	                 break;
	             case 3:
	            	 myQueue.display();
	                 break;
	             case 4:
	            	 System.out.println("Cash available: " + GenQueue.getBalance());
	            	 break;
	             case 5:
	            	 System.out.println("Closing");
	            	 System.exit(1);
	            	 break;
	             default : System.out.println("Invalid Key Pressed..!!!");
	             
	         }
	    }
	
	}

}
