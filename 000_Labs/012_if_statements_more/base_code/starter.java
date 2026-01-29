/*
 *	Author: Andrew Miller
 *  Date: 9/9/25
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Give me ur first number: ");
		int x = sc.nextInt();
		System.out.println("Give me another number: ");
		int y = sc.nextInt();
		
		boolean diff;
		diff = (x!=y);
		if(diff)
		{
			System.out.println("Your variables are different!");
		}
		else
		{
			System.out.println("Your variables are the same!");
		}
		
		
		
	}
}
