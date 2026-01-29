/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/
import java.util.Scanner;
import java.util.Random;


class starter {
	// The goal of the first method is to give back whether the year given is a leap year or not. 2004 is a leap year.

	// The goal of the second method is to add all the digits of a number up. Ex: 12345 has a total of 15.

	// The goal of the third method is to check if 3 numbers are consecutive. 15 16 17 are consecutive. It will print if they are or not.
	// Assume that the first number is always the smallest and the third number is always the largest.

	public static void main(String args[]) {
		System.out.println("----------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = sc.nextInt();
		System.out.println();
		if(isLeapYear(year))
			System.out.println(year + " is a leap year!");
		else
			System.out.println(year + " is not a leap year!");


		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a 5 digit number");
		int number = sc.nextInt();
		int sum = getDigitSum(number);
		System.out.println();
		System.out.println("The sum of the digits of " + number + " is " + sum);
		
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a number");
		int num1 = sc.nextInt();
		System.out.println("Enter a number");
		int num2 = sc.nextInt();
		System.out.println("Enter a number");
		int num3 = sc.nextInt();
		System.out.println();
		printIfConsecutive(num1, num2, num3);
		System.out.println();
		System.out.println("----------------------------------------");
	
	}
	public static boolean isLeapYear(int year1) {
		if (year1 % 4 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static int getDigitSum(int a) {
		int sum = 0;
		sum = a % 10;
		sum = (a / 10) % 10 + sum;
		sum = (a / 100) % 10 + sum;
		sum = (a / 1000) % 10 + sum;
		sum = (a / 10000) % 10 + sum;
		return sum;
	}
	public static void printIfConsecutive(int num1, int num2, int num3) {
		if ((num1+1 == num2) && (num2+1 == num3)) {
			System.out.println("Your numbers are consecutive");
		}
		else {
			System.out.println("Your numbers are not consecutive");
		}
	}
}
