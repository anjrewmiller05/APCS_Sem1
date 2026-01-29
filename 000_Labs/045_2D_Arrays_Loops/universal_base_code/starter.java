/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rows would you like in ur 2D array?");
		int rows = sc.nextInt();
		
		System.out.println("How many columns would you like in ur 2D array?");
		int columns = sc.nextInt();
		
		int [][] arr = new int [rows][columns]; 
		
		for(int x = 0; x<arr.length; x++) {
			for(int y = 0; y<arr[0].length; y++) {
				int random = (int)(Math.random()*10 + 1);
				arr[x][y] = random;
			}
		}
		
		for(int x = 0; x<arr.length; x++) {
			for(int y = 0; y<arr[0].length; y++) {
				System.out.print(arr[x][y] + " ");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------------------------");
		System.out.println("What row do you want the average of?");
		int av = sc.nextInt();
		av = av-1;
		int total = 0;
		
		for(int x = 0; x < arr[0].length; x++) {
			total = total + arr[av][x];
		}
		
		double average = total * 1.0 / arr[0].length;
		int aver = av + 1;
		System.out.println("----------------------------------------------------");
		System.out.println("The average of row " + aver + " is: " + average);
		
		int total1 = 0;
		
		for(int x = 0; x < arr[0].length; x++) {
			for(int y = 0; y < arr.length; y++) {
				total1 = total1 + arr[y][x];
			}
		}
		int spots = arr.length * arr[0].length;
		double average1 = total1 * 1.0 / spots;
		
		System.out.println("----------------------------------------------------");
		System.out.println("The average of the whole array is: " + average1);
	}
}
