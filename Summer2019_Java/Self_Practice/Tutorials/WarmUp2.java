package Tutorials;

public class WarmUp2 {
	public static void main(String[] args) {
		int[] numbers = { 3, 5, 7, 6, 5, 3, 2, 4, 6, 7, 9, 3, 4, 1, 8 };

		for (int i = 0; i < numbers.length-1; i++) {
			int count = 1;
			
			for (int j = i+1; j < numbers.length; j++) {
				
				if(numbers[i]==numbers[j]) {
					count++;
				}
			}
			if(count>1)
				System.out.println(numbers[i]+" occures "+count+" times.");
			
		}
	}
}
