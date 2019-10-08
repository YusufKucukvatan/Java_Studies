package day06_ArithmeticOperators;

public class ArithmeticOperators {
	
	public static void main(String[] args) {
		
		/*
		+ : Addition
		- : Substraction
		* : Multipilication
		/ : Division
		% : Remainder
		10/3 ==> In this case 3 is called denominator */ 
		
		int a=100;
		int b=a-400;
		System.out.println(b); //==> -300
		
		int X=3, Y=5, Z=X*Y;
		System.out.println(Z); //==>15
		
		double Length=100, Width=10, Area=Length*Width;
		System.out.println(Area); //==>1000.0
		
		short Number1=10/3;
		System.out.println(Number1); //==> 3
		
		double Number2=10/3;
		System.out.println(Number2); //==> 3.0 Why: Without using any decimal it will calculate as using integers...

		double Number3=10/3F;
		System.out.println(Number3); //==> 3.33333333333333333 
		
		double Number4=10/3.0;
		System.out.println(Number4); //==> 3.33333333333333333
		
		double Number5=10.0/3;
		System.out.println(Number5); //==> 3.33333333333333333
		
		// Working Procedures of Operators
		
		int output = 12 + 6 / 3;
		System.out.println(output); // First division or multiplication then addition or subtraction...
		
		System.out.println(5+2*4); //==>14
		System.out.println(10/2-3);//==>2
		System.out.println(8+12*2);//==>32
		
		
		/* REMAINDER
		
		10/3 ==> Remainder is 1;
		12/5 ==> Remainder is 2; */
		
		int result1=10%3;
		int result2=20%3;
		
		System.out.println(result1);//==>1
		System.out.println(result2);//==>2
		
		/* 
		Odd Numbers: cannot be divided to 2 without remainder.
		Even Numbers: can be divided by 2 without denominator.
		20, 45, 65, 676, 68
		*/
		
		int Number20 = 20%2;
		System.out.println(Number20); //==> Result is 0, means that there is no remainder and this number is even number.
		
		int Number45 = 45%2;
		System.out.println(Number45); //==> Result is 1, means that there is a remainder and this number is odd number.
		
		System.out.println(4+17%2-1); //==> Result is 4. Initially calculates remainder (remainder of the 17%2 is 1). then it becomes as 4+1-1=4.
		
		// GROUPING WITH PARENTHESIS
		//Parenthesis have always priority in calculations.
		
		System.out.println(1+2*3+4); //==>11
		System.out.println(1+2*(3+4)); //==>15
		System.out.println(10/3); //==>3
		System.out.println(10%3); //==>1
		System.out.println((17+4)%2-1); //==>
		 
	}
	
	
}
