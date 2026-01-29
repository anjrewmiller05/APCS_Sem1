/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = sc.nextLine();
		
		for(int x = 0; x<word.length(); x++) {
			String r = word.substring(x, x+1);
			System.out.println(x + ":  " + r);
		}
	}
}
