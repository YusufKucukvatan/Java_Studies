package Loops;

import java.util.Scanner;

public class AaaTriangleNumbers {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int num = scan.nextInt();
		for (int i = 1; i <= num; i++) {
			
			for (int j = num-i; j > 0; j--) {
				System.out.print("**");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
				
			}
			for (int j = i-1; j > 0; j--) {
				System.out.print(j+" ");
				
			}
			System.out.println();
		}

	}

}
