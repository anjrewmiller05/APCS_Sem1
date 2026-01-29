/*
 *	Author:  Andrew Miller
 *  Date: 8/29/25
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		testHello();
		System.out.println();
		System.out.println("----------------------------");
		testAbba();
		System.out.println();
		System.out.println("----------------------------");
		testPythag();
	}

	public static void helloName(String name){
		System.out.println("Hello " + name);
	}
	
	public static void makeAbba(String a, String b){
		System.out.println(a + b + b + a);
		
	}
	
	public static void pythag(int a, int b){
		int c = (a*a + b*b);
		System.out.println("The hypotenuse side is :" + c );
	}
	
	
	public static void testHello(){
		helloName("Bob");
		helloName("Alice");
		helloName("X");
		helloName("");
		helloName("");
		helloName("Hello");
	}
	
	public static void testAbba(){
		makeAbba("Hi", "Bye");
		makeAbba("Yo", "Ben");
		makeAbba("What", "Up");
		makeAbba("6", "7");
		makeAbba("x", "y");
		makeAbba("x", "");
		makeAbba("", "y");
		makeAbba("Ya", "Ya");
	}
	
	public static void testPythag(){
		pythag(1, 1);
		pythag(2, 3);
		pythag(100, 200);
		pythag(67,41);
		pythag(589, 6417);
		pythag(214325728, 1242745810);
	}
}

