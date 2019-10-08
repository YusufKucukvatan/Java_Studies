package Methods;

import java.util.Scanner;

public class SortedNumbers {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter al least three numbers: ");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		displaySortedNumbers(num1 ,num2, num3);
	}

	private static void displaySortedNumbers(int num1, int num2, int num3) {
		if(num1>num2&&num1>num3&&num2>num3)
			System.out.println("Order is: "+num1+" "+num2+" "+num3);
		if(num1>num2&&num1>num3&&num3>num2)
			System.out.println("Order is: "+num1+" "+num3+" "+num2);
		if(num2>num1&&num2>num3&&num1>num3)
			System.out.println("Order is: "+num2+" "+num1+" "+num3);
		if(num2>num1&&num2>num3&&num3>num1)
			System.out.println("Order is: "+num2+" "+num3+" "+num1);
		if(num3>num1&&num3>num2&&num1>num2)
			System.out.println("Order is: "+num3+" "+num1+" "+num2);
		if(num3>num2&&num3>num1&&num2>num1)
			System.out.println("Order is: "+num3+" "+num2+" "+num1);

	}
}
