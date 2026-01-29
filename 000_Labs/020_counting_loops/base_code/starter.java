/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int x = 1;
		System.out.println("What is your name?");
		String name = sc.nextLine();
		
		System.out.println("What is you favorite number?");
		int num = sc.nextInt();
		
		while (x <= num) {
			System.out.println(x + ". " + name);
			x = x + 1;
		}
		



		
	}
}
