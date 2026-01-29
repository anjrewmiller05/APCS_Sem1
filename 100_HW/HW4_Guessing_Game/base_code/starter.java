/*
 *	Author:
 *  Date:
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int question = (int)(Math.random()*3);
		
		if(question == 0) {
			System.out.println("The goal of the game is to guess the correct word.\nYou get two hints");
			System.out.println(" ");
			System.out.println("It'a fruit");
			System.out.println("Input your first guess");
			String fruit = sc.nextLine();
			if (fruit.equals("Pineapple") || fruit.equals("pineapple")) {
				System.out.println("You got it first try! Nice!");
			}
			else {
				System.out.println("Second hint: It is spiky.");
				fruit = sc.nextLine();
				
				if (fruit.equals("Pineapple") || fruit.equals("pineapple")) {
					System.out.println("You got it! Nice!");
				}
				else {
					System.out.println("The word was Pineapple. Better luck next time!");
				}
			}
		}
		if(question == 1) {
			System.out.println("The goal of the game is to guess the correct word.\nYou get two hints");
			System.out.println(" ");
			System.out.println("It's an animal");
			System.out.println("Input your first guess");
			String fruit = sc.nextLine();
			if (fruit.equals("Dog") || fruit.equals("dog")) {
				System.out.println("You got it first try! Nice!");
			}
			else {
				System.out.println("Second hint: It's a man's best friend!");
				fruit = sc.nextLine();
				
				if (fruit.equals("Dog") || fruit.equals("dog")) {
					System.out.println("You got it! Nice!");
				}
				else {
					System.out.println("The word was Dog. Better luck next time!");
				}
			}
		}
		if(question == 2) {
			System.out.println("The goal of the game is to guess the correct word.\nYou get two hints");
			System.out.println(" ");
			System.out.println("It's a video game");
			System.out.println("Input your first guess");
			String fruit = sc.nextLine();
			if (fruit.equals("Minecraft") || fruit.equals("minecraft")) {
				System.out.println("You got it first try! Nice!");
			}
			else {
				System.out.println("Second hint: It involves blocks and sometimes multiplayer!");
				fruit = sc.nextLine();
				
				if (fruit.equals("Minecraft") || fruit.equals("minecraft")) {
					System.out.println("You got it! Nice!");
				}
				else {
					System.out.println("The word was Minecraft. Better luck next time!");
				}
			}
		}
	}
}
