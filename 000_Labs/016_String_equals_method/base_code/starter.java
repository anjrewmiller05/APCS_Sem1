/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Would you like to be a Rogue, Wizard, or Warrior?");
		String clas = sc.nextLine();
		
		if ((clas.equals("rogue")) || (clas.equals("Rogue"))) {
			System.out.println("You have chosen to be a Rogue! Stealthy!");
		}
		else if ((clas.equals("warrior")) || (clas.equals("Warrior"))) {
			System.out.println("You have chosen to be a Warrior! Charge!");
		}
		else if ((clas.equals("wizard")) || (clas.equals("Wizard"))) {
			System.out.print("You have chosen to be a Wizard! Exquisite!");
		}
		else {
			System.out.println("You have not chosen a role. Rerun program.");
		}
	}
}
