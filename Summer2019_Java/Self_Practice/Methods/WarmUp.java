package Methods;

public class WarmUp {
	public static void main(String[] args) {
		System.out.println("Sum of numbers are "+sum(1,10));
		System.out.println("Sum of numbers are "+sum(11,20));
		System.out.println("Sum of numbers are "+sum(21,30));
		
		System.out.println("3 times 5 equals to "+mult(3,5));
		
	}

	public static int sum(int num1, int num2) {
		int result=0;
		for (int j2 = num1; j2 <= num2; j2++) {
			result+=j2;
		} 
		return result;
	}
	public static int mult(int num1, int num2) {
		int result=num1*num2;
		return result;
		
	}
}
