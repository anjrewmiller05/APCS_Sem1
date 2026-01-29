/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int random;
		random = (int)(Math.random()*1000 + 1);
		
		System.out.println("Pick a number 1-1000:");
		int num = sc.nextInt();
		
		boolean x;
		x = (num == random);
		if (x) {
			System.out.println("Ur cheating you acually got it right 💀");
		}
		else if (num < random) {
			System.out.println("Ur number was smaller than the number \nThe number was " + random);
		}
		else if (num > random) {
			System.out.println("Ur number was bigger than the number \nThe number was " + random);
		}
	}
}
