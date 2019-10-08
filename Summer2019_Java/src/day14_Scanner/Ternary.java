package day14_Scanner;

public class Ternary {
	public static void main(String[] args) {

		int num;

		if (true) {
			num = 100;
		} else {
			num = 50;
		}
		System.out.println(num); // ==> Result is 100

		// We are going to convert above statement to the ternary below

		num = (true) ? 100 : 50; // ==> This statement is exactly gives the same result as if statement above.

		System.out.println(num); // ==> Result is 100

		// if (condition) ==> (condition) ?
		// else ==> :
		// if else (condition) ==> : (condition) ?
		// We have to initialize the variable before ternary statement.

		////////////////////////////////////////////////////////////////////

		String Schoolname;
		boolean Batch12 = true;
		if (Batch12) {
			Schoolname = "Cybertek";
		} else {
			Schoolname = "Invalid";
		}
		System.out.println(Schoolname); // First way

		Schoolname = (Batch12) ? "Cybertek" : "Invalid"; // Second way
		System.out.println(Schoolname);

		System.out.println(Batch12 ? "Cybertek" : "Invalid");// Third way

		////////////////////////////////////////////////////////////////////

		double interestRate;
		boolean GoodCredit = true;
		interestRate = (GoodCredit == true) ? 0.5 : 0.9;
		System.out.println(interestRate);

		////////////////////////////////////////////////////////////////////

		byte grade = 60;
		boolean Passed = grade >= 60 ? true : false;
		System.out.println(Passed);

		////////////////////////////////////////////////////////////////////
		char FinalGrade = 'A';
		String Group;
		if (FinalGrade == 'A') {
			Group = "Eraly Bird";
		} else if (FinalGrade == 'B') {
			Group = "Group 1";
		} else if (FinalGrade == 'C') {
			Group = "Group 2";
		} else {
			Group = "After Group 2";
		}

		System.out.println(Group);

		Group = (FinalGrade == 'A') ? "Early Bird"
				: (FinalGrade == 'B') ? "Group 1" 
						: (FinalGrade == 'C') ? "Group 2"
								: "After Group 1";
		// Condition If Action else Condition If Action else Condition If Action else
		// Action
		System.out.println(Group);

		Group = (FinalGrade == 'A') ? "Early Bird" // ==> If Statement
				: (FinalGrade == 'B') ? "Group 1" // ==> Else If Statement
						: (FinalGrade == 'C') ? "Group 2" // ==> Else If Statement
								: "After Group 2"; // ==> Else Statement
		System.out.println(Group);

		////////////////////////////////////////////////////////////////////

		int score = 95;
		char Finals;

		if (score >= 90 && score <= 100) {
			Finals = 'A';
		} else if (score >= 80 && score < 90) {
			Finals = 'B';
		} else if (score >= 70 && score < 80) { // This If statements equal to the ternary statements below...
			Finals = 'C';
		} else if (score >= 60 && score < 70) {
			Finals = 'D';
		} else {
			Finals = 'F';
		}

		System.out.println(Finals);

		Finals = (score >= 90 && score <= 100) ? 'A' // ==> If Statement
				: (score >= 80 && score < 90) ? 'B' // ==> Else If Statement
						: (score >= 70 && score < 80) ? 'C' // ==> Else If Statement
								: (score >= 60 && score < 70) ? 'D' // ==> Else If Statement
										: 'F'; // ==> Else Statement
		System.out.println(Finals);

		////////////////////////////////////////////////////////////////////

		int num1 = 100, num2 = 200, num3 = 300;
		int nummax = (num1 > num2 && num1 > num3) ? num1

				: (num2 > num1 && num2 > num3) ? num2 : num3;
		System.out.println(nummax);
	}
}
