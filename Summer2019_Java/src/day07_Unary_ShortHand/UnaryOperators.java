package day07_Unary_ShortHand;

public class UnaryOperators {
	public static void main(String[] args) {
		
		int a=10;
		int b=-10;
		
		int c=-a; //==>-10
		int d=-b; //==>10
		int e=+b; //==>-10
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		// Increment: Increases the value by 1.
		// Decrement: Decreases the value by 1.
		
		// Pre_Increment: Operator is placed before the variable; and increases the value by 1 immediately.
		int num1=100;
		++num1;
		System.out.println(num1);//==>101
		
		// Post_Increment: Operator is placed after the variable; and increases the value by 1 for the next operation or line.
		int IntNum=100;
		System.out.println(++IntNum);//==>101
		int IntNum2=100;
		System.out.println(IntNum2++);//==>100 No effect for this line but next one...
		System.out.println(IntNum2);//==>101
		
		int IntNum3=IntNum2;
		System.out.println(IntNum3++);//==>101 No effect on this line
		System.out.println(IntNum3);//==>102
		
		// Decrement
		int Y=95;
		System.out.println(Y--);//==>95
		System.out.println(Y);//==>94
		
		int k=25;
		System.out.println(++k);//26
		System.out.println(--k);//25
		
		int l=35;
		System.out.println(l--);//35
		System.out.println(l);//34
		
		int P=50;
		P= --P + P++ + P-- + P++; //==>The last post increment has no effect in anywhere even in the next line...
		//  49 + 49  + 50  + 49 = 197
		
		System.out.println(P);//197
		System.out.println(P);//197
		
		int T=50;
		T= --T + T++ + ++T + T++;
		// 49     49    51    51  = 200
		System.out.println(T);//==>200
		
		short Snum=4;
		int R=Snum*4 - Snum--; //12
		System.out.println(R);//12
		
		int W=1;
		W = -W-- + W++ / -W-- * --W;
		//  -1   + 0   / -1   *  -1 = -1
		//  -1   + (0/1)      *  -1
		System.out.println(W);//==>-1
		
		
		
	
	}

}
