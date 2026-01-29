/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("What is your name dear traveler?");
		String name = sc.nextLine();
		System.out.println("What is your title? (ex: Slayer of Dragons)");
		String title = sc.nextLine();
		
		System.out.println("Would you like to be a Rogue, Wizard, or Warrior?");
		String clas = sc.nextLine();
		
		if ((clas.equals("rogue")) || (clas.equals("Rogue"))) {
			System.out.println("You have chosen to be a Rogue! Stealthy!");
		}
		else if ((clas.equals("warrior")) || (clas.equals("Warrior"))) {
			System.out.println("You have chosen to be a Warrior! Charge!");
		}
		else if ((clas.equals("wizard")) || (clas.equals("Wizard"))) {
			System.out.println("You have chosen to be a Wizard! Exquisite!");
		}
		else {
			System.out.println("You have not chosen a role. Rerun program.");
		}
		
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
		
		System.out.println("Choose your strength level (1-10)");
		int strength = sc.nextInt();
		while (strength > 10) {
			System.out.println("You must put a number 1-10");
			strength = sc.nextInt();
		}
		
		
		System.out.println("You have " + (20-strength) + " points left to spend");
		System.out.println("Choose your dexterity level (1-10)");
		int dexterity = sc.nextInt();
		while (dexterity > 10) {
			System.out.println("You must put a number 1-10");
			dexterity = sc.nextInt();
		}
		
		System.out.println("You have " + (20-strength-dexterity) + " points left to spend");
		System.out.println("Choose your intelligence level (1-10)");
		int intelligence = sc.nextInt();
		while (intelligence > 10) {
			System.out.println("You must put a number 1-10");
			intelligence = sc.nextInt();
		}
		while ((intelligence+strength+dexterity)>20) {
			System.out.println("Your points spent is over 20\nIntput a lower value");
			intelligence = sc.nextInt();
		}
		
		System.out.println("You have " + (20-strength-intelligence-dexterity) + " points left to spend");
		System.out.println("Choose your Charisma level (1-10)");
		int rizz = sc.nextInt();
		while (rizz > 10) {
			System.out.println("You must put a number 1-10");
			rizz = sc.nextInt();
		}
		while ((intelligence+strength+dexterity+rizz)>20) {
			System.out.println("Your points spent is over 20\nIntput a lower value");
			rizz = sc.nextInt();
		}
		
		System.out.println(" ");
		System.out.println("-----------------------------------------------------------");
		System.out.println(" ");
		System.out.println("You are " + name + " and are a " + clas);
		System.out.println("You are the " + title + " of CVHS");
		System.out.println("You have the following stats:");
		System.out.println("Strength: " + strength);
		System.out.println("Dexterity: " + dexterity);
		System.out.println("Intelligence: " + intelligence);
		System.out.println("Charisma: " + rizz);
	}
}
