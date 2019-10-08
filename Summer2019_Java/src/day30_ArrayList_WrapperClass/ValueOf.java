package day30_ArrayList_WrapperClass;

public class ValueOf {
	public static void main(String[] args) {
		int z=Integer.valueOf("123"); // unboxing
		Integer z1=Integer.valueOf("1234"); //none
		System.out.println(z1);
		Integer z2=(int)Integer.valueOf("321"+4); // result is 3214. Fist concats the string (Auto-boxing)
		System.out.println(z2);
		
		boolean result1=Boolean.parseBoolean("TRUE"); //==>true
		boolean result2=Boolean.parseBoolean("False");//==>false
		boolean result3=!Boolean.parseBoolean("False");//==>true
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		int totalNumber=100;
		String str1=""+totalNumber;
	}

}