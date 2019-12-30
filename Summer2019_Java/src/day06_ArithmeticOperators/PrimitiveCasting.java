package day06_ArithmeticOperators;

public class PrimitiveCasting {
	
	// casting: converting larger primitive to smaller one.
	
	public static void main(String[] args) {
		
		// int a=10;
		// byte b=a; //normally it doesnt work like that. int cannot be assigned to byte but if we like below
		
		long a=3_294_000_000L;
		int b=(int)a;
		
		System.out.println(b); // ==>-1 billion
		
		int c=128;
		byte d=(byte)c;
		System.out.println(d); // why negative 128?
				
				
		double DecNum1=10.5;
		float FloatNum1=(float)DecNum1;
		
		System.out.println(FloatNum1); // ==>10.5
		
		double DecNum2=10.5;
		float FloatNum2=(int)DecNum1;
		System.out.println(FloatNum2);// ==> 10.0
		
		long LongNum1=300L;
		int intnum1=(int)LongNum1;
		System.out.println(intnum1); //==>300
		
		long LongNum2=300L;
		int intnum2=(short)LongNum2;
		System.out.println(intnum2); //==>300
		
		long LongNum3=300L;
		int intnum3=(byte)LongNum3;
		System.out.println(intnum3); //==>44 44=300-(128+128). Note:after 128 it is counting again the next 128, if it reaches the 128, it starts for new round and result is 44. 44=300-(128=128)
		
		byte ByteNum=100;
		int IntNum2=ByteNum;
		int IntNum3=(int) ByteNum; // It converts byte to int by using (byte) ==>it is implicit casting
		System.out.println(IntNum3); // ==>100
		
		short SHortNum=80;
		long LOngNum1=SHortNum;
		long LOngNum3=(long)SHortNum;
		System.out.println(LOngNum3); // ==> This is implicit casting
		
		double LargestNumber=112.8765; //==> 112 Note:In this case system gets rid off the decimal and writes only the integer part.
		byte ByteValue=(byte)LargestNumber; 
		
		System.out.println(ByteValue);
		//byte ByteValue1=(int)LargestNumber; ==> We cannot convert byte to int even the value is within the byte range.
		int IntValue=(int)LargestNumber;
		
		float FloatValue=(byte)LargestNumber; //==> 112.0
		float FloatValue1=(short)LargestNumber; //==> 112.0
		float FloatValue2=(int)LargestNumber;//==> 112.0
		float FloatValue3=(long)LargestNumber;//==> 112.0
		float FloatValue4=(float)LargestNumber;//==> 112.8765
		//float FloatValue4=(double)LargestNumber;//==> Doesnt Work
		System.out.println(FloatValue);
		System.out.println(FloatValue1);
		System.out.println(FloatValue2);
		System.out.println(FloatValue3);
		System.out.println(FloatValue4);
		
		float FloatNumber2=500.75F;
		int myNumber=(int)FloatNumber2; //==>we may convert it to short or int. We cannot convert to byte and long. because byte is limitted to 127, wlong is bigger than int.
		System.out.println(myNumber); //==>500
		
		/*
		int Num1=100;
		int Num2=200;
		int Num3=300; or
		*/
		int Num1=100, Num2=200, Num3=300; // is exactly the same... It is named "Local Variables"...
		// It will/must be all the same type of variables.
		
		boolean result;
		// System.out.println(result); ==> It isnot gonna work, since we have not initialized the Local Variable.
		
		boolean result1=9>3, result2=9<3, result3= 1+2<=3;
		
		System.out.println(result1); //==> true
		System.out.println(result2); //==> false
		System.out.println(result3); //==> true
		
		
		System.out.println("\n===============================\n");
			
		

	}


}
