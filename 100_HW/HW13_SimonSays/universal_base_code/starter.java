/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;
import pkg.*;

class starter {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a difficulty level: 1, 2, or 3");
        int diff = sc.nextInt();
        sc.nextLine();
        
        if(diff == 1){
            String r = "";
            int words = 0;
                int amount = 1;
            while(true) {
                System.out.println("---------------------------------------------");
                System.out.println("Memorize this!");
                String [] arr = new String[amount];
                while(words<amount){
                r = getColorWord();
                arr[words] = r;
                Colors.println(arr[words]);
                words++;
                }
            System.out.println("------------------------------------------");
            delay(5);
            for(int numba = 0; numba<15; numba++) {
                System.out.println(" ");
            }
            String [] ansarr = new String[amount];
            System.out.println("Repeat the words you just saw on seperate lines");
            words = 0;
            int matches = 0;
            for(int woords = 0; woords<ansarr.length;woords++) {
            ansarr[woords] = sc.nextLine();
            }
            for(int numbaa = 0; numbaa<ansarr.length; numbaa++) {
                if(arr[numbaa].equals(ansarr[numbaa])) {
                    matches++;
                }
            }
            
            if(matches == ansarr.length) {
                amount = amount + 1;
                words = 0;
            }
            else {
                System.out.println("------------------------------------------");
                System.out.println("You got it wrong, the word was: " );
                printArray(arr);
                break;
            }
            }
            
        }
        else if(diff == 2){
            String r = "";
            String e = "";
            int words = 0;
                int amount = 1;
            while(true) {
                System.out.println("---------------------------------------------");
                System.out.println("Memorize this!");
                String [] arr = new String[amount];
                String [] arrcolor = new String[amount];
                while(words<amount){
                r = getColorWord();
                e = getColorWord();
                arrcolor[words] = e;
                arr[words] = r;
                Colors.println(r, e);
                words++;
                }
            System.out.println("------------------------------------------");
            delay(5);
            for(int numba = 0; numba<15; numba++) {
                System.out.println(" ");
            }
            String [] ansarr = new String[amount];
            int outcome = (int)(Math.random()*2+1);
            
            
            if(outcome == 1) {
            System.out.println("Repeat the WORDS you just saw on seperate lines");
            words = 0;
            int matches = 0;
            for(int woords = 0; woords<ansarr.length;woords++) {
            ansarr[woords] = sc.nextLine();
            }
            for(int numbaa = 0; numbaa<ansarr.length; numbaa++) {
                if(arr[numbaa].equals(ansarr[numbaa])) {
                    matches++;
                }
            }
            
            if(matches == ansarr.length) {
                amount = amount + 1;
                words = 0;
            }
            else {
                System.out.println("------------------------------------------");
                System.out.println("You got it wrong, the WORDS were: " );
                printArray(arr);
                break;
            }
            }
            else {
                System.out.println("Repeat the TEXT COLORS you just saw on seperate lines");
                words = 0;
                int matches = 0;
                for(int woords = 0; woords<ansarr.length;woords++) {
                ansarr[woords] = sc.nextLine();
                }
                for(int numbaa = 0; numbaa<ansarr.length; numbaa++) {
                    if(arrcolor[numbaa].equals(ansarr[numbaa])) {
                        matches++;
                    }
                }
            
                if(matches == ansarr.length) {
                    amount = amount + 1;
                    words = 0;
                }
                else {
                    System.out.println("------------------------------------------");
                    System.out.println("You got it wrong, the TEXT COLORS were: " );
                    printArray(arrcolor);
                    break;
                }
            }
            }
            
        }
        else if(diff == 3){
            String r = "";
            String e = "";
            String fina = "";
            int words = 0;
            int amount = 1;
            while(true) {
                System.out.println("---------------------------------------------");
                System.out.println("Memorize this!");
                String [] arr = new String[amount];
                String [] arrcolor = new String[amount];
                String [] arrBG = new String[amount];
                while(words<amount){
                r = getColorWord();
                e = getColorWord();
                fina = getColorWord();
                arrcolor[words] = e;
                arr[words] = r;
                arrBG[words] = fina;
                Colors.println(r, "Bright_" + e, "BG_" + fina);
                words++;
                }
            System.out.println("------------------------------------------");
            delay(6);
            for(int numba = 0; numba<15; numba++) {
                System.out.println(" ");
            }
            String [] ansarr = new String[amount];
            int outcome = (int)(Math.random()*3+1);
            
            
            if(outcome == 1) {
            System.out.println("Repeat the WORDS you just saw on seperate lines");
            words = 0;
            int matches = 0;
            for(int woords = 0; woords<ansarr.length;woords++) {
            ansarr[woords] = sc.nextLine();
            }
            for(int numbaa = 0; numbaa<ansarr.length; numbaa++) {
                if(arr[numbaa].equals(ansarr[numbaa])) {
                    matches++;
                }
            }
            
            if(matches == ansarr.length) {
                amount = amount + 1;
                words = 0;
            }
            else {
                System.out.println("------------------------------------------");
                System.out.println("You got it wrong, the WORDS were: " );
                printArray(arr);
                break;
            }
            }
            else if(outcome == 2) {
                System.out.println("Repeat the TEXT COLORS you just saw on seperate lines");
                words = 0;
                int matches = 0;
                for(int woords = 0; woords<ansarr.length;woords++) {
                ansarr[woords] = sc.nextLine();
                }
                for(int numbaa = 0; numbaa<ansarr.length; numbaa++) {
                    if(arrcolor[numbaa].equals(ansarr[numbaa])) {
                        matches++;
                    }
                }
            
                if(matches == ansarr.length) {
                    amount = amount + 1;
                    words = 0;
                }
                else {
                    System.out.println("------------------------------------------");
                    System.out.println("You got it wrong, the TEXT COLORS were: " );
                    printArray(arrcolor);
                    break;
                }
            }
            else {
                System.out.println("Repeat the BACKGROUND COLORS you just saw on seperate lines");
                words = 0;
                int matches = 0;
                for(int woords = 0; woords<ansarr.length;woords++) {
                ansarr[woords] = sc.nextLine();
                }
                for(int numbaa = 0; numbaa<ansarr.length; numbaa++) {
                    if(arrBG[numbaa].equals(ansarr[numbaa])) {
                        matches++;
                    }
                }
            
                if(matches == ansarr.length) {
                    amount = amount + 1;
                    words = 0;
                }
                else {
                    System.out.println("------------------------------------------");
                    System.out.println("You got it wrong, the TEXT COLORS were: " );
                    printArray(arrBG);
                    break;
                }
            }
            }
            /*
                Difficulty level 3:
                    This should act the same as difficulty level 2 with the following changes:
                    The user will receive a series of colors as words, as text color, and as background color (ex. "Red", "Blue", "Green", etc.)
                    The computer will randomly choose either to check the word as text, as a color, or as background color
                    The user must type in the colors in the correct order
                    All of the text words, the text colors and the background colors should be stored to be checked later
            */
        

        }
        else {
            System.out.println("Wrong number, try again.");
        }
    }

    // This method should take in a String array as a parameter and print out each element in the array.
    public static void printArray(String[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
	}


    // This method can be called to return a random color. This syntax is the correct syntax for the Colors class. 
    public static String getColorWord(){
        int rand = (int)(Math.random()*5);
        switch (rand){
            case 0: return "Purple";
            case 1: return "Red";
            case 2: return "Green";
            case 3: return "Yellow";
            case 4: return "Blue";
            default: return "White";
        }
    }

    // This method can be called to delay for a certain number of seconds.
    // The parameter count represents the number of seconds to delay.
    public static void delay(int count){
        for (int i = 0; i < count; i++) {
			System.out.print(count-i);
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
        }
    }
}
