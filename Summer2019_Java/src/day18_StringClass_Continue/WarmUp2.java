package day18_StringClass_Continue;

import java.util.Scanner;

public class WarmUp2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your first name: ");
		String first=input.nextLine().toLowerCase();
		String last=input.nextLine().toLowerCase();
		
		String full=first.substring(0,1).toUpperCase()+first.substring(1)+" "+last.substring(0,1).toUpperCase()+last.substring(1);
		System.out.println(full);

	}
}