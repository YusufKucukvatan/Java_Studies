package day21_WhileLoops;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter first number: ");
		int num1=scan.nextInt();
		System.out.print("Please enter second number: ");
		int num2=scan.nextInt();
		
		int temp=0;
		if (num2<num1) {
			temp=num2;
			num2=num1;
			num1=temp;
		}
		for(int i=num1; i<=num2; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
		
	}

}

