/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class PooleDwarf {
	private String name;
	private int age;

	public PooleDwarf() {		// Default Constructor
		name = new String("");
		age = 0;
	}

	public PooleDwarf(String n, int a){
		name = n;
		age = a;
	}

	/*	Accessor Methods */
	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	/*	Mutator Methods	*/
	public String setName(String n){
		name = n;
		return name;
	}
	
	public int setAge(int a){
		age = a;
		return age;
	}

	public boolean isSameName(String n){
		if(name.equals(n)) {
			return true;
		}
		else {
			return false;
		}
	}
}

