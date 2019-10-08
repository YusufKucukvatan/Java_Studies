package aa_WarmUp;

import java.util.Scanner;

public class HondaSale_4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Welcome to CyberTek Honda Plaza...\nPlease enter your salary: ");
		
		System.out.print("enter your first name and last name: ");
		String firstname = input.next();
		String lastname = input.next();
		char initial1 = firstname.charAt(0);
		char initial2 = lastname.charAt(0);
		String initial= (""+initial1+initial2).toUpperCase();
		
		System.out.print("Please enter your salary: ");
		int salary = input.nextInt();
		System.out.print("Please enter amount that you have in your bank account: ");
		int cashinpocket = input.nextInt();
		int maxloan = salary * 10;
		int budget = cashinpocket + maxloan;

		System.out.print("Please choose your income sitiuation (true=good, false=not good): ");
		boolean hasgoodincome = input.nextBoolean();
		System.out.print("Please choose your credit score sitiuation(true=good, false=not good): ");
		boolean hasgoodcreditscore = input.nextBoolean();
		System.out.print("Do you have any criminal report? (true=You don't have, false=You have): ");
		boolean nocriminalreport = input.nextBoolean();
		System.out.print("Do yo have state driving liecence?(true=You have, false=You don't have): ");
		boolean hasliecense = input.nextBoolean();

		if (hasgoodcreditscore == true) {
			budget = cashinpocket + maxloan;
		} else {
			budget = cashinpocket;
		}
		
		boolean eligible = (hasgoodincome || hasgoodcreditscore) && (hasliecense && nocriminalreport);
		boolean valid = salary >= 0 && cashinpocket >= 0;
		boolean insufficientbudget = budget < 20_000;
		boolean Pilot = budget >= 50_000;
		boolean Odyssey = budget >= 40_000;
		boolean CRV = budget >= 35_000;
		boolean Accord = budget >= 30_000;
		boolean Civic = budget >= 25_000;
		boolean Fit = budget >= 20_000;
		
		String youcan = "You are eligible to purchase Honda models below that we have in the showroom:";
		String youcan_t = "Your budget is not available to purchase any Honda model that we have in the showroom. Please search for used cars on Craig's List. Thank you";
		String Pilot1 = "- Pilot\n- Odyssey\n- CRV\n- Accord\n- Civic\n- Fit";
		String Odyssey1 = "- Odyssey\n- CRV\n- Accord\n- Civic\n- Fit";
		String CRV1 = "- CRV\n- Accord\n- Civic\n- Fit";
		String Accord1 = "- Accord\n- Civic\n- Fit";
		String Civic1 = "- Civic\n- Fit";
		String Fit1 = "- Fit";

		System.out.println("\n\nCustomer name: "+firstname);
		System.out.println("Customer lastname: "+lastname);
		System.out.println("You will use "+initial+" as your initial during your transaction.");
		int plate1 = (int)(Math.random()*10);
		int plate2 = (int)(Math.random()*10);
		int plate3 = (int)(Math.random()*10);
		
		if (eligible == true) {
			if (valid) {
				if (insufficientbudget) {
					System.out.println(youcan_t);
				} else {
					System.out.println("Your budget is $" + budget + "." + youcan);
					if (Pilot) {
						System.out.println(Pilot1);
					} else if (Odyssey) {
						System.out.println(Odyssey1);
					} else if (CRV) {
						System.out.println(CRV1);
					} else if (Accord) {
						System.out.println(Accord1);
					} else if (Civic) {
						System.out.println(Civic1);
					} else {
						System.out.println(Fit1);
					}
					System.out.println("Your plate is going to be: VA "+plate1+plate2+plate3+" "+initial);
				}
			} else {
				System.out.println("The amount you have typed is not valid.");
			}
		} else {
			System.out.println(
					"Unfortunately, you are not eligable to purchase a car. Please contact with your customer assistant for details.");
		}
	}
}
