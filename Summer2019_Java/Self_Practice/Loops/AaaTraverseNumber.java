package Loops;

import java.util.Scanner;

public class AaaTraverseNumber {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.print("\nPlease enter number for traverse: ");
	int traverse=scan.nextInt();
	for (int i = 1; i <=traverse; i++) {
		for (int j = 1; j <= i; j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	System.out.println();
	
	for (int i = 1; i <=traverse; i++) {
		for (int j = 1; j <= traverse+1-i; j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	System.out.println();
	
	for (int i = traverse; i >0; i--) {
		for (int j = i; j >0; j--) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	
}
}
