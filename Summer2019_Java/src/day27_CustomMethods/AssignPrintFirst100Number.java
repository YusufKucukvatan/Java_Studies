package day27_CustomMethods;
import java.util.Arrays;
public class AssignPrintFirst100Number {
	public static void main(String[] args) {
		int[] numbers = assignNumbers();
		printNumbers(numbers);
		printEvenNumbers(numbers);
	}

	public static void printNumbers(int[] numbers) {
		for(int each:numbers) {
			System.err.printf("%4d", each);
			if(each%10==0)
				System.out.println();
		}
	}

	public static int[] assignNumbers() {
		int[] numbers=new int[100];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i]=i+1;
		}
		return numbers;
	}
	public static void printEvenNumbers(int[] numbers) {
		for(int each: numbers) {
			if(each%2==1)
				continue;
			System.out.printf("%4d",each);
			if(each%20==0)
				System.out.println();
		}
	}
}
