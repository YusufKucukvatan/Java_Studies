package day10_ifStatement;

public class NestedIf_Boolean {

	public static void main(String[] args) {
			
			int grade = 91;
			boolean validgrade= 0<=grade && grade<=100;
			boolean gradeA=grade>=90;
			boolean gradeB=grade>=80;
			boolean gradeC=grade>=70;
			boolean gradeD=grade>=60;	
			boolean gradeF=grade<60;
			String passed="Congradulations! You passed the exam...";
			String failed="You failed the exam. Next time, you should work harder...";
			String invalid="You have typed an invalid score.";
			
			if (validgrade) {
				
				if (gradeA) {
				System.out.println("Your grade is A.");
				}
				else if (gradeB) {
				System.out.println("Your grade is B.");
				}
				else if (gradeC) {
				System.out.println("Your grade is C.");
				}else if (gradeD) {
				System.out.println("Your grade is D.");
				}
				if (grade>=60) {
					System.out.println(passed);
				}
				else if (gradeF) {
				System.out.println("Your grade is F.");
				}
				
				if (grade<=59) {
					System.out.println(failed);
				}
			}
				
			else {
					System.out.println(invalid);
				}
						
				
	}
}
