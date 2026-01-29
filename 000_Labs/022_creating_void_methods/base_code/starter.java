/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input a sentence por favor");
		String sen1 = sc.nextLine();
		System.out.println("Input a sentence por favor");
		String sen2 = sc.nextLine();
		
		System.out.println("This is using the methods!");
		gond(sen1);
		gang(sen1, sen2);


		
	}
	public static void gond(String String1) {
		System.out.println(String1);
	}
	public static void gang(String String1, String String2) {
		System.out.println(String1 + String2);
	}
}
