package day49_Abstract;

abstract class Shape1 {

	public abstract void area(int x, int y);

	public abstract void perimeter();
	

}

class Circle1 extends Shape1 {
	public static Circle1 obj1;
	int r = 3;

	@Override
	public void area(int r, int z) {
		System.out.println("Circle area is " + Math.PI * r * r);
	}

	@Override
	public void perimeter() {
		System.out.println("Circle perimeter is " + 2 * Math.PI * r);

	}

}

class Rectangle1 extends Shape1 {
	int length = 3;
	int width = 4;

	@Override
	public void area(int a, int b) {
		System.out.println("Rectangle area is " + a * b);

	}

	@Override
	public void perimeter() {
		System.out.println("Rectangle perimeter is " + 2 * (length + width));

	}

}

public class Practice {
	public static void main(String[] args) {
		
		Circle1 obj1=new Circle1();
		obj1.area(3,5);
		obj1.perimeter();
		
		Rectangle1 obj2=new Rectangle1();
		obj2.area(2,4);
		obj2.perimeter();
		
		
	}

}
