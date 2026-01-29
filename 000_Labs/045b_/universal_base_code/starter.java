/*
 *	Author:  
 *  Date: 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {

		/*
			Create a program that creates a crossword puzzle hiding 1 word given by the user!

			1. Take a word from the user
			2. Create a 2D String array with a size of 5 larger than the word size in both directions
			3. Choose what direction the word should hide in
				- Vertical, Horizontal, Diagonal
				- EXTRA: Choose if the word should hide forward or backwards
			4. For each letter in the word, hide it into a spot in the 2D array
				- This spot should be chosen randomly within the bounds of the 2D array
			5. Once the word is stored in the array, fill up the rest of the array
				- Note what value is stored in the String array and replacing non-filled values with random letters
				- Given the letters array, choose a random letter to populate it with
			6. Print out the crossword puzzle!
			7. Ask a friend to find the word!
		*/
		Scanner sc = new Scanner(System.in);
		
		String[] letters = {
            "a","b","c","d","e","f","g","h","i","j",
            "k","l","m","n","o","p","q","r","s","t",
            "u","v","w","x","y","z"
        };
		
		System.out.println("Enter a word and I'll make a word search! (All lowercase please)");
		String word = sc.nextLine();
		
		String [][] arr = new String[word.length() + 10][word.length() + 10];
		for(int y = 0; y < arr.length; y++) {
			for(int x = 0; x < arr[0].length; x++) {
				int letter = (int)(Math.random()*26);
				arr[y][x] = letters[letter];
			}
		}
		
		int direction = (int)(Math.random()*2);
		int orientation = (int)(Math.random()*4);
		int length = word.length();
		
		if(orientation == 0) {
			int row = (int)(Math.random()*(arr.length - word.length() - 1));
			int column = (int)(Math.random()*arr[0].length);
			for(int i = 0; i < length; i++) {
				if(direction == 0) {
					arr[row + i][column] = word.substring(i, i + 1 );
				}
				else {
					arr[row + i][column] = word.substring(word.length() - 1);
					word = word.substring(0, word.length() - 1);
				}
			}
		}
		else if (orientation == 1) {
			int column = (int)(Math.random()*(arr[0].length - word.length() - 1));
			int row = (int)(Math.random()*arr.length);
			for(int i = 0; i < length; i++) {
				if(direction == 0) {
					arr[row][column + i] = word.substring(i, i + 1 );
				}
				else {
					arr[row][column + i] = word.substring(word.length() - 1);
					word = word.substring(0, word.length() - 1);
				}
			}
		}
		else if(orientation == 2) {
			int column = (int)(Math.random()*(arr[0].length - word.length()));
			int row = (int)(Math.random()*(arr.length - word.length()));
			for(int i = 0; i < length; i++) {
				if(direction == 0) {
					arr[row + i][column + i] = word.substring(i, i + 1 );
				}
				else {
					arr[row + i][column + i] = word.substring(word.length() - 1);
					word = word.substring(0, word.length() - 1);
				}
			}
		}
		else if(orientation == 3) {
			int column = (int)(Math.random()*(arr[0].length - word.length()));
			int row = (int)(Math.random()*(arr.length - word.length()) + word.length());
			for(int i = 0; i < length; i++) {
				if(direction == 0) {
					arr[row - i][column + i] = word.substring(i, i + 1 );
				}
				else {
					arr[row - i][column + i] = word.substring(word.length() - 1);
					word = word.substring(0, word.length() - 1);
				}
			}
		}
		
		for(int y = 0; y < arr.length; y++) {
			for(int x = 0; x < arr[0].length; x++) {
				System.out.print(arr[y][x] + " ");
			}
			System.out.println();
		}

		
	}
}
