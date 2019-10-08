package Assignments;

import java.util.Scanner;

public class URL {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your web address: ");
		String address = scan.nextLine();
		String domain = address.substring(4, address.length() - 4);
		String extension = address.substring(address.length() - 3, address.length());
		boolean www = address.substring(0, 3).equalsIgnoreCase("www");
		boolean dot = address.charAt(address.length() - 4) == '.';
		boolean checkExtension = extension.equals("com") || extension.equals("net") || extension.equals("edu")
				|| extension.equals("org") || extension.equals("gov");

		if (!www)
			System.err.println("Please type \"www\" correctly...");

		if (!dot)
			System.err.println("Please type \".\" right before your extension...");
		if (!checkExtension)
			System.err.println("Please type your extension correctly...");
		
		if (www && dot && checkExtension) {
			System.out.println("Your domain is: " + domain);
			System.out.println("Your extension is: " + extension);

		}
	}
}
