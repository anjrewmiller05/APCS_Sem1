/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input an integer");
		int base = sc.nextInt();
		System.out.println("Intput another integer please");
		int range = sc.nextInt();
		
		while (range <= base) {
			System.out.println("Make your second integer smaller than the first\nInput another integer");
			range = sc.nextInt();
		}
		int random = (int)(Math.random()*((range+ 1)-base)+base);
		int random1 = (int)(Math.random()*((range+ 1)-base)+base);
		int random2 = (int)(Math.random()*((range+ 1)-base)+base);
		int random3 = (int)(Math.random()*((range+ 1)-base)+base);
		int random4 = (int)(Math.random()*((range+ 1)-base)+base);
	
		System.out.println(" ");
		System.out.println("Here are 5 number between " + base + " and " + range);
		System.out.println(random +", " + random1 + ", " + random2 + ", " + random3 + ", " + random4);
		
	}
}
