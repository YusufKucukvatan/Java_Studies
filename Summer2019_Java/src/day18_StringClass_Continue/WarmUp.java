package day18_StringClass_Continue;

import java.util.Scanner;

public class WarmUp {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your first name: ");
		String first=input.nextLine().toUpperCase();
		System.out.println("Please enter your last name: ");
		String last=input.nextLine().toUpperCase();
		String initial1=""+first.charAt(0)+last.charAt(0);
		String initial2=""+first.substring(0,1)+last.substring(0,1);
		System.out.println("Your initial-1 is: "+initial1);
		System.out.println("Your initial-2 is: "+initial2);
		
		int index1=first.indexOf('U',5);
		int index2=first.lastIndexOf('U',10);
		System.out.println(index1);
		System.out.println(index2);

		int compare1=first.compareToIgnoreCase(last); //==>14 Because, Y comes 14 character later on ASCII Table...
		System.out.println(compare1);
		int a=12345;
		boolean b=2>1;
		char c='A';
		char d=65;
		String s=String.valueOf(a);
		String s1=String.valueOf(b);
		String s3=String.valueOf(c);
		String s4=String.valueOf(d);
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s3);
		System.out.println(s4+s1);
		
	}

}
