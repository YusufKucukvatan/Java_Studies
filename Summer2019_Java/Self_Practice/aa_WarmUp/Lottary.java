package aa_WarmUp;

import java.util.Scanner;

public class Lottary {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to Cybertek Lottery...");
		System.out.print("Please enter your 5 digits ticket number: ");
		int ticket = scan.nextInt();
		int digit1 = ticket % 100000;
		int digit2 = ticket % 10000;
		int digit3 = ticket % 1000;
		int digit4 = ticket % 100;
		int digit5 = ticket % 10;

		double random1 = Math.random(); // I didn't print random because I will use it for lottery int variable.
		int lottery1 = (int) (random1 * 9 + 1);// random method always gives a double number between 0 and 1. 
		double random2 = Math.random();
		int lottery2 = (int) (random2 * 9 + 1);// By multiplying by 9 and adding 1 it will always give us a number between 1 and 9.9999999.
		double random3 = Math.random();
		int lottery3 = (int) (random3 * 9 + 1);// We cast this random number to int, means that 9.99999 will be 9 through   casting int.
		double random4 = Math.random();
		int lottery4 = (int) (random4 * 9 + 1);
		double random5 = Math.random();
		int lottery5 = (int) (random5 * 9 + 1);

		System.out.println("\nLucky Number is: " + lottery1 + lottery2 + lottery3 + lottery4 + lottery5);

		boolean validticket = 10000 <= ticket && ticket <= 99999;

		boolean dollar100000 = digit5 == lottery5 && digit4 == lottery4 && digit3 == lottery3 && digit2 == lottery2 && digit1 == lottery1;
		boolean dollar10000 = digit5 == lottery5 && digit4 == lottery4 && digit3 == lottery3 && digit2 == lottery2;
		boolean dollar1000 = digit5 == lottery5 && digit4 == lottery4 && digit3 == lottery3;
		boolean dollar100 = digit5 == lottery5 && digit4 == lottery4;
		boolean dollar10 = digit5 == lottery5;

		String prize1 = "JACKPOT!!! Congratulations, you win the Biggest Prize... $100.000";
		String prize2 = "BINGO!!! Congratulations, you win $10.000 prize... ";
		String prize3 = "Congratulations, you win $1.000 prize... ";
		String prize4 = "Congratulations, you win $100 prize... ";
		String prize5 = "Congratulations, you win $10 prize... ";
		String noPrize = "Unfortunately, you missed the target this time... Nextweek try again JACKPOT...";
		String prize = "";
		
		if (validticket) {
			prize = (dollar100000)?prize1
						:(dollar10000)?prize1
							:(dollar1000)?prize1
								:(dollar100)?prize1
									:(dollar10)?prize1
										:noPrize;
			System.out.println(prize);
		}	
		else
			System.out.println("The ticket number you have entered is not valid. Please try again...");
		
		/*
			  if (dollar100000)
				System.out.println("JACKPOT!!! Congratulations, you win the Biggest Prize... $100.000");
			else if (dollar10000)
				System.out.println("BINGO!!! Congratulations, you win $10.000 prize...");
			else if (dollar1000)
				System.out.println("Congratulations, you win $1.000 prize...");
			else if (dollar100)
				System.out.println("Congratulations, you win $100 prize...");
			else if (dollar10)
				System.out.println("Congratulations, you win $10 prize...");

			else
				System.out.println("Unfortunately, you missed the target this time... Nextweek try again JACKPOT...");
									
			 */
				 
		
	}

}
		//long currenttimemilles = System.currentTimeMillis();==>
		// System.currentTimeMillis gives us a random number between 0 and 99.
		// Value type of the currentTimeMillis is long. IOT use this value as int, we
		// have to cast it into the int.
		// however, we have to keep mind that if we use more than one currentTimeMillis
		// in one code, we will get all the same numbers.
		// because it uses the millisecond part of the computer time.
		// Math.random uses probably one of millis digit.

