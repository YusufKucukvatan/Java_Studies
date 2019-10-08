package Loops;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String answer = "";
		do {
			System.out.print("Please enter first number: ");
			int num1 = scan.nextInt();
			System.out.print("Please enter operation type: ");
			String operation = scan.next();
			System.out.print("Please enter second number: ");
			int num2 = scan.nextInt();
			if (operation.equals("+") || operation.equals("addition")) {
				System.out.println("Result is: " + (num1 + num2));
			}
			if (operation.equals("-") || operation.equals("subtraction")) {
				System.out.println("Result is: " + (num1 - num2));
			}
			if (operation.equals("*") || operation.equals("multiplication")) {
				System.out.println("Result is: " + (num1 * num2));
			}
			if (operation.equals("/") || operation.equals("division")) {
				System.out.println("Result is: " + (num1 / num2));
			}
			System.out.print("Do you want to continue? Answer: ");
			answer = scan.next();

			while (!(answer.equals("yes") || answer.equals("no"))) {
				System.out.print("Your answer is invalid. Please enter \"yes\" or \"no\".");
				answer = scan.next();
			}
			if (answer.equals("no")) {
				System.out.println("Good Bye!");
				break;
			}
		} while (answer.equals("yes"));
	}
}
