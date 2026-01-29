/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		String[][] words = {
			// Col 0, 1, 2, 3
			{"The", "A", "My", "Our"},					// Row 0
			{"quick", "lazy", "happy", "curious"},		// Row 1
			{"dog", "cat", "robot", "student"},			// Row 2
			{"eats", "builds", "chases", "studies"},	// Row 3
			{"pizza", "code", "homework", "dreams"}		// Row 4
		};
		
		System.out.println("1. " +words[0][0]+ " " + words[1][0]+ " " + words[2][0]+ " " + words[3][0]+ " " + words[4][0]);
		System.out.println("2. " +words[0][2]+ " " + words[1][1]+ " " + words[2][1]+ " " + words[3][2]+ " " + words[4][2]);
		System.out.println("3. " +words[0][3]+ " " + words[1][2]+ " " + words[2][3]+ " " + words[3][3]+ " " + words[4][1]);
		System.out.println("4. " +words[0][1]+ " " + words[1][3]+ " " + words[2][2]+ " " + words[3][1]+ " " + words[4][3]);
		System.out.println("5. " +words[0][0]+ " " + words[1][0]+ " " + words[2][2]+ " " + words[3][3]+ " " + words[4][0]);
		System.out.println("6. " +words[0][2]+ " " + words[1][2]+ " " + words[2][2]+ " " + words[2][0]+ " " + words[3][0]+ " " + words[4][2]);

	}
}
