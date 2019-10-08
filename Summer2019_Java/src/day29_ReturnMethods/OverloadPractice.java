package day29_ReturnMethods;

public class OverloadPractice {
	public static void main(int[] args) {
		System.out.println("int array");
	}
	public static void main(double[] args) {
		System.out.println("double array");
	}
	public static void main(boolean[] args) {
		System.out.println("boolean array");
	}
	public static void main(String[] args) { //Only main method is printed regardless of its place...
		System.out.println("String array");
	}

}
