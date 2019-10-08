package Loops;

import java.util.Scanner;

public class SubtractionQuiz {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			System.out.println("Please enter the result of subtraction: ");
			int i=0;
			int truecounter=0;
			int wrongcounter=0;
			while(i<5) {
				int num1=(int)(Math.random()*10);
				int num2=(int)(Math.random()*10);
				if(num2>=num1) {
					int numtemp=num2;
					num2=num1;
					num1=numtemp;
				}
				System.out.print(num1+"-"+num2+"=");
				int result=scan.nextInt();
				if(result==(num1-num2)) {
					System.out.println("Result is true.");
					truecounter++;
				}
				else {
					System.err.println("Result is wrong.");
					wrongcounter++;
				}
				i++;
			}
			System.out.println("\nYou have "+truecounter+" true and "+wrongcounter+" wrong answer out of 5 substraction questions.");
	}
}
