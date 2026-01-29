/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		int [] hazel = new int[1000];
		int x = 0;
		int y;
		
		while(x < hazel.length) {
			y = (int)(Math.random()*100 + 1);
			hazel[x] = y;
			System.out.println(hazel[x]);
			x++;
		}
		
	}
}
