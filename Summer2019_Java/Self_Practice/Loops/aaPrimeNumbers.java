package Loops;

public class aaPrimeNumbers {
	public static void main(String[] args) {

		System.out.println("Prime numbers up to 100 are:");
		int counter = 0;
		int number = 2;
	
		while (counter < 10) {
			boolean primeNumber = true;
			
			for (int i = 2; i < number; i++) {
				if (number % i==0) {
					primeNumber = false;
				} 
			}
			if (primeNumber==true) {
			counter++;
			System.out.println(counter + ". prime number is: " + number);
			}
			number++;
		}

	}

}
