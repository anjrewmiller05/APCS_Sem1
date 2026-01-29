/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		BankAccount x = new BankAccount();
		
		System.out.println("Welcome to the G.O.A.T Bank\nWhat info do we know?\n1. Nother\n2. Owner\n3.Owner, and Deposite");
		int num67 = sc.nextInt();
		sc.nextLine();
		if (num67 == 1) {
			System.out.println("----------------------------------------------------");
			BankAccount goon = new BankAccount();
			goon.printInfo();
			
			System.out.println( );
			System.out.println("Would you like to check your balance?(1 = yes, 2 = no)");
			int ball = sc.nextInt();
			if (ball == 1) {
					goon.checkBalance();
			}
			
			System.out.println("Thanks for creating an account!");
		}
		else if(num67 == 2) {
			System.out.println("What name would you like to register?");
			String name = sc.nextLine();
			System.out.println("----------------------------------------------------");
			BankAccount buns = new BankAccount(name);
			buns.printInfo();
			
			System.out.println( );
			System.out.println("Would you like to check your balance?(1 = yes, 2 = no)");
			int ball = sc.nextInt();
			if (ball == 1) {
				buns.checkBalance();
			}
			
			System.out.println("Thanks for creating an account!");
		}
		else if(num67 == 3) {
			System.out.println("What is the name you want to register?");
			String name = sc.nextLine();
			System.out.println("What is your balance?");
			double bal = sc.nextInt();
			System.out.println("----------------------------------------------------");
			BankAccount Andrew = new BankAccount(name, bal);
			Andrew.printInfo();
			System.out.println( );
			System.out.println("Would you like to check your balance?(1 = yes, 2 = no)");
			int ball = sc.nextInt();
			if (ball == 1) {
				Andrew.checkBalance();
			}
			
			System.out.println("Thanks for creating an account!");
		}
		
	}
}
