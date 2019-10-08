package day26_Arrays;

import java.util.Arrays;

public class ForEachLoop {
	public static void main(String[] args) {
		int[] numbers= {1,2,3,4,5};
		for(int each:numbers) {
			each=each+1;
			System.out.print(each+" ");
		}
		System.out.println();
		
		String[] str1= {"A","B","C"};
		System.out.println(str1);
		for(String each:str1) {
			System.out.print(each+" ");
		}
		System.out.println();
		
		char[] ch= {'z','x','y','c','a','b'};
		System.out.println(ch);
		Arrays.sort(ch);
		System.out.println(ch);
		for(char e:ch)
			System.out.print(e);
		System.out.println();
		
		int[] arr1= {1,2,3,4,5,6,7,8,9,10};
		for(int varName: arr1) {
			if(varName%2==0)
				System.out.print(varName+" ");
		}
		
		
		
	}

}
