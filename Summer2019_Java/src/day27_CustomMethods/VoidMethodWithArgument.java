package day27_CustomMethods;

import java.util.Scanner;

public class VoidMethodWithArgument {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Please enter first number: ");
		int num1=scan.nextInt();
		System.out.print("Please enter second number: ");
		int num2=scan.nextInt();
		evenOrOdd(num1);
		evenOrOdd(num2);
		largerNumber(num1, num2);
	}
	public static void evenOrOdd(int n) {
		if(n%2==1)
			System.out.println(n+" is an odd number.");
		else
			System.out.println(n+" is an even number.");
	}
	public static void largerNumber(int n1, int n2) {
		if(n1>n2)
			System.out.println(n1+" is larger than "+n2+".");
		else if(n2>n1)
			System.out.println(n2+" is larger than "+n1+".");
		else
			System.out.println(n1+" and "+n2+" are equal");
	}
}
