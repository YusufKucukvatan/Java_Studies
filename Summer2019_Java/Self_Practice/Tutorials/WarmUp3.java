package Tutorials;

public class WarmUp3 {
	public static void main(String[] args) {
		int[] numbers = { 3, 17, 25, 39, 18, 13, 29, 24 };
		
		for (int i = 0; i < numbers.length; i++) {
			
			for (int j = i+1; j < numbers.length; j++) {
				if(numbers[i]+numbers[j]==42) {
					System.out.println(numbers[i]+"+"+numbers[j]+"=42");
				}
			}
		}
	}
}
