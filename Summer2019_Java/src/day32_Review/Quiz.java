package day32_Review;

public class Quiz {
	public static void main(String[] args) {
		
		int num=3;
		String str=String.valueOf(num);
		
		int num0=Integer.valueOf(5);
		int num1=Integer.valueOf(num);
		int num2=Integer.valueOf(str);
		int num3=Integer.parseInt(str);
		//int num4=Long.parseLong(str);
		int num5=Byte.parseByte(str);
		//int num6=Byte.parseInt(str);
		
		Integer int1=Integer.valueOf(str);
		Integer int2=Integer.parseInt(str);
		Integer int3=Integer.valueOf(5);
		Integer int4=Integer.valueOf(num);
		//Integer int5=Byte.valueOf(str);
		
		double d1=Double.parseDouble(str);
		double d2=Double.valueOf(str);
		double d3=Integer.valueOf(str);
		double d4=Double.parseDouble(str);
		Double d5=Double.valueOf(str);
		//Double d5=Double.valueOf(str);
		//Double d6=Integer.valueOf(str);
		
		
		boolean b1=Boolean.parseBoolean("tRuE");
		Boolean b2=Boolean.parseBoolean("TRUE");
		boolean b3=Boolean.valueOf("false");
		Boolean b4=Boolean.valueOf("5>4");
		System.out.println(b4);
		
		
		int num6=321;
		Integer num7=456;
		char ch1='A';
		boolean b5=5>4;
		String s1=String.valueOf(num6);
		String s2=String.valueOf(num7);
//		String s3=String.parseInt(num6);
//		String s4=String.parseInt(num7);
		String s5=String.valueOf(ch1);
		String s6=String.valueOf(b5);
		System.out.println(s6);

	}

}
