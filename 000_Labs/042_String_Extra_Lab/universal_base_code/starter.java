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
		System.out.println("Type a sentence");
		String sentence = sc.nextLine();
		String finall = "";
        int num = 0;
        int counter = -1;

        while (true) {
            counter = sentence.indexOf(" ", num);

            if (counter == -1) { 
                if (finall.equals("")) {
                    finall = sentence.substring(num);
                } else {
                    finall = sentence.substring(num) + " " + finall;
                }
                break;
            } else {
                String word = sentence.substring(num, counter);
                if (finall.equals("")) {
                    finall = word;
                } else {
                    finall = word + " " + finall;
                }
                num = counter + 1;
            }
        }

        System.out.println(finall);
		
	}
}
