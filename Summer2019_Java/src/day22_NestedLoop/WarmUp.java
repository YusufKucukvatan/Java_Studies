package day22_NestedLoop;

public class WarmUp {
	public static void main(String[] args) {
		String str="";

//		int i=1;
//		while (i<=30) {
//			if (i%3==0 && i%5==0) 
//				System.out.println("FINRA ");
//			else if (i%3==0) 
//				System.out.println("FIN ");
//			else if (i%5==0) 
//			System.out.println("FRA ");
//			else
//				str+=i+" ";
//			System.out.println(i+" ");
//			i++;
//		}
		
		
		for (int i=1; i<=30; i++) 
			str+=(i%3==0 && i%5==0)?"FINRA ":(i%3==0) ?"FIN ":(i%5==0)?"RA ":i+" ";
		System.out.println(str);
	}
}
