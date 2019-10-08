package day21_WhileLoops;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer="";
		do {
			System.out.print("Enter first number: ");
			int num1=scan.nextInt();
			System.out.print("Enter second number: ");
			int num2=scan.nextInt();
			System.out.println("Addition is: "+(num1+num2));
			System.out.print("Do you want to continue?");
			answer=scan.next();
			
		} while (answer.equalsIgnoreCase("yes"));
	}
}
