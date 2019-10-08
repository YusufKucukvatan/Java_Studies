package day29_ReturnMethods;

public class returnStatement {
	public static void main(String[] args) {
		System.out.println("Hello World");
		if (true) {
			//return;
		}
		System.out.println("Hola"); // Dead code. It will be never printed...

		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				break;
			}
			System.out.println(i);
		}
		int x=12;
		int y=5;
		sum(x, y);
		
		float e=2;
		float f=3;
		sum(e, f);
	}


	private static int sum(int a, int b) {
		int result=a-b;
		boolean d=false;
		System.out.println(result);
		return result;
	}
	private static double sum(float a, float b) {
		System.out.println(a+b);
		return a+b;
	}

}
