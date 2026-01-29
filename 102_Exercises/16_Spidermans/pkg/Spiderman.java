package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name?
	int age;			// What's the age of the actor?
	String villain;		// Who's the arch nemesis of this Spiderman?

public Spiderman() {
	actor = "unknown";
	age = 0;
	villain = "unknown";
}

public Spiderman(String act) {
	actor = act;
	age = 0;
	villain = "unknown";
}

public Spiderman(int a) {
	actor = "unknown";
	age = a;
	villain = "unknown";
}

public Spiderman(String a, int ag) {
	actor = a;
	age = ag;
	villain = "unknown";
}

public Spiderman(String a, int ag, String v) {
	actor = a;
	age = ag;
	villain = v;
}
	
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	public String setName(String a) {
		actor = a;
		return actor;
	}
	
	public int setAge(int a) {
		age = a;
		return age;
	}
	
	public String setVillain(String v) {
		villain = v;
		return villain;
	}
	
	public String getName() {
		return actor;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getVillain() {
		return villain;
	}


	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
