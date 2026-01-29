/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Dog test = new Dog();
		System.out.println("What is your dog's name?");
		String namme = sc.nextLine();
		System.out.println("What is your dog's age?");
		int agge = sc.nextInt();
		
		Dog a = new Dog(namme, agge);
		
		a.printAge();
		test.printAge();
		
		a.Sleeping();
		test.Sleepingtoo();
	}
}
