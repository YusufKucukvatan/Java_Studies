package Assignments;

import java.util.Scanner;

public class TotalDiscount {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Cybertek Store...");
		System.out.print("Please enter price of the item: ");
		float price = input.nextFloat();
		System.out.println("\nPlease enter quantity of the item :");
		float quantity = input.nextFloat();
		
		float grandTotal = price * quantity;
		float discount;
		float applied;
		
		if (quantity < 100) {
			discount = 0;
			applied = 0;
		}
		else if (100<= quantity && quantity <= 120) {
			discount = 10;
			applied = grandTotal * 10 / 100;
		}
		else {
			discount = 15;
			applied = grandTotal * 15 / 100;
		}
		float total = grandTotal - applied;
		
		System.out.println("\nGrand Total: $"+grandTotal);
		System.out.println("Discount: %"+discount);
		System.out.println("Discount Applied: $"+applied);
		System.out.println("Total: $"+total);
		
	}

}
