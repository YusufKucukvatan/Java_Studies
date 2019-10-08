package day08_ShortHandOperators;

public class QuizeReview {
	public static void main(String[] args) {
		
		
		//Q1
		int ivar=100;
		double dvar=123;
		float fvar=200;
		//ivar=fvar;//compile error. we can use ivar=(int,short or byte)fvar;
		ivar=(short)fvar; //it works as you see
		
		//fvar=dvar;//compile error
		fvar=(byte)dvar;//compiles
		fvar=(float)dvar;//compiles
		
		
		//Q2
		System.out.println("Result A"+0+1);//==>ResultA01
		System.out.println("Result");
		
		//String str1="Result A"+7-2;// we cannot subtract from a text.It feels like "ResultA7"-2
		//System.out.println(str1);
		
		String str2="Result A"+7*2;//Compiles. First calculates 7*2 and adds 14 to the previous text.==> Result A14
		String str3="Result A"+8%2;//Compiles. 8%2 is 0. ==>ResultA0
		
		//Q3
		System.out.println("Result A"+1+2);//==>Result A12
		System.out.println("Result B"+(1)+(2));//==>Result B12
		System.out.println("Result C"+(1+2));//==>Result C3
		System.out.println("Result D"+2*3);//==>Result D6
		
		System.out.println("5+2="+3+4);//==>5+2=34
		System.out.println("5+2="+(3+4));//==>5+2=7
		System.out.println("5+2="+3*4);//==>5+2=12
		
		//Q5
		double a, b, c=10.5;//the only initialized variable is c, so we cannot compile b. 
		// If we try to compile c, it works...
		//System.out.println(b); Doesn't work
		System.out.println(c);//==>10.5
		b=c;
		System.out.println(b);//==>10.5
		
		
		
		
		
		
	}

}
