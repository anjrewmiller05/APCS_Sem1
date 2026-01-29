/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your base number?");
		int base = sc.nextInt();
		
		System.out.println("What is your exponent?");
		int exponent = sc.nextInt();
		
		System.out.println("This is your final number: " + (int)exponent(base, exponent));
	}
	public static double exponent(int a, int b) {
		double finall;
		finall = Math.pow(a,b);
		finall = (int)finall;
		return finall;
	}
}
