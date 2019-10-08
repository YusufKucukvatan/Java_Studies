package Loops;

import java.util.Scanner;

public class AaaaSubtractionQuizTimer {
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);

		long startTime = System.currentTimeMillis();

		int count = 0;
		int correct = 0;
		int wrong = 0;

		while (count < 5) {

			int num1 = (int) (Math.random()*10);
			int num2 = (int) (Math.random()*10);

			if (num2 > num1) {
				int tempNum = num1;
				num1 = num2;
				num2 = tempNum;
			}

			System.out.print("Please enter your result: " + num1 + "-" + num2 + "= ");
			int result = scann.nextInt();
			if (result == (num1 - num2)) {
				System.out.println("This answer is correct...");
				correct++;

			} else {
				System.err.println("This answer is wrong!");
				wrong++;
			}
			count++;
		}
		String report = "\nYou have " + correct + " correct answer and " + wrong + " wrong answer out of "+count+" questions.";
		System.out.println(report);
		long endTime = System.currentTimeMillis();
		long totalTime = (int) (endTime - startTime) / 1000;
		String time = "Total quiz time is: " + totalTime + " seconds.";
		System.out.println(time);

	}

}
