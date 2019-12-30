package TutorialWeek4;

import java.util.Scanner;

public class ReturnMethods {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int num3=2;
		int num4=3;
		int num5=9;
		
		Scanner input=new Scanner(System.in);
		String str3=input.next();
		
		sum(num1,num2);
		sum(num1,num2,num5);
		multiplication(num1, num2);
		System.out.println(sum(num1,num2,num5));
		
		float c = sum(num3, num4)+199;
		System.out.println((int)c);
		
		double bmi1=bodyMassIndex(46, 1.48);
		double bmi2=bodyMassIndex(43, 1.48);
		double bmi3=bodyMassIndex(49, 1.48);
		double bmi4=bodyMassIndex(40, 1.48);
		double bmi5=bodyMassIndex(39, 1.48);
		double bmi6=bodyMassIndex(55, 1.48);
		
		String str1="Cybertek";
		System.out.println(comeBack(str3));
		
	}

	private static String comeBack(String str1) {
		
	return str1;
	}

	public static double bodyMassIndex(int a, double b) {
		double c=a/(b*b);
		System.out.println("Body mass index is "+c );
		return c;
	}

	private static float sum(int num3, int num4) {
		int result=(num4-num3)+sum(num3, num4, num3);
		return result;
	}
	public static int sum(int a, int b, int c) {
		int result=(a+b)*multiplication(2, 3);
		return result;
	}
	public static int sum(int a, int b, double c) {
		int result=(a+b)*multiplication(2, 3);
		return result;
	}

	public static int multiplication(int a, int b) {

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				if (i * j <= 100) {
					System.out.println(i+"*"+j+"=" + i * j);
					continue;
				} 
			}
		}
		return a;
	}
}
