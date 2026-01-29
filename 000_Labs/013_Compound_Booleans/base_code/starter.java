/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your first number?");
		int num1 = sc.nextInt();
		
		System.out.println("What is your second number?");
		int num2 = sc.nextInt();
		
		System.out.println("What is your third number?");
		int num3 = sc.nextInt();
		System.out.println(" ");
		
		if ((num1 > num2) && (num1 > num3))
		{
			System.out.println(num1 + " was your biggest number\nIt was your first number.");
		}
		if ((num2 > num1) && (num2 > num3))
		{
			System.out.println(num2 + " was your biggest number\nIt was your second number.");
		}
		if ((num3 > num1) && (num3 > num2))
		{
			System.out.println(num3 + " was your biggest number\nIt was your thired number.");
		}
		
		if ((num1 < num2) && (num1 < num3))
		{
			System.out.println(num1 + " was your smallest number\n It was your first number.");
		}
		if ((num2 < num1) && (num2 < num3))
		{
			System.out.println(num2 + " was your smallest numer\nIt was your second number.");
		}
		if ((num3 < num1) && (num3 < num2))
		{
			System.out.println(num3 + " was your smallest number\nItwas your smallest number.");
		}
		
		
	}
}
