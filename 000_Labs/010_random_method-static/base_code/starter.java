/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		double num1;
		double num2;
		double num3;
		double num4;
		num1 = Math.random()*10;
		num2 = Math.random()*10 + 1;
		num3 = Math.random()+ 2.5;
		num4 = Math.random()*575 + 14;
		num1 = (int)num1;
		num2 = (int)num2;
		System.out.println("A number between 0-9: " + (int)num1);
		System.out.println("A number between 1-10: " + (int)num2);
		System.out.println("A double between 2.5-3.5: " + num3);
		System.out.println("A double between 14-589: " + num4);
	}
}
