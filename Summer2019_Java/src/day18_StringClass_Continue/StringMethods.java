package day18_StringClass_Continue;

public class StringMethods {
	public static void main(String[] args) {
		
		String str="Batch 12 is a great batch";
		char a='A';
		System.out.println("".isEmpty());
		int index1=str.indexOf("a"); //==>1
		int index2=str.indexOf("at");//==>1
		int index3=str.indexOf("at batch");//==>16
		
		//System.out.println(index1);
		
		String mur="MURAT";
		int letter=0;
		for (letter=0;letter<5;letter++) {
			System.out.println(mur.charAt(letter));
		}
		System.out.println("=======================");
		
		letter=4;
		while(letter>=0) {
			System.out.println(mur.charAt(letter));
			letter--;
		}
		
		letter=0;
		do {
			System.out.println(mur.charAt(letter));
			letter++;
		}while(letter<5);
		
	}
}
