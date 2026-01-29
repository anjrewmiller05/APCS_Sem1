package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	
	String name;
		int age;
		String breed;
		
		public Dog() {
			name = "Toto";
			age = 1;
			breed = "Golden Retriever";
		}
		
		public Dog(String n, int a) {
			name = n;
			age = a;
			breed = "Boxer";
		}
	
	public void Sleeping() {
		System.out.println("Carefull, " + name + " is sleeping!");
	}
	
	public void Sleepingtoo() {
		System.out.println("Carefull, " + name + " is sleeping too!");
	}
	
	public void printAge() {
		System.out.println(name + " is a " + breed + " and is " + age + " years old!");
	}
}
