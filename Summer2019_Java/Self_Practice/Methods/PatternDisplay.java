package Methods;

import java.util.Scanner;

public class PatternDisplay {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Please enter a number to print a pattern: ");
		int n=scan.nextInt();
		displayPattern(n);
	}

	private static void displayPattern(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = n-1-i; j > 0; j--) {
				System.out.print("  ");
			}
			for (int j = i+1; j > 0; j--) {
				System.out.print(" "+j);
			}
			System.out.println();
		}
	}

}
