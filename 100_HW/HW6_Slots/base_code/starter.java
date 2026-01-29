/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Slot Machine Rules: \n1. Each player starts with $100.\n2. Input a wager less than your total amount of money.\n3. The slot machine will roll 3 numbers from 1 to 10.\n    a. If two numbers match, you double your money.\n    b. If three numbers match, you triple your money.\n    c. If none match, you lose your money.\n--------------------------------------------------");
		System.out.println("");
		System.out.print("Would you like to play the slots? (Yes/yes/Y/y) : ");
		String player = sc.nextLine();
		int money = 100;
		
		while ((player.equals("Yes")) || (player.equals("yes")) || (player.equals("Y")) || (player.equals("y"))) {
			
			if (money == 0) {
				System.out.println("You lost all ur money bum!");
				break;
			}
			System.out.print("You have " + money + "$, how much would you like to spend? ");
			int wager = sc.nextInt();
			while(wager > money){
				System.out.println("you don't have that much money! \nEnter a smaller wager: ");
				wager = sc.nextInt();
			}
			int num1 = (int)(Math.random()*9+1);
			int num2 = (int)(Math.random()*9+1);
			int num3 = (int)(Math.random()*9+1);
			System.out.println("Here are the numbers:");
			System.out.println("----------------------------------------------------");
			System.out.println("         " + num1 + " | " + num2 + " | " + num3);
			
			if ((num1 == num2) && (num1 == num3)) {
				System.out.println("You tripled your wager!");
				money = money + (wager * 2);
			}
			else if ((num1 == num2) || (num2 == num3) || (num1 == num3)) {
				System.out.println("You doubled your wager!");
				money = money + wager;
			}
			else {
				System.out.println("You lost your wager!");
				money = money - wager;
			}
			
		}
		
		
	}
}
