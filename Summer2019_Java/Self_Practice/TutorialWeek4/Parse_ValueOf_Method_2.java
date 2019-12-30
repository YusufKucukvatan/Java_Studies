package TutorialWeek4;

public class Parse_ValueOf_Method_2 {
	public static void main(String[] args) {

		int num = 3;
		String str = String.valueOf(num);// ==> ?

		int num0 = (int) Integer.valueOf(5);
		int num1 = Integer.valueOf(5);
		int num2 = Integer.valueOf(str);
		int num3 = Integer.parseInt(str);
		int num4 = (int) Long.parseLong(str);
		int num5 = Byte.parseByte(str);
		int num6 = (int) Byte.parseByte(str);
		
		short a=4;
		Integer int1 = Integer.valueOf(str);
		Integer int2 = Integer.parseInt(str);
		Integer int3 = Integer.valueOf(str);
		Integer int4 = Integer.valueOf(a);
		Integer int5 = Integer.valueOf(str);
//		
//		double d1 = Double.parseDouble(str);
//		double d2 = Double.valueOf(str);
//		double d3 = Integer.valueOf(str);
//		double d4 = Double.parseDouble(str);
//		Double d5 = Double.valueOf(str);
//		Double d6 = Double.valueOf(str);
//		
//		String str3 = "True";
//		boolean b1 = Boolean.parseBoolean("tRuE");
//		Boolean b2 = Boolean.parseBoolean(str3);
//		boolean b3 = Boolean.valueOf("false");
//		Boolean b4 = Boolean.valueOf("5>4");
//		Boolean b5 = Boolean.parseBoolean(1==1);
//		Boolean b6 = Boolean.valueOf(1==1);
//		Boolean b7 = Boolean.parseBoolean(true);
//		Boolean b8 = Boolean.valueOf(true);
//		System.out.println(b1);
//		System.out.println(b2);
//		System.out.println(b3);
//		System.out.println(b4);
//		
//		int num8 = 3+2+1;
//		Integer num7 = 456;
//		char ch1 = '3';
//		boolean b5 = 5 > 4;
//
//		String s1=String.valueOf(num8); //==>"321";
//		String s2=String.valueOf(num7);
//		String s3=String.valueOf(ch1);
//		String s4=String.valueOf(b5);
//		System.out.println(s1+1);
//		System.out.println(s2+1);
//		System.out.println(s3);
//		System.out.println(s4);
//		String s5=String.parseInt(num6);
//		String s6=String.parseInt(num7);

	}

}
