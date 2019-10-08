package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class zombie3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    int[] inhabitants = new int[8];
	    for(int i=0; i<inhabitants.length; i++) {
	      inhabitants[i] = input.nextInt();
	    }
	
	int day =0;
    int[] temp = new int[inhabitants.length];
    while(true) {
    	
    
    for(int i =0;i<temp.length;i++) {
    	temp[i]=inhabitants[i];
    }
    
    System.out.println("Day " +day+" "+ Arrays.toString(temp));
    int total =0;
	for(int each:temp) {
		total= total +each;
	}
	if(total==0) {
		break;
	}
    	
      if(inhabitants[1]==0) {
    	  temp[0]=temp[0]/2;
      }
      if(inhabitants[6]==0) {
    	  temp[7]= temp[7]/2;
      }
      for(int j=1;j<temp.length-1;j++) {
    	  if(inhabitants[j+1]==0 || inhabitants[j-1]==0) {
    		  temp[j]= temp[j]/2;
    	  }
      }
      day++;
      for(int i =0;i<temp.length;i++) {
	    	inhabitants[i]=temp[i];
	    }
      
    
    
    }
    System.out.println("---- EXTINCT ----");
	}
}
