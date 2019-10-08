package Assignments;

public class GreatestNumber {
	public static void main(String[] args) {
		
		int n1, n2, n3;
		n1=4;
		n2=3;
		n3=5;
		
		if (n1>n2&&n1>n3) {
			System.out.println(n1+" is the greatest number.");
		}
		
		else if (n2>n1&&n2>n3) {
			System.out.println(n2+" is the greatest number.");
		}
		
		else if (n3>n1&&n3>n2) {
			System.out.println(n3+" is the greatest number.");
		}
		
		System.out.println("\n===================\n");
		
		// Or we can write the code in other way..
		
		int num1=100;
		int num2=19345;
		int num3=19345;
		int maxnum=0;
		String result = ".";
		
		if (num1>num2 && num1>num3) {
			result = "Greatest is "+num1;
		
		}
		
		else if(num2>num1 && num2>num3) {
			result = "Greatest is "+num2;
		}
		
		else if (num3>num1 && num3>num2) {
			result = "Greatest is "+num3;
		}
		
		else if (num3==num1 && num3>num2) {
			result = num1+" and "+num3+" is equal and greater than "+num2;
		}
		
		else if (num3==num2 && num3>num1) {
			result = num2+" and "+num3+" is equal and greater than "+num1;
		}
		
		else if (num1==num2 && num1>num3) {
			result = num2+" and "+num1+" is equal and greater than "+num3;
		}
		
		System.out.println(result);
	}
	

}
