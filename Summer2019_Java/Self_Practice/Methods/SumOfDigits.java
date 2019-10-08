package Methods;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Please enter any number more than 5 digits: ");
		int num=scan.nextInt();
		sumDigits(num);
	}

	private static void sumDigits(int num) {
		int lastDigit=0;
		int sumOfDigits=0;
		while(num>0){
			lastDigit=num%10;
			num=(num-lastDigit)/10;
			sumOfDigits+=lastDigit;
		}
		System.out.println("Sum of the digits you have entered is "+sumOfDigits);
	}

}
