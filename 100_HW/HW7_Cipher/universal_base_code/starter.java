/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a message to Encrypt:");
		String message = sc.nextLine();
		System.out.println("How many digits would you like to shift by?");
		int num = sc.nextInt();
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Here is your encrypted message!");
		System.out.println(Cipher.keyedEncode(message,num));
		

	}
}
