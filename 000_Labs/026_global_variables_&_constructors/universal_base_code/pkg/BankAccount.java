/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
String owner;
int balance;
int accnum;


public createacc() {
	owner = "unknown";
	balance = 0;
	accnum = accnum + 1;
	
}

public creatacc(String name) {
	owner = name;
	balance = 0;
	accnum = accnum + 1;
}

public createacc(String name, int b, int an) {
	owner = name;
	balance = b;
	accnum = an;
	
}


}