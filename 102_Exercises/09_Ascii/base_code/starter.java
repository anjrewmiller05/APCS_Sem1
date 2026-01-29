/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like a picture of a face, animal, or fruit");
		String pic = sc.nextLine();
		
		if ((pic.equals("face")) || (pic.equals("Face"))) {
			System.out.println("      _________       ");
			System.out.println("     /         \\     ");
			System.out.println("    /  0    0   \\    ");
			System.out.println("   |    /..\\     |    ");
			System.out.println("   |             |    ");
			System.out.println("    \\  \\___/    /    ");
			System.out.println("     \\_________/  ");
		}
		else if ((pic.equals("animal")) || (pic.equals("Animal"))) {
			System.out.println("     _____               ");
			System.out.println("    / .   \\____________");
			System.out.println("    |                  \\");
			System.out.println(" _  | |\\                \\");
			System.out.println("| \\_/ | \\               |");
			System.out.println(" \\____/  |  _   __   _  |\\");
			System.out.println("         | | | |  | | | | \\");
			System.out.println("         |_| |_|  |_| |_|");
		}
		else if ((pic.equals("fruit")) || (pic.equals("Fruit"))) {
			System.out.println("      _______");
			System.out.println("    /        \\");
			System.out.println("   /          \\");
			System.out.println("  |           |");
			System.out.println("  |           |");
			System.out.println("   \\         /");
			System.out.println("    \\_______/");
		}
		else {
			System.out.println("ur a bum for not choosing a thing. rerun program por favor.");
		}
	}
}
