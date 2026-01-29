/*
   * Author:
   * Date:
   * Collaborator(s):
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please input a sentence:");
		String sentence = sc.nextLine();
		
		while(sentence.indexOf(" ") != -1) {
			int space = sentence.indexOf(" ");
			String word = sentence.substring(0, space);
			sentence = sentence.substring(space + 1);
			
			if (word.substring(0,1).equals("a") || word.substring(0,1).equals("e") || word.substring(0,1).equals("i") ||word.substring(0,1).equals("o") || word.substring(0,1).equals("u") || word.substring(0,1).equals("A") || word.substring(0,1).equals("E") || word.substring(0,1).equals("I") || word.substring(0,1).equals("O") || word.substring(0,1).equals("U")) {
				word = word + "way";
				System.out.print(word + " ");
			}
			else {
				if (!(word.substring(1,2).equals("a")) && !(word.substring(1,2).equals("e")) && !(word.substring(1,2).equals("i")) && !(word.substring(1,2).equals("o")) && !(word.substring(1,2).equals("u"))) {
					String letters = word.substring(0,2);
					word = word.substring(2);
					word = word + letters + "ay";
					System.out.print(word + " ");
				}
				else {
					String letter = word.substring(0,1);
					word = word.substring(1);
					word = word + letter + "ay";
					System.out.print(word + " ");
				}
			}
		}
		
		if (sentence.substring(0,1).equals("a") || sentence.substring(0,1).equals("e") || sentence.substring(0,1).equals("i") ||sentence.substring(0,1).equals("o") || sentence.substring(0,1).equals("u")) {
			sentence = sentence + "way";
			System.out.print(sentence + " ");
		}
		else {
			if (!(sentence.substring(1,2).equals("a")) && !(sentence.substring(1,2).equals("e")) && !(sentence.substring(1,2).equals("i")) && !(sentence.substring(1,2).equals("o")) && !(sentence.substring(1,2).equals("u"))) {
				String letters = sentence.substring(0,2);
				sentence = sentence.substring(2);
				sentence = sentence + letters + "ay";
				System.out.print(sentence + " ");
			}
			else {
				String letter = sentence.substring(0,1);
				sentence = sentence.substring(1);
				sentence = sentence + letter + "ay";
				System.out.print(sentence + " ");
			}
		}
		
		
	}
}
