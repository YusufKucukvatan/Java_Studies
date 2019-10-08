package day17_StringClass;

import java.util.Scanner;

public class WarmUp {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Please enter your first and last name: ");
	String firstName=input.next();
	String lastName=input.next();
	String fullName=firstName.concat(" ").concat(lastName).toUpperCase();
	
	System.out.println(fullName);
	int length=fullName.length();
	System.out.println(length);
	
	String sub1=fullName.substring(11); //==>VATAN
	System.out.println(sub1);
	String sub2=fullName.substring(0,6); //==>YUSUF
	System.out.println(sub2);
	int index1=fullName.lastIndexOf('U'); //==>9 (Last 'U' within the fullName. YUSUF KUC'U'KVATAN
	System.out.println(index1);
	int index2=fullName.lastIndexOf('U',6); //==>3 (Last 'U' before 5th index.  YUS'U'F KUCUKVATAN
	System.out.println(index2);
	
	boolean b1=fullName.contains("KUCUK"); //==>true
	System.out.println(b1);
	
	input.close(); //It closes input Scanner
}
}
