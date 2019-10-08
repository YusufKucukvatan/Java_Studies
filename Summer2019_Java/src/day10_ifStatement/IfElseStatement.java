package day10_ifStatement;

public class IfElseStatement {
	public static void main(String[] args) {
		int angle1=20, angle2=50,angle3=75;
		boolean valid=(angle1+angle2+angle3)==180;
		if (valid) {
			System.out.println("It is a triangle.");
		}
		
		else if (!valid) {
			System.out.println("It is not a triangle, improve your math.");
		}
	}

}
