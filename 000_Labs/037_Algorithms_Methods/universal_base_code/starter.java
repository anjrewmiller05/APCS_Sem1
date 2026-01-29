/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		int [] arr = new int[1000];
		for(int nu = 0; nu<arr.length; nu++) {
			int nums = (int)(Math.random()*100 + 1);
			arr[nu] = nums;
		}
		for(int nuu = 0; nuu<arr.length;nuu++) {
			System.out.println(arr[nuu]);
		}
		
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		int ave = 0;
		for(int i = 0; i < arr.length; i++) {
			ave = ave + arr[i];
		}
		ave = (ave / arr.length);
		
		System.out.println("There are " + arr.length + " elements.");
		System.out.println("The minimum of the " + arr.length + " elements is " + min);
		System.out.println("The maximum of the " + arr.length + " elements is " + max);
		System.out.println("The average of the " + arr.length + " elements is " + ave);
	}
}
