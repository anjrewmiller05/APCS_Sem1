import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		    
	    int power1 = 0;
	    int power2 = 0;
	    int power3 = 0;
	    int nopower = 0;
	    
	    for(int x = 0; x < passwords.length; x++) {
	        boolean power1if = (passwords[x].length() >= 8);
	        boolean power2if = (passwords[x].contains("!") || passwords[x].contains("@") || passwords[x].contains("#") || passwords[x].contains("$") || passwords[x].contains("%") || passwords[x].contains("^") || passwords[x].contains("&") || passwords[x].contains("*"));
	        if(power1if && power2if) {
	            power3++;
	        }
	        else if(power1if) {
	            power1++;
	        }
	        else if(power2if) {
	            power2++;
	        }
	        else {
	            nopower++;
	        }
	    }
	    
	    System.out.println("There are " + power1 + " passwords of strength 1 with 8 or more characters.");
	    System.out.println("There are " + power2 + " passwords of strength 2 with a special symbol.");
	    System.out.println("There are " + power3 + " passwords of strength 3 with both strength 1 and 2.");
	    System.out.println("There are " + nopower + " passwords with no strength.");
		
	}
}
