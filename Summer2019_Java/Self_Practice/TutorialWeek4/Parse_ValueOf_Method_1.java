package TutorialWeek4;

public class Parse_ValueOf_Method_1 {
	public static void main(String[] args) {
		//What parse method does?    ==> converts string value into primitive value
		//What valueOf method does?  ==> converts xxxxx value into yyyyy value
		//What valueOf method does?  ==> converts xxxxx value into yyyyy value
		
		
//		int num=123;
//		String str1="152";  				// Where is this 152 located
//		String str2=new String("152");		// Where is this 152 located
//		double num1=Double.valueOf(str1);     //==> Unboxing/Auto-boxing?
//		Integer num2=0; //==> Unboxing/Auto-boxing?
//		int num3=Integer.parseInt(str1);     //==> Unboxing/Auto-boxing?
//		Integer num4=Integer.parseInt(num2); //==> Unboxing/Auto-boxing?
//		int num5=Integer.valueOf(123);     //==> Unboxing/Auto-boxing?
//		Integer num6=Integer.valueOf(123); //==> Unboxing/Auto-boxing?
//		int num7=Integer.valueOf(123);     //==> Unboxing/Auto-boxing?
//		Integer num8=Integer.parseInt("123"); //==> Unboxing/Auto-boxing?
//		System.out.println(str1+1);
//		System.out.println(num1+1);
//		System.out.println(num2+1);
//		System.out.println(num3+1);
//		System.out.println(num4+1);
//		System.out.println(num1);
//		
//		int num9=2019;
//		String str3=String.valueOf(num9);
//		System.out.println(num9+1);
//		System.out.println(str3+1);
//		
		boolean result1=Boolean.parseBoolean("TRUE");  //==>
		boolean result2=Boolean.parseBoolean("TruE");  //==>
//		boolean result3=Boolean.parseBoolean(true);  //==>
		boolean result4=Boolean.parseBoolean("False"); //==>f
		boolean result5=!Boolean.parseBoolean("False");//==>
		boolean result6=Boolean.parseBoolean("Cybertek");//==>
		boolean result7=Boolean.parseBoolean("5>4");   //==>
//		boolean result8=Boolean.parseBoolean(5>4);   //==>
		boolean result9=Boolean.valueOf(true);//==>
		boolean result10=Boolean.valueOf("true");//==>
		boolean result11=Boolean.valueOf(false);//==>
		boolean result12=Boolean.valueOf(2==1);//==>
		boolean result13=Boolean.valueOf("5>4");//==>
		boolean result14=Boolean.valueOf("TRUe");//==>
//		
//		//What parse method does?    ==> converts only string value into a primitive type value
//		//What valueOf method does?  ==> converts any value into a wrapper class value(means object)
//		
		System.out.println(result1);
		System.out.println(result2);
		//System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result12);
		//System.out.println(result8);
		System.out.println("xxx");
		System.out.println(result9);
		System.out.println(result10);
		System.out.println(result11);
		System.out.println(result12);
		System.out.println(result13);
//		
//		boolean b4=4==3;
//		String str4=String.valueOf(b4);
//		System.out.println(str4);
//		
//		char ch5='A';
//		String str5=String.valueOf(ch5);
//		System.out.println(ch5+""+'A');
//		
//		Double d2=Double.valueOf("12.4");
//		String str6=String.valueOf(d2);
//		System.out.println(str6+1);
		
		//What valueOf method does?  
		//converts any value (all primitive and wrapper types) into a string value
		//converts string value into a wrapper class value(object)
		
		
		//What parse method does? 
		//converts ONLY STRING value into a primitive data type value
		
	}

}
