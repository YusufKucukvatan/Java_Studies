package day15_Scanner_StringClass;

import java.util.Scanner;

public class StringWarmUp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		//	   Length: 123456789...............
		String word = "Cybertek School Bacth 12";
		//		Index: 0123456789..............
		
		String word2 = "cybertek school bacth 12";
		String word3 = "     cyberTek schOol bActh 12       ";
		
		char char1 = word.charAt(0); //C
		System.out.println(char1); 
		System.out.println(word.charAt(2)); //t
		int len = word.length();  //24
		System.out.println(len);  //24
		char char2 = word.charAt(len-1); // last letter
		System.out.println(char2); 
		char char3 = word.charAt(word.length()-1); // last letter
		System.out.println(char3);
		char char4 = word.charAt(word.indexOf('k')); // k
		System.out.println(word.indexOf('k')); //7
		System.out.println(char4);			
		System.out.println(word.charAt(3) + word.charAt(4)); // 215 ==> Because, it recognize characters as an ASCII number...
		System.out.println(""+word.charAt(3) + word.charAt(4)); // er ==> If you add " " to the beginning it forces system to recognize characters as chars.
		System.out.println(word.indexOf('s')); //-1 ==> Because, s is lower case in here, upper case in word.
		System.out.println(word.indexOf("X")); //-1 ==> Because, there is no X within the word.
		System.out.println(word.indexOf('S')); //9
		System.out.println(word.indexOf("S")); //9
		System.out.println(word.indexOf("School")); //9
		System.out.println(word.indexOf("12")); //22
		char find1 = 't';
		System.out.println(word.indexOf(find1)); // 5 ==> Finds the first t letter's index number within word.
		
		String sub1 = word.substring(0,24);   //Cybertek School Bacth 12
		System.out.println(sub1);
		System.out.println(word.substring(0));//Cybertek School Bacth 12
		System.out.println(word.substring(5)); // Starts from 5th character to the end of string
		System.out.println(word.substring(0,2)+word.substring(9,11)+word.substring(16,18)+word.substring(22,24)); // CyScBa12
		String Mur = "Murat";
		String Cyb = "Cyber";
		// System.out.println(word.replace);
		
		boolean bool1 = word.equalsIgnoreCase(word2); //true
		System.out.println(bool1);
		
		boolean bool2 = word3.trim().equalsIgnoreCase(word); //true
		System.out.println(bool2);
		
		
	}
}
