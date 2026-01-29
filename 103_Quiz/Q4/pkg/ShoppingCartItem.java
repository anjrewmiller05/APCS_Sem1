package pkg;
import java.util.*;

public class ShoppingCartItem {
    
    private String name;
    private double price;
    private int amount;
    
    public ShoppingCartItem() {
        name = "Nothing";
        price = 0.0;
        amount = 0;
    }
    
    public ShoppingCartItem(String n, double p, int a) {
        name = n;
        price = p;
        amount = a;
    }
    
    public void cartToString() {
        System.out.println("You have " + amount + " of " + name + " for $" + price + " each.");
    }
    
    public String getItemName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getQuantity() {
        return amount;
    }
    
    public double getTotalCost() {
        double total;
        total = price * amount;
        return total;
    }
    
    public double getTotalWithTax() {
        double total;
        double totalwtax;
        total = price * amount;
        totalwtax = total * 1.12;
        return totalwtax;
    }
    
    public double quantityToCostCalculator(int q) {
        double cost;
        cost = price * q;
        return cost;
    }
    
    public boolean compareItemCost(ShoppingCartItem q) {
        double p = q.getPrice();
        if (price > p) {
            return false;
        }
        else {
            return true;
        }
    }
    
    public ShoppingCartItem copyCart() {
        
        return this;
    }
}
