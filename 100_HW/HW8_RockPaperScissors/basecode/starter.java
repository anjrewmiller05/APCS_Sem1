/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Would you like to play the computer? (yes / no)");
    String input = sc.nextLine();
    
    while (input.equals("yes") || input.equals("no") || input.equals("done")) {
        if (input.equals("yes")) {
            System.out.println("----------------------------------------------------");
            System.out.println("Pick rock, paper, or scissors");
            String rock = sc.nextLine();
            int num = (int)(Math.random()*3);
            
            
            if ((num == 0) && (rock.equals("rock"))) {
                System.out.println("You lost! :(");
                
                
            }
            else if ((num == 0) && (rock.equals("paper"))) {
                System.out.println("You tied!");
                
                
            }
            else if ((num == 0) && (rock.equals("scissors"))) {
                System.out.println("You Won!");
                
                
            }
            
            if ((num == 1) && (rock.equals("rock"))) {
                System.out.println("You Won!");
                
                
            }
            else if ((num == 1) && (rock.equals("paper"))) {
                System.out.println("You lost! :(");
                
                
            }
            else if ((num == 1) && (rock.equals("scissors"))) {
                System.out.println("You tied!");
                
                
            }
            
            if ((num == 2) && (rock.equals("rock"))) {
                System.out.println("You tied!");
                
                
            }
            else if ((num == 2) && (rock.equals("paper"))) {
                System.out.println("You Won!");
                
                
            }
            else if ((num == 2) && (rock.equals("scissors"))) {
                System.out.println("You lost! :(");
                
                
            }
            System.out.println("----------------------------------------------------");
            System.out.println("Would you like to play the computer? (yes / no / done)");
            input = sc.nextLine();
        }
        else if (input.equals("no")) {
            System.out.println("----------------------------------------------------");
            System.out.println("How many times would you like the computer to play itself?");
            int times = 0;
            int ties = 0;
            int player1wins = 0;
            int player2wins = 0;
            int num67 = sc.nextInt();
            while (times < num67) {
                
                int player1 = (int)(Math.random() * 3);
                int player2 = (int)(Math.random() * 3);
                
                if (player1 == player2) {
                    ties = ties + 1;
                    times = times + 1;
                }
                else if ((player1 == 1) && (player2 == 0)) {
                    player1wins = player1wins + 1;
                    times = times + 1;
                    
                }
                else if ((player1 == 1) && (player2 == 2)) {
                    player2wins = player2wins + 1;
                    times = times + 1;
                }
                else if ((player1 == 0) && (player2 == 2)) {
                    player1wins = player1wins + 1;
                    times = times + 1;
                }
                else if ((player1 == 0) && (player2 == 1)) {
                    player2wins = player2wins + 1;
                    times = times + 1;
                }
                else if ((player1 == 2) && (player2 == 0)) {
                    player2wins = player2wins + 1;
                    times = times + 1;
                }
                else if ((player1 == 2) && (player2 == 1)) {
                    player1wins = player1wins + 1;
                    times = times + 1;
                }
            }
            
            System.out.println("----------------------------------------------------");
            System.out.println("Player 1 Wins: " + player1wins);
            System.out.println("Player 2 Wins: " + player2wins);
            System.out.println("Ties: " + ties);
            System.out.println("----------------------------------------------------");
            System.out.println("Would you like to play the computer? (yes / no / done)");
            sc.nextLine();
            input = sc.nextLine();
        }
        
        if (input.equals("done")) {
            System.out.println("Thanks for playing!");
            break;
        }
    
    }
    }
}
