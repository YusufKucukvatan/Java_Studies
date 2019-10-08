package day29_ReturnMethods;

public class MethodOverLoading {
	public static void main(String[] args) {
		int num1=sum(3, 5);
		System.out.println(num1);
		int num2=sum(1, 2, 4);
		System.out.println(num2);
		double num3=sum(1, 2.4, 4.8);
		System.out.println(num3);
	}
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static int sum(int a, int b, int c) {
		return a+b*c;
	}
	public static double sum(int a, double b, double c) {
		return a+b-c;
	}
	

}
