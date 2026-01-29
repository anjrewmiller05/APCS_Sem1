/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int w = 1000;
		 int x = 0;
		 int [] arr = new int[w+1];
		 int [] arr1 = new int[w];
		 int y = 3;
		 
		 while (x < arr.length) {
		 	arr[x] = y;
		 	y = y + 3;
		 	x++;
		 }
		 x = 0;
		 while (x < arr.length) {
		 	System.out.print(arr[x] + " ");
		 	x++;
		 }
		 
		 x = 0;
		 y = 1000;
		 System.out.println(" ");
		 System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
		 while (x < arr1.length) {
		 	arr[x] = y;
		 	y = y - 1;
		 	x++;
		 }
		 x = 0;
		 while (x < arr1.length) {
		 	System.out.print(arr[x] + " ");
		 	x++;
		 }
		 
	}
}
