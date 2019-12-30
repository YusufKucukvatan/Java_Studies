package Constructor;

public class Circle {
	double r;

	public Circle() {
		r=1;
	}
	public Circle(double newRadius) {
		r=newRadius;
	}
	
	public double setRadius(double radius) {
		r=radius;
		return r;
	}
	public double getArea() {
		return (r*r*Math.PI);
	}
	public double getPerimeter() {
		return 2*Math.PI*r;
	}
	
	
}
