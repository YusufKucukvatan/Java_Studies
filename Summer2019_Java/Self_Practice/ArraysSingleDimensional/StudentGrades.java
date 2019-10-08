package ArraysSingleDimensional;

import java.util.Arrays;
import java.util.Scanner;

public class StudentGrades {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Please enter the numbers of the score: ");
		int number=scan.nextInt();
		int[] scores=new int[number];
		int max=0;
		for (int i = 0; i < number; i++) {
			System.out.print("Please enter the score for student-"+i+": ");
			scores[i]=scan.nextInt();
			if(scores[i]>max)
				max=scores[i];
		}
		char grade=' ';
		for (int i = 0; i < scores.length; i++) {
			if(scores[i]>=max-10) {
				grade='A';
			}
			else if(scores[i]>=max-20) {
				grade='B';
			}
			else if(scores[i]>=max-30) {
				grade='C';
			}
			else if(scores[i]>=max-40) {
				grade='D';
			}
			else {
				grade='F';
			}
			System.out.println("Student "+i+" score is "+scores[i]+" and grade is "+grade+".");
				
		}
		
	}

}
