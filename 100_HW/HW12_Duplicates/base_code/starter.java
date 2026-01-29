/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
	int [] arr = new int[20];
	int i = 0;
	
	while (i < arr.length) {
		arr[i] = (int)(Math.random()*10+1);
		i++;
	}
	i = 0; 
	System.out.println("Here are the 20 numbers");
	while (i<arr.length) {
		System.out.print(arr[i] + " ");
		i++;
	}
	System.out.println("");
	System.out.println("------------------------------------------------------");
	
	int dup = (int)(Math.random()*10+1);
	System.out.println("The number to look for is " + dup);
	i = 0;
	int dupes = 0;
	while (i < arr.length) {
		if (arr[i] == dup) {
			System.out.println("The dup can be spotted in index " + (i + 1));
			i++;
			dupes++;
		}
		else {
		i++;
		}
	}
	System.out.println("Total number of dupes for " + dup + " is " + dupes);
	System.out.println("------------------------------------------------------");
	System.out.println("Looking for 2 of the same number in a row.");
	
	int row = 0;
	int row0 = row + 1;
	int rowstreaks = 0;
	while (row < arr.length-1){
		if (arr[row] == arr[row0]) {
			System.out.println("There is a streak of the number " + arr[row + 1] + " at index " + (row + 1) + " & " + (row0 + 1));
			row++;
			row0++;
			rowstreaks++;
		}
		else {
			row++;
			row0++;
		}
	}
	if (rowstreaks==0) {
		System.out.println("There are no streaks of the same number");
	}
	}
}
