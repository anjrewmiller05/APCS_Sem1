/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = sc.nextLine();
		
		System.out.println("What is your age?");
		int age = sc.nextInt();
		
		System.out.println("What month were you born? (1-12)");
		int month = sc.nextInt();
		
		System.out.println("What day in the month were you born? (1-31)");
		int day = sc.nextInt();
		
		System.out.println("What year were you born?");
		int year = sc.nextInt();
		
		System.out.println("If you have a dollar and two quarters, how much money do you have? (ex: 7.75)");
		double money = sc.nextDouble();
		
		System.out.println(" ");
		System.out.println(name + " was born on " + month + "/" + day + "/" + year);
		System.out.println("You are " + age + " years old!");
		System.out.println("You have $" + money + " in your wallet!");
	}
}
