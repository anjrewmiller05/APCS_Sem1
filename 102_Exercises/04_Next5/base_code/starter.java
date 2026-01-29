/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Please enter a number: ");
	int num = sc.nextInt();
	System.out.println(" ");
	int num1 = num + 1;
	int num2 = num + 2;
	int num3 = num + 3;
	int num4 = num + 4;
	int num5 = num + 5;
	System.out.println("Here are the next 5 numbers after " + num + ": " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5);
	System.out.println(" ");
	int mult1 = num * 2;
	int mult2 = num * 3;
	int mult3 = num * 4;
	int mult4 = num * 5;
	System.out.println("Here are the next 5 multiples of " + num + ": " + num + ", " + mult1 + ", " + mult2 + ", " + mult3 + ", " + mult4);
	System.out.println(" ");
	
	double div100 = num / 100.0;
	System.out.println("Here is " + num + " divided by 100: " + div100);
	double div10 = num /10.0;
	System.out.println(" ");
	System.out.print("Here is " + num + " divided by 10: " + div10);

	}
}
