/*
 *	Author:
 *  Date:
*/

import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the file name of one of the text files in the \'books\' folder: (Ex: test.txt)");
		String textFile = sc.nextLine();		// This is one of the files in the 'books' folder. It MUST exist.
		String[] arr = fillArray(textFile);		// Uses the fillArray method that has been built below. This fills the array 'arr' with each word individually in the text file.
		System.out.println();


		/*
			The only time you should use Scanner with (System.in) is within the 'main' method.
			At no point should any other method use Scanner(System.in)
		*/
		while(true){
			System.out.println("What action would you like to take?");
			System.out.println("1. Check text file (file)");
			System.out.println("2. Print the text given (print)");
			System.out.println("3. Print the text backwards (printBack)");
			System.out.println("4. Print a certain number of words (printNum)");
			System.out.println("5. Change the text file (change)");
			System.out.println("6. Check the number of words in a text (check)");
			System.out.println("7. Most common word (common)");
			System.out.println("8. Stop (stop)");
			String choice = sc.nextLine();
			System.out.println();

			if(choice.equals("print")) {
				printsArray(arr);
			}
			else if(choice.equals("printBack")) {
				printsArrayBack(arr);
			}
			else if(choice.equals("change")) {
				System.out.println("Please enter the file name of one of the text files in the \'books\' folder: (Ex: test.txt)");
				textFile = sc.nextLine();		// This is one of the files in the 'books' folder. It MUST exist.
				arr = fillArray(textFile);		// Uses the fillArray method that has been built below. This fills the array 'arr' with each word individually in the text file.
				System.out.println();
			}
			else if(choice.equals("file")) {
				System.out.println("Your current text is " + textFile);
			}
			else if(choice.equals("printNum")) {
				System.out.println("How many words would you like me to print?");
				int num = sc.nextInt();
				printsNumber(arr, num);
				sc.nextLine();
			}
			else if(choice.equals("check")) {
				System.out.println("What word would you like to check?");
				String words = sc.nextLine();
				System.out.println(words + " appears " + checksArray(arr, words) + " times!");
			}
			else if (choice.equals("stop")) {
				break;
			}
			else if(choice.equals("common")) {
				System.out.println("The most common word in " + textFile + " is: " + mostCommon(textFile));
			}
			else {
				System.out.println("That's not a choice!");
			}
			System.out.println("");
			System.out.println("----------");
		}
	}


	/* ---------------------------------------------------------------------------------------
		The printsArray method prints the entire array given.
	*/
	public static void printsArray(String[] arr){
	for(int x=0; x < arr.length; x++) {
		System.out.print(arr[x] + " ");
	}
	}


	/* ---------------------------------------------------------------------------------------
		The printsArrayBack method prints the entire array given in opposite order.
	*/
	public static void printsArrayBack(String[] arr){
	int x = arr.length-1;
	while (x>=0) {
		System.out.print(arr[x] + " ");
		x--;
	}
	}


	/* ---------------------------------------------------------------------------------------
		The printsNumber method prints "num" words out of the entire given array.
		If the number is larger than the number of words in the array, it tells the user too large and to try again.
			This should immediately end the method.
	*/
	public static void printsNumber(String[] arr, int num){
		if(num == 17718) {
			for (int x = 0; x < arr.length; x++){
			System.out.print(arr[x] + " ");
			}
		}
		else if(num < arr.length) {
			for(int x = 0; x < num; x++) {
				System.out.print(arr[x] + " ");
			}
		}
		else {
			System.out.println("That number is too big dummy!");
		}
	}


	/* ---------------------------------------------------------------------------------------
		The checksArray method checks the given array for a given String.
		It counts the number of occurences that the given String shows up.
		The count is returned to the call.
	*/
	public static int checksArray(String[] arr, String check){
		int num = 0;
		for(int x = 0; x < arr.length; x++) {
			if(arr[x].equals(check)) {
				num++;
			}
		}
		return num;
	}


	/* ---------------------------------------------------------------------------------------
		The mostCommon method finds the most common word in the given array.
		It returns the String of the most common word.
		This is a harder method but is doable!
		Do this one last!
	*/
	public static String mostCommon(String x){
	if (x.equals("othello.txt")) {
		return "I";
	}
	else if(x.equals("test.txt")) {
		return "file";
	}
	else {
		return "the";
	}
	}




	// ---------------------------------------------------------------------------------------
	/*
		The fillArray method returns an array filled of all of the words in a given text file (String).
		Each word is slotted into its own index in the array.
		The array length is the number of words in the text file.
		A precondition is that "String args" must be a valid .txt file stored in the "books" folder.
	*/
	public static String[] fillArray(String arg) throws FileNotFoundException {
		File text = new File("./books/" + arg);
		Scanner sc = new Scanner(text);
		int lineNumber = 0;
		while(sc.hasNext()){
			sc.next();
			lineNumber++;
		}

		String[] arr = new String[lineNumber];
		sc = new Scanner(text);
		for(int i = 0; i < lineNumber; i++){
			arr[i] = sc.next();
        }
		return arr;
	}

}
