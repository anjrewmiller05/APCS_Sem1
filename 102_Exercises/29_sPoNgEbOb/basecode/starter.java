/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a word or phrase:");
	String word = sc.nextLine();
	int count = 1;
	String ans = "";
	
	
	for(int x = 0; x < word.length(); x++) {
		String letter = word.substring(x, x + 1);
		if (letter.equals(" ")) {
			ans = ans + " ";
			count = 1;
			x++;
		}
		if (count % 2 != 0) {
			letter = letter.toLowerCase();
			ans = ans + letter;
			count++;
		}
		else if(count % 2 == 0) {
			letter = letter.toUpperCase();
			ans = ans + letter;
			count++;
		}
	}
	
	System.out.println(ans);
	
	}
}
