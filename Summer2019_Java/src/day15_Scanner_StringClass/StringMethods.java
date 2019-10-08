package day15_Scanner_StringClass;

import java.util.Scanner;

public class StringMethods {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		String str = "MuratDefne";
		
		char char1 = str.charAt(5);
		System.out.println(char1);
		
		char char2 = str.charAt(9);
		System.out.println(char2);
		
		String str2="Yu";
		str2.concat("suf");
		System.out.println(str2); //==>Yu
		str2 = str2.concat("suf");
		System.out.println(str2);
		str2=str2+"suf";
		System.out.println(str2); //==>Yusuf
		
		int length1 = str.length();
		System.out.println(length1);
		
		char char3 = str.charAt(length1-1);
		System.out.println(char3);
		
		char char4 = str.charAt(str.indexOf(char1));
		System.out.println(char4);
		
		// char char4 = str.charAt(35); ==> Runtime Error
		// System.out.println(char4);  
		
		
		String sub1 = str.substring(0,5);
		System.out.println(sub1);
		
		String sub2 = str.substring(0,10);
		System.out.println(sub2);
		
		String sub3 = str.substring(0,str.length());
		System.out.println(sub3);
		
		String sub4 = str.substring(0);
		System.out.println(sub4);
		
		String sub5 = str.substring(0,1)+str.substring(2,3)+str.substring(4,5);
		System.out.println(sub5);
		
		//String sub6 = str.substring(0,45); // Gives Runtime Error...
		//System.out.println(sub6);
		
		
		str=str.toLowerCase();
		System.out.println(str); //==> muratdefne
		str=str.concat("ela");
		System.out.println(str);//==> muratdefneela
		System.out.println(str.trim().toUpperCase()); //==> MURATDEFNEELA in trimmed version from left and right
		
		boolean b1=str.trim().equals(str2);
		boolean b2=str.trim().equalsIgnoreCase(str2);
		
		int int1=str.compareTo(str2);
		System.out.println(int1); //==> 20 muratdefneela comes after Yusuf
		int int2=str.compareToIgnoreCase(str2);								// Difference is ToIgnoreCase
		System.out.println(int2); //==> -12 muratdefneela comes before yusuf
		// compareTo gives positive int result if first string comes after second string.
		// compareTo gives negative int result if first string comes after second string.
		// compareTo gives zero if first string and second string are the same.
		
		boolean b3 = str.startsWith("mu");
		System.out.println(b3); //==> True
		boolean b4 = str.endsWith("la");
		System.out.println(b4); //==> True
		boolean b5 = str.contains("def");
		System.out.println(b5); //==> True
		boolean b6 = "Yusuf".contains("usu");
		System.out.println(b6); //==> True
		
		int index1 = str.indexOf('m');
		System.out.println(index1); //==> 0
		int index2 = str.indexOf("efne");
		System.out.println(index2); //==> 6
		int index3 = str.indexOf('e',0);
		System.out.println(index3); //==> 6 //==>First 'e' from the beginning
		int index4 = str.indexOf('e',7);
		System.out.println(index4); //==> 9 //==>First 'e' after 7th index is 9th index
		int index5 = str.indexOf('X');
		System.out.println(index5); //==> -1 
		int index6 = str.indexOf('m');
		System.out.println(index6); //==> 0
		
		
		
		
	}

}
