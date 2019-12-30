package day39_Review;

import java.text.DecimalFormat;

public class FormattingDecimals {
	public static void main(String[] args) {
		DecimalFormat formating = new DecimalFormat("0.000");
		double d1 = 23.33414222255556666677777;

		//==> obj.format(double) method returns a string value. 
		//    We have to convert it into double if we want to use in math operation...
		
		String num1 = formating.format(d1);
		System.out.println(num1);
		
		
		double d2=12.45967563487624376531209913;
		System.out.println(formating.format(d2));
		
		d2=Double.parseDouble(formating.format(d2));
		
		
	}
}
