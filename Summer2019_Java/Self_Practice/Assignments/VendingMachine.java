package Assignments;

import java.util.Scanner;

public class VendingMachine {
	public static void main(String[] args) {
		
		
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Welcome to Cybertek Vending Machine...\nPlease select any item to purchase...");
		System.out.print("Please enter price of the item: \n");
		double priceOfItem = input.nextDouble();
		System.out.println("Please enter how many bills you have inserted... \n");
		double moneyInserted = input.nextDouble();
		
		
		int moneyInCent = (int) (moneyInserted * 100);
		int moneyBack = (int)(moneyInCent - priceOfItem*100);
		int bill = moneyBack/100;
		int quarter = (moneyBack-bill*100)/25;
		int dime = (moneyBack-bill*100-quarter*25)/10;
		int nickel = (moneyBack-bill*100-quarter*25-dime*10)/5;
		int penny = moneyBack-bill*100-quarter*25-dime*10-nickel*5;
		String change = "Your change is "+bill+" dollars, "+quarter+" quarters, "+ dime +" dimes, "+nickel+ " nickels, "+penny+"pennies.";
		System.out.println(change);
	}

}
