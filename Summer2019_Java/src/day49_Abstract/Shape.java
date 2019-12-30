package day49_Abstract;

public class Shape {
	
	protected double radius=0;
	double length=0;
	public double width=0;
	private double heigth=0;

	protected double area() {
		System.out.println("Area is 0 now...");
		return 0;
	}

	protected double perimeter() {
		System.out.println("Perimeter is 0 now...");
		return 0;
	}

	public double capacity() {
		System.out.println("Capacity is 0 now...");
		return 0;
	}

	public static void main(String[] args) {
		Shape obj=new Shape();
		obj.area();
		obj.perimeter();
		obj.capacity();
		
		System.out.println("=====================================");
		
		Circle obj1 = new Circle();
		System.out.println("Circle area is " + obj1.area());
		System.out.println("Circle perimeter is " + obj1.perimeter());
		System.out.println("Circle capacity is " + obj1.capacity());

		System.out.println("=====================================");
		Rectangle obj2 = new Rectangle();
		System.out.println("Rectangle capacity is " + obj2.area());
		System.out.println("Rectangle perimeter is " + obj2.perimeter());
		System.out.println("Rectangle capacity is " + obj2.capacity());

		System.out.println("=====================================");
		Square obj3 = new Square();
		System.out.println("Square area is " + obj3.area());
		System.out.println("Square perimeter is " + obj3.perimeter());
		System.out.println("Square capacity is " + obj3.capacity());

		System.out.println("=====================================");
		Cylinder obj4 = new Cylinder();
		System.out.println("Cylinder capacity is " + obj4.capacity());

	}
}

class Circle extends Shape {
	private double radius=3;
	@Override
	public double area() {
		double area = Math.PI * Math.pow(super.radius, 2);
		return area;
	}

	@Override
	public double perimeter() {
		double perimeter = 2 * Math.PI * super.radius;
		return perimeter;
	}

	@Override
	public double capacity() {
		double capacity = 4 / 3 * Math.PI * Math.pow(this.radius, 3);
		return capacity;
	}
}

class Rectangle extends Shape {
	double length=3;
	double width=5;
	double height=4;
	@Override
	public double area() {
		double area = this.length * this.width;
		return area;
	}

	@Override
	public double perimeter() {
		double perimeter = 2 * (super.length + super.width);
		return perimeter;
	}

	@Override
	public double capacity() {
		double capacity = length * width * height;
		return capacity;
	}
}

class Square extends Shape {
	double length=5;
	@Override
	public double area() {
		double area = Math.pow(length, 2);
		return area;
	}

	@Override
	public double perimeter() {
		double perimeter = 4 * length;
		return perimeter;
	}

	@Override
	public double capacity() {
		double capacity = Math.pow(length, 3);
		return capacity;
	}
}

class Cylinder extends Shape {
	double radius=2;
	double height=6;
	@Override
	public double capacity() {
		double capacity = Math.PI * Math.pow(radius, 2) * this.height;
		return capacity;
	}
}