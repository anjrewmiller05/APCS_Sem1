/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number and I'll write every prime number before it: ");
		int num = sc.nextInt();
		findprimes(num);
		System.out.println("That was all the prime numbers before " + num);
		
	}
	
	public static void findprimes(int Num){
		int count = 1;
		int divisor = 2;
		
		while (count < Num) {
			if (divisor >= count) {
				System.out.println(count);
				divisor = 2;
				count = count + 1;
			}
			else {
				if (count % divisor == 0) {
					divisor = 2;
					count = count + 1;
				}
				else {
					divisor = divisor + 1;
				}
			}
		}
	}
}
