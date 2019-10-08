package day19_Loops;

import java.util.Scanner;

public class WarmUp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Please enter your username: ");
		String username = scan.nextLine().toLowerCase().trim();
		System.out.print("Please enter your password: ");
		String password = scan.nextLine();

		boolean gmailcom = username.endsWith("@gmail.com");
		boolean user = username.equalsIgnoreCase("cybertek@gmail.com");
		boolean pass = password.equals("Javengers");

		if (gmailcom) {
			if (user&&pass) {
				System.out.println("\nLogged in successfully...");
			} 
			else if(user&&!pass){
				System.err.println("\nInvalid password...");
			}
			else if(!user&&pass){
				System.err.println("\nInvalid username...");
				
			}
			else {
				System.err.println("Invalid username or password...");
			}
		}
		else {
			System.err.println("It is not a valid address!");
		}
	}

}
