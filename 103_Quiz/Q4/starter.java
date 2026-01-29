import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// All global variables should be 

		// Part 1
		ShoppingCartItem item1 = new ShoppingCartItem();					
		ShoppingCartItem item2 = new ShoppingCartItem("Carrot", 1.99, 10);		// itemName, itemCost, quantity
		ShoppingCartItem item3 = new ShoppingCartItem("Dumplings", 7.59, 6);		
		System.out.println("-----------------------------");

		// Part 2	---------------------------------------------
		
		item1.cartToString();
		item2.cartToString();
		item3.cartToString();
		System.out.println("-----------------------------");
		

		// Part 3	---------------------------------------------
		
		System.out.println(item2.getItemName() +" total cost of " + item2.getQuantity() + " items is: " + item2.getTotalCost());
		System.out.println(item2.getItemName() + " total cost of " + item2.getQuantity() + " items with 12% tax is: " + item2.getTotalWithTax());
		System.out.println("-----------------------------");
		

		// Part 4	---------------------------------------------
		
		System.out.println("If you wanted " + item2.getItemName() + ", 911 quantity, the cost could be: " + item2.quantityToCostCalculator(911));
		System.out.println("-----------------------------");
		

		// Part 5	---------------------------------------------
		
		if(item2.compareItemCost(item3)){
			System.out.println(item2.getItemName() + " is cheaper than " + item3.getItemName());
		}
		else{
			System.out.println(item3.getItemName() + " is cheaper than " + item2.getItemName());
		}
		

		// Part 6	---------------------------------------------
		
		System.out.println("");
		System.out.println("-----------------------------");
		
		ShoppingCartItem item4 = item2.copyCart();			// Populates item4 with a duplicate of item2
		item4.cartToString();
		

	}
}