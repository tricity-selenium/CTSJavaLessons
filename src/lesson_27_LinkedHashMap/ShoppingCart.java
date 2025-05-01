package lesson_27_LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ShoppingCart {

	public static void main(String[] args) {
		
		 LinkedHashMap<String, Integer> cart = new LinkedHashMap<>();
	     Scanner scanner = new Scanner(System.in);
	     String product;
	     int quantity;
	     
	     while (true) {
	            System.out.println("\n1. Add Item");
	            System.out.println("2. View Cart");
	            System.out.println("3. Remove Item");
	            System.out.println("4. Exit");
	            System.out.print("Choose an option: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // consume newline
	            
	            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    product = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    quantity = scanner.nextInt();
                    scanner.nextLine();

                    // Update quantity if already exists
                    cart.put(product, cart.getOrDefault(product, 0) + quantity);
                    System.out.println(product + " added to cart.");
                    break;
                    
                case 2:
                    System.out.println("\nYour Cart:");
                    if (cart.isEmpty()) {
                        System.out.println("Cart is empty.");
                    } else {
                        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
                            System.out.println(entry.getKey() + " - Qty: " + entry.getValue());
                        }
                    }
                    break;
                    
                case 3:
                    System.out.print("Enter product to remove: ");
                    product = scanner.nextLine();
                    if (cart.containsKey(product)) {
                        cart.remove(product);
                        System.out.println(product + " removed from cart.");
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;

                case 4:
                    System.out.println("Thanks for shopping!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
             	}
	       }
	}
}
