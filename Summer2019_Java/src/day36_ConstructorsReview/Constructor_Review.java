package day36_ConstructorsReview;

public class Constructor_Review {
	public Constructor_Review() {
		this(2.1);
		System.out.println("A");
	}
	public Constructor_Review(int a, int b) {
		this(2.1);
		a=10;
		b=20;
		System.out.println("B");
	}
	public Constructor_Review(double a) {
//		this(2);
		System.out.println("C");
	}
	public static void sum(int a, int b) {
		int sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		Constructor_Review obj1=new Constructor_Review(1);
	}
}
