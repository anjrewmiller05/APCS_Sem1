/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	String name;
	double balance;
	int accountnumber;
	boolean status;

	// -------CONSTRUCTORS-------
	public BankAccount() {
		name = "unknown";
		balance = 0;
		accountnumber = 645;
		status = false;
	}
	
	public BankAccount(String n) {
		name = n;
		balance = 0;
		accountnumber = 646;
		status = true;
	}
	
	public BankAccount(String n, double b) {
		name = n;
		balance = b;
		accountnumber = 647;
		status = true;
	}

	// -------METHODS-------
	public void displayAccountInfo() {
		System.out.println("Account name: " + name);
		System.out.println("Balance: " + balance);
		System.out.println("Account Number: " + accountnumber);
		System.out.println("Active? " + status);
	}
	
	public String setOwner(String n) {
		name = n;
		return n;
	}
	
	public String getOwner() {
		return name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double deposit(double d) {
		balance = balance + d;
		return balance;
	}
	
	public void withdraw(double w) {
		if (balance >= w) {
			balance = balance - w;
			System.out.println("New balance for " + name + " is " + balance);
		}
		else {
			System.out.println(name + " doesn't have that much money!");
		}
	}
	
	public void checkBalance() {
		System.out.println("Balance of " + name + "'s account is " + balance);
	}
	
	public void closeAccount() {
		status = false;
		System.out.println(name + "'s account has been closed!");
	}
	
	
}