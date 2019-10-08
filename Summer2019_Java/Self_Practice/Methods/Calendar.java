package Methods;

import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Please enter the year: ");
		int year = scan.nextInt();
		System.out.print("Please enter the month: ");
		int month = scan.nextInt();

		printMonth(year, month);

	}

	private static void printMonth(int year, int month) {
		System.out.println(month + " " + year);
	}
}
