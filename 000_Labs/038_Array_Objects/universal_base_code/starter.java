/*
 *	Author:  Andrew Miller
 *  Date: 11/20/25
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Wizard [] arrwi = new Wizard[100];
		Warrior [] arrwa = new Warrior[100];
		
		for(int num = 0; num<arrwi.length; num++) {
			arrwi[num] = new Wizard();
		}
		for(int num = 0; num<arrwa.length; num++) {
			arrwa[num] = new Warrior();
		}
		int winum = 0;
		int wanum = 0;
		while(!(arrwa[99].isDead()) && !(arrwi[99].isDead())) {
			if (arrwi[winum].isDead()){
				winum++;
			}
			arrwi[winum].attack(arrwa[wanum]);
			
			if (arrwa[99].isDead()) {
				break;
			}
			
			if (arrwa[wanum].isDead()) {
				wanum++;
			}
			arrwa[wanum].attack(arrwi[winum]);
		}
		int left = 0;
		if(arrwa[99].isDead()) {
			for (int numba = 0;numba<arrwi.length;numba++) {
				if (!(arrwi[numba].isDead())) {
					left++;
				}
			}
			System.out.println("The Wizards won with " + left + " mages left.");
		}
		
		if(arrwi[99].isDead()) {
			for (int numba = 0;numba<arrwa.length;numba++) {
				if (!(arrwa[numba].isDead())) {
					left++;
				}
			}
			System.out.println("The Warriors won with " + left + " swordsmen left.");
		}
		
	}
}
