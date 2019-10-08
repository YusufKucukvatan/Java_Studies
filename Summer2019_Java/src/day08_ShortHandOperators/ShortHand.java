package day08_ShortHandOperators;

public class ShortHand {
	public static void main(String[] args) {
		
		int g=101;
		int h=g-= 1;
		System.out.println(h);	 //==>100
		
		
		
		int A=100;
		A*=200;
		System.out.println(A); //100*200=20000
		
		int B=100;
		  B*=100 / 10; //==>1000
		//1st   2nd ==> First come first serve
		
		  B+=B-=1000; // ==> B=(1000+1000)-1000=1000
		//1st 2nd
		System.out.println(B); //==>1000
		
		  B*=B - 1000;
		//2nd     1st
		//B*= 1000 -1000=0
		System.out.println(B); // ==>0
				
		int C=1000;
		C/=5; //==>200
		
		int D=10;
		
		C/=D; //==>20
		
		//C/=D-10; 
		//System.out.println(C); //==> Error because denominator is zero.
		
		C/=D-5; //first dive subtract 5 and then dive to 5. result is 4
		System.out.println(C); //==>4
		
		// %= Remainder
		//int z=10%3; //==>1
		
		//int E=10;
		//E%=2; //==>E=10%2==> E=0
		
		int F=100;
		F%=2; // F=F%2; 
		System.out.println(F);//==>0 
		System.out.println(10.5%3); //==>1.5
		System.out.println(10.0%3); //==>1.0
		
		int J=300;
		int K=10;
		J+=J%=K; //==>300  J=J+(J%K)==> J=300+(300%10) ==> J=300+0 J=300
		System.out.println(J); //==>300
		
		int x1=10;
		int x2=5;
		int x3=8;
		
		x1-=x2*=x3;//==>-30
		System.out.println(x1);
		x1-=x2*=x3+2; //==>-430  ((8+2)*5)
		System.out.println(x1);
				
		
		
		
		
		
				
		
		
				
				
		
	}
	


}
