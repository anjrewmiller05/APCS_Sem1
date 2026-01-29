/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
String owner;
double balance;
int accountnumber;
static int nextaccnum = (int)(Math.random()*(100-49))+ 50;
boolean isActive;


public BankAccount() {
	owner = "unknown";
	balance = 0.0;
	accountnumber = nextaccnum;
	nextaccnum = nextaccnum + 1;
	isActive = false;
	
}

public BankAccount(String name) {
	owner = name;
	balance = 0.0;
	accountnumber = nextaccnum;
	nextaccnum = nextaccnum + 1;
	isActive = true;
}

public BankAccount(String name, double b) {
	owner = name;
	balance = b;
	accountnumber = nextaccnum;
	nextaccnum = nextaccnum + 1;
	isActive = true;
	
}
	// -------METHODS-------
public void printInfo() {
	System.out.println("Owner: " + owner);
	System.out.println("Account Number: " + nextaccnum);
	System.out.println("Balance: " + balance);
	System.out.println("Is Active? " + isActive);
}

public void checkBalance() {
	System.out.println(owner + "'s Balance = " + balance);
	
}

}