package Loops;

import java.util.Scanner;

public class AaGreatestCommonDivisor {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Please enter first number: ");
	int num1=scan.nextInt();
	System.out.print("Please enter second number: ");
	int num2=scan.nextInt();
	
	int gcd = 1;
	int i=2;
	while(i<=num1 && i<=num2) {
		if (num1%i==0&&num2%i==0) {
			gcd=i;
		}
		i++;
	}
	System.out.println("Greatest Common Divisor for "+num1+" and "+num2+" is "+gcd);
}
}
