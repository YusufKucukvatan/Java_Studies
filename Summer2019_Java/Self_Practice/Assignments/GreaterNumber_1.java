package Assignments;

public class GreaterNumber_1 {
	public static void main(String[] args) {
		int num1, num2, nummax;
		num1=20;
		num2=20;
		if (num2>num1) {
			nummax=num2;
			System.out.println("Maximum number is: "+nummax);
		}
		
		else if (num2 < num1) {
			nummax=num1;
			System.out.println("Maximum number is: "+nummax);

		}
		
		else {
			System.out.println("num1 equals to num2.");
		}
	}

}
