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
		System.out.println("What is you pet peeve?");
		String peeve = sc.nextLine();
		String g = "Wow, did you just say \"";
		String h = "\" is your pet peeve?";
		String j = "Get outta here! \\";
		String k = "\\ You make me mad.";
		System.out.println(g + peeve + h);
		System.out.println("	" + j + k);
		
	}
}
