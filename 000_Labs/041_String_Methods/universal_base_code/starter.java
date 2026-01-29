/*
 *	Author:  Andrew Miller
 *  Date: 12/4
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Print your First and Last name with a space between");
		String word = sc.nextLine();
		int r = word.indexOf(" ");
		System.out.println("");
		System.out.println("Your last name is:" + word.substring(r));
		
		
	}
}
