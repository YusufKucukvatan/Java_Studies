package day22_NestedLoop;

public class FINRA {
	public static void main(String[] args) {
		String str="";

		int i=1;
		while (i<=30) {
			if (i%3==0 && i%5==0) 
				str+="FINRA ";
			else if (i%3==0) 
				str+="FIN ";
			else if (i%5==0) 
				str+="RA ";
			else
				str+=i+" ";
			i++;
		}
		System.out.println(str); 
		
		String str2="";
		for (int j=1; j<=30; j++) 
			str2+=(j%3==0 && j%5==0)?"FINRA ":(j%3==0) ?"FIN ":(j%5==0)?"RA ":j+" ";
		System.out.println(str2);
		
		
		
		int a=10;
		int b=20;
		a=a+b; //==>10+20=30
		b=a-b; //==>30-20=10
		a=a-b; //==>30-10=20
		System.out.println(a);
		System.out.println(b);
	}
}
