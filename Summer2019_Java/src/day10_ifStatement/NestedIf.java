package day10_ifStatement;

public class NestedIf {
	
	public static void main(String[] args) {
		
		// Nested if statement: If any if condition includes any other if condition, it is called nested if statements.
		int grade = 101;
		
		if (0<=grade && grade<=100) {
			
			if (grade>=90) {
			System.out.println("Your grade is A.");
			}
			else if (grade>=80) {
			System.out.println("Your grade is B.");
			}
			else if (grade>=70) {
			System.out.println("Your grade is C.");
			}else if (grade>=60) {
			System.out.println("Your grade is D.");
			}
			if (grade>=60) {
				System.out.println("Congradulations! You passed the exam...");
			}
			else if (grade>=50) {
			System.out.println("Your grade is F.");
			}
			else if (grade>=40) {
			System.out.println("Your grade is G.");
			}
			else if (grade>=30) {
			System.out.println("Your grade is H.");
			}
			else if (grade>=20) {
			System.out.println("Your grade is I.");
			}
			else if (grade>=10) {
			System.out.println("Your grade is J.");
			}
			else if (grade>=00) {
			System.out.println("Your grade is K.");
			}
			if (grade<=59) {
				System.out.println("You failed the exam. Next time, you should work harder...");
			}
		}
			else {
				System.out.println("You have typed an invalid score.");
			}
				
			
			
	}

}
