package day07_Unary_ShortHand;

public class quiz {
	public static void main(String[] args) {
		
		// question 01
		int a=30;
		int b=(byte)a;
		System.out.println(b); // ==>30
		
		// question 02
		System.out.println(a+1); //==> Error. Because 'a' is nor valued before the println line...
		//int a =100;
		
		float FloatNum = 100.987654F;
		short ShortNum = (byte) FloatNum; 
		System.out.println(ShortNum); //==> 100 (Explicit Casting: Converting larger to smaller)
		
		// Q-05
		// byte x=200; Error ==> We cannot excess the maximum limit of byte which is 127.
		int y=2; 
		
		//Q6
		int Numa = 200;
		int Numb = 2;
		System.out.println(Numa+Numb-Numa*Numb+Numa/Numb); //==> -98
		
		//Q7
		System.out.println((3+2)*2/3%2); //==>1  Note: 
		// 					 5  *2
		//					    10/3 ========> Tricky point: Result is 3. Only considers whole numbers...
		//						   3%2 ==> Result is 1
		
		
		// Q8
		
		//int num1=9, num2=0, num3=num1/num2;  // ===> it will compile the variable but when we run the programme it will not accept.
											  // Denominator cannot be zero.
		//System.out.println(num3);
		
		// Q9  
		long Lnum=3_000L;
		double Dnum=(float) Lnum; // implicit casting
		int Inum=(short) Dnum;
		System.out.println(Dnum); // ==>3000.0
		System.out.println(Inum); // ==>3000
		System.out.println(Inum%1000); // ==>0
		
		// Q10 and Q11
		
		double result1=10/3; // ==> 3.0
		double result2=10.0/3;  // ==> 3.3333333333
		
		System.out.println(result1); // ==> 3.0
		System.out.println(result2); // ==>3.3333333
		
		// Q12
		
		String str="10.5";
		//int num4=(int) str; // ==> Compile Error. Because String is not a Primitive Variable. It cannot be converted to any primitive type.
		
		// Q13
		
		int I1=10, I2=20, I3=30;
		I1=I1%5; // ==> 0
		I2=I2%5; // ==> 0
		I3=I1*I2; //==> 0
		
		System.out.println(I1+"\t"+I2+"\t"+I3); // ==> 0	0	0
		
		System.out.println(10/3); // 3
		System.out.println(10/3L);// 3
		System.out.println(10/3F);// 3.3333333333
		System.out.println(10/3D);// 3.3333333333

		
	}

}
