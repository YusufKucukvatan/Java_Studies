package day15_Scanner_StringClass;

import java.util.Scanner;

public class Task02 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the first number: ");
	double n1 = input.nextDouble();
	
	System.out.println("Enter the secon number: ");
	double n2 = input.nextDouble();
	
	System.out.println("Enter third number: ");
	double n3 = input.nextDouble();
	
	double largest = (n1>n2 && n1>n3) ? n1 : (n2>n1 && n2>n3) ? n2 : n3;
	System.out.println("The largest number you have entered is: "+largest);
}
}
