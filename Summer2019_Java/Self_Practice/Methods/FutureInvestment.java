package Methods;

import java.util.Scanner;

public class FutureInvestment {
	public static void main(String[] args) {
		double investmentAmount = 0;
		double monthlyInterestRate = 0;
		int year = 0;
		futureInvestmentValue(investmentAmount, monthlyInterestRate, year);
	}

	private static void futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int year) {
		getInputs(investmentAmount, monthlyInterestRate, year);
		System.out.println("Years:           Future Value:");
		double futureValue=investmentAmount;
		for (int i = 0; i < year; i++) {
			futureValue+=futureValue*(monthlyInterestRate/100);
			System.out.print(" "+year+"         "+futureValue);
		}
	
	}

	private static void getInputs(double investmentAmount, double monthlyInterestRate, int year) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the input successively: ");
		System.out.print("Investment amount: ");
		investmentAmount=scan.nextDouble();
		System.out.print("Monthly interest rate: ");
		monthlyInterestRate=scan.nextDouble();
		System.out.print("Year: ");
		year=scan.nextInt();
		
	}
}