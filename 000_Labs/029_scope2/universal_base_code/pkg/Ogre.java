/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class Ogre {
	String name;
	boolean ugly;
	
	public Ogre() {
		name = "Shrek";
		ugly = true;
	}

	public String getName(){
		return name;
	}

	public boolean isUgly(){
		return ugly;
	}

	public void interact(String donkey){
		System.out.println(donkey + ", what are you doing in my swamp?!");
		return;
	}


}
