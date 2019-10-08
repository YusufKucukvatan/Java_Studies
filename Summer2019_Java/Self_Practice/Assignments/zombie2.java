package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class zombie2 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int[] inhabitants = new int[8];
	    for(int i=0; i<inhabitants.length; i++) {
	      inhabitants[i] = input.nextInt();
	    }
	    
	    //TODO. Write you code below this line. 
	    int size = inhabitants.length;
	    int[] updatedInhabitants = new int[size];
	    int day = 0;
	    
	    while (true){
	      System.out.println("Day " + day++ + " " + Arrays.toString(inhabitants));
	      for (int i=0; i<size; i++){
	       if ((i!=0 && i!=size-1) && (inhabitants[i+1]==0 || inhabitants[i-1]==0) 
							|| (i==size-1 && inhabitants[i-1]==0) 
							|| (i==0 && inhabitants[i+1]==0)){
						updatedInhabitants[i]=inhabitants[i]/2;	          
					} else {
						updatedInhabitants[i]=inhabitants[i];	    	   
					}
				}
	      if (isExtinct(updatedInhabitants)) break;
	      System.arraycopy(updatedInhabitants, 0, inhabitants, 0, size);
	    }
	    System.out.println("Day " + day + " " + Arrays.toString(updatedInhabitants));
	    System.out.println("---- EXTINCT ----");
	  }
	  
	  public static boolean isExtinct(int[] arr){
	    for (int i=0; i<arr.length; i++){
	      if (arr[i]!=0) return false;
	    }
	    return true;

	}

}
