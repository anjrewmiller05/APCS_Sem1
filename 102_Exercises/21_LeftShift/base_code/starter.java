/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		String[] tvChars = {
			"Walter White", "Jesse Pinkman", "Saul Goodman", "Rick Grimes",
			"Eleven", "Michael Scott", "Dwight Schrute", "Jim Halpert",
			"Leslie Knope", "Ron Swanson", "Ted Lasso", "BoJack Horseman",
			"Homer Simpson", "Bart Simpson", "Peter Griffin", "Stewie Griffin",
			"Sheldon Cooper", "Geralt (Netflix)", "Wednesday Addams", "Joe Goldberg"
		};

		System.out.println("---------------------------------------------");
		printArray(tvChars);
		System.out.println("---------------------------------------------");
		leftShift(tvChars);
		printArray(tvChars);
		System.out.println("---------------------------------------------");

		
		printArray(tvChars);
		System.out.println("---------------------------------------------");
		leftShift(tvChars, 5);
		printArray(tvChars);
		System.out.println("---------------------------------------------");
		
	}

	public static void printArray(String[] arr){
		for(int i=0;  i<arr.length; i++) {
		System.out.print(arr[i] + ", ");
		}
	}

	public static void leftShift(String [] arr){
		String r = arr[0];
		for(int i = 0;  i < arr.length; i++) {
			if (i==19) {
				arr[i] = r;
			}
			else {
				arr[i] = arr[i + 1];
			}
			
		}
	}

	public static void leftShift(String [] arr, int num){
		for(int i = 0;  i < num; i++) {
			
			leftShift(arr);	
		}
	
	}
}
