/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		int [] arr = new int[10];
		int i = 0;
		int a = 9;
		while (i < arr.length) {
			arr[i] = a;
			a--;
			i++;
		}
		
		i = 0;
		while (i < arr.length) {
			System.out.println(arr[i]);
			i = i + 1;
		}
	}
}
