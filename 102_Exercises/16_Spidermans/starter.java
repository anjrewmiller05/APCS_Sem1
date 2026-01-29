/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Spiderman blank = new Spiderman();
		Spiderman tom = new Spiderman("Tom Holand", 27, "The Vulture");
		Spiderman toby = new Spiderman("Tobey Maguire", 48, "Green Goblin");
		Spiderman andrew = new Spiderman("Andrew Garfield", 40, "Electro");
		
		blank.setName("Gooner");
		System.out.println(blank.getName());
		System.out.println(andrew.getVillain());
		andrew.fight();
		andrew.printArt();

		
	}
}
