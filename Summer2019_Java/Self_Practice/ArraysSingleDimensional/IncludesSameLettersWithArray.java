package ArraysSingleDimensional;

import java.util.Arrays;
import java.util.Scanner;

public class IncludesSameLettersWithArray {
	public static void main(String[] args) {
		
		String a1="aabbbcccddddddd";
		String a2="abcccdddd";
		
	    char[] ch1 = a1.toCharArray();
        System.out.println(  Arrays.toString(ch1) );
        
        char[] ch2 =a2.toCharArray();      
        System.out.println(  Arrays.toString(ch2) );
        
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        
        System.out.println("=======================");
        System.out.println(  Arrays.toString(ch1) );
        System.out.println(  Arrays.toString(ch2) );
        
        String str1 = Arrays.toString(ch1);
        String str2 = Arrays.toString(ch2);
        
        if(str1.equals(str2)) {
            System.out.println("True, they are build out of same letetrs");
        } else {
            System.out.println("False, different letters");
        }
	}
}
