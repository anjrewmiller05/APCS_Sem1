/*
  
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        double pizza;
        double pasta;
        double redbull;
        pizza = 25.5;
        pasta = 50.75;
        redbull = 13.33;
        System.out.println("Welcome to ⭐⭐⭐⭐⭐ Michelin Star Resturaunt!");
        System.out.println("Here is our menu:");
        System.out.println("🍕 Pizza - $" + pizza);
        System.out.println("🍝 Pasta - $" + pasta);
        System.out.println("🍾 Red Bull - $" + redbull);
        
        System.out.println(" ");
        System.out.println("--------------------------------------------------");
        System.out.println(" ");
        
        System.out.println("What is the name for your order?");
        String name = sc.nextLine();
        
        System.out.println("How many Pizzas do you want?");
        int cpizza = sc.nextInt();
        
        System.out.println("How many servings of Pasta would you like?");
        int cpasta = sc.nextInt();
        
        System.out.println("How many Red Bulls would you like?");
        int credbull = sc.nextInt();
        
        double totalpizza = pizza * cpizza;
        double totalpasta = pasta * cpasta;
        double totalredbull = redbull * credbull;
        double total = totalpizza + totalpasta + totalredbull;
        
        System.out.println("Your current total in : $" + total);
        
        System.out.println("What percent would you like to tip?");
        double tip = sc.nextDouble();
        
        double tipamount = total * (tip / 100);
        double finaltotal = total + tipamount;
        
        System.out.println(" ");
        System.out.println("----------------------------------------------------");
        System.out.println(" ");
        
        System.out.println(name + "'s receipt");
        System.out.println(cpizza + " X Pizza = " + totalpizza);
        System.out.println(cpasta + " X Pasta = " + totalpasta);
        System.out.println(credbull + " X Red Bull = " + totalredbull);
        System.out.println("Tip (" + tip + "%) = " + tipamount);
        
        System.out.println("  ");
        System.out.println("--------------------------------------------------");
        System.out.println(" ");
        System.out.println("Grand total = " + finaltotal);
        
        System.out.println(" ");
        System.out.println("--------------------------------------------------");
        System.out.println(" ");
        System.out.println("That you for dining at the best resturaunt in the world!");
        
	}
}
