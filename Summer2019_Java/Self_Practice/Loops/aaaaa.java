package Loops;

import java.util.Scanner;

public class aaaaa {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = (int) (Math.random() * 101);
		
		System.out.print("Guess a magic number between 0 and 100: ");
		int guess = scan.nextInt();

		while (guess != num) {
			if (guess > num)
				System.out.println("Your guess is too high...");
			else
				System.out.println("Your guess is too low...");
			System.out.print("Please enter your guess again: ");
			guess = scan.nextInt();
		}
		System.out.println("Congratulations, the number is "+num);
	}
}
