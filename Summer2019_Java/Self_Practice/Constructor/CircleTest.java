package Constructor;

public class CircleTest {
	public static void main(String[] args) {

		Circle circle1=new Circle();
		double area1=circle1.getArea();
		double perimeter1=circle1.getPerimeter();
		System.out.println("Circle-1: Area is "+area1+", Perimeter is "+perimeter1);
		
		Circle circle2=new Circle(10);
		double area2=circle2.getArea();
		double perimeter2=circle2.getPerimeter();
		System.out.println("Circle-2: Area is "+area2+", Perimeter is "+perimeter2);
		
		Circle circle3=new Circle();
		circle3.setRadius(100);
		double perimeter3=circle3.getPerimeter();
		double area3=circle3.getArea();
		System.out.println("Circle-3: Area is "+area3+", Perimeter is "+perimeter3);
	}
}
