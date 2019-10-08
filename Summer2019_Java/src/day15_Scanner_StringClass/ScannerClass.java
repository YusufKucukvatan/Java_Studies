package day15_Scanner_StringClass;


import java.util.Scanner; // imports Scanner class only
import java.util.*; // imports all classes from package

// package name: java.util
// class name: Scanner

public class ScannerClass {

	static public void main(String... args) {

		
		Scanner scan = new Scanner (System.in);
		
		//System.out.print("Enter your phone: ");
		//int phone = scan.nextInt();
		//System.out.println("Your phone is: "+phone);
		
		System.out.print("enter your first name, middle name and last name: ");
		String name = scan.nextLine();
		System.out.println("Your name is: "+name);
		
		System.out.println("\n//////////////////////////////\n");
		
		System.out.print("enter your first name, middle name and last name: ");
		String firstname = scan.next();
		System.out.println("Your first name is: "+firstname);
		String midname = scan.next();
		System.out.println("Your middle name is: "+midname);
		String lastname = scan.next();
		System.out.println("Your last name is: "+lastname);
		
		System.out.print("Enter your phone: ");
		int phone4=scan.nextInt();
		System.out.println("Your phone is :"+phone4);
		
		scan.nextLine();
		
		System.out.print("enter your name: ");
		String name1 = scan.nextLine();
		System.out.println("Your name is: "+name1);
		
		
		
		System.out.println("////////////////////////");
		
		
		
		System.out.print("Please enter int value: ");
		int int1 = scan.nextInt();
		
		System.out.print("Please enter byte value: ");
		byte byte1 = (byte) scan.nextShort(); // Explicit casting works for this...
		
		System.out.print("Please enter double value: ");
		double double1 = scan.nextDouble();
		
		System.out.print("Please enter float value: ");
		float float1 = scan.nextFloat();
		
		System.out.print("Please enter int value: ");
		int int2 = (int) scan.nextFloat();
		
		System.out.print("Please enter boolean value: ");
		boolean bool1 = scan.hasNextBoolean();

		
		System.out.print("Thank you...");
		
		
	}
}