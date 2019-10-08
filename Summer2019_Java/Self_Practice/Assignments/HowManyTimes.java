package Assignments;

import java.util.Scanner;

public class HowManyTimes {
	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String sentence = scan.nextLine();
	    int j=0;
	    int p=0;
	
	    for(int i=0; i<sentence.length()-3;i++){
	      if(sentence.substring(i,i+4).equals("java"))
	            j++;
	    }
	    for(int i=0; i<sentence.length()-5;i++){
	      if(sentence.substring(i,i+6).equals("python"))
	      p++;
	      
	    }
	    if(j==p)
	      System.out.println(true);
	    
	    else
	    System.out.println(false);
	    
	  }
	}

