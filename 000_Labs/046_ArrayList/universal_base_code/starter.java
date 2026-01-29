/*
 *	Author: Andrew Miller 
 *  Date: 1/29/26
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many cookies would you like?");
		int cookies = sc.nextInt();
		sc.nextLine();
		ArrayList <String> arr = new ArrayList<String>();
		
		for(int x = 1; x < cookies + 1; x++) {
			System.out.println("What would you like your #" + x + " cookie to be?");
			String cookie = sc.nextLine();
			arr.add(x - 1, cookie);
		}
		
		System.out.println("-----------------------------------------------");
		System.out.println("Your Menu:");
		
		for(int y = 1; y < cookies + 1; y++) {
			System.out.println("Cookie #" + y + ": " + arr.get(y - 1));
		}
	}
}
