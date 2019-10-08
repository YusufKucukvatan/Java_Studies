package Assignments;

public class Number_Positive_Negative {
	public static void main(String[] args) {
		
		int num;
		num=-2;
		
		if (num > 0) {
			System.out.println(num+" is a positive number.");
		}
		
		if (num<0) {
			System.out.println(num+" is a negative number.");
		}
		
		if (num==0) {
			System.out.println(num+" is zero.");
		}
		
		
		// other way
		
		double number;
		number=3-14.50;
		String result="";
		
		if (number>0) {
			result=number+" is a positive number.";
		}
		else if(number<0) {
			result=number+" is a negative number.";
		}
		
		else {
			result=number+" is zero.";
		}
		System.out.println(result);
	}

}
