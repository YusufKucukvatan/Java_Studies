package Assignments;

import java.util.Scanner;

public class Sandwich {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Please enter first word: ");
	String word1=scan.nextLine();
	System.out.print("Please enter second word: ");
	String word2=scan.nextLine();
	int length1=word1.length();
	if (length1%2==0){
	System.out.println(word1.substring(0,length1/2)+word2+word1.substring(length1/2));
	}
}
}
