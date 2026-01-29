/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		String oriname = randName();
		int num = 0;
		int reps = 0;
		PooleDwarf test = new PooleDwarf(oriname, num);
		while (num < 115) {
		String repeat = randName();
		boolean sum;
		sum = test.isSameName(repeat);
		if (sum) {
			reps = reps + 1;
		}
		
		num = num + 1;
		}
		
		System.out.println(oriname + " was the name with " + reps + " matches");
	}
}
