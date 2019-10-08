package Methods;

public class PentagonalNumbers {
	public static void main(String[] args) {
		System.out.println("First 10 pentagonal numbers are: ");
		getPentagonalNumber(10);
	}

	public static void getPentagonalNumber(int x) {
		int result=0;
		for (int j = 1; j <= x; j++) {
		result=j*(3*j-1)/2;
		System.out.println(result);
		}
	
	}

}
