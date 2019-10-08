package ArraysSingleDimensional;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueWords {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Please enter the length of array:");
		int length=scan.nextInt();
		String[] arr=new String[length];
		scan.nextLine();
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Please enter the value for arr["+i+"]: ");
			arr[i]=scan.nextLine();
		}
		System.out.println(Arrays.toString(arr));
		int count=0;
		int uniquecount=0;
		for (int i = 0; i < arr.length; i++) {
			count=0;
			for (int j = 0; j < arr.length; j++) {
				if(arr[i].equals(arr[j])) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(arr[i]+" is a unique value in this array.");
				uniquecount++;
			}
		}
		System.out.println("There are "+uniquecount+" unique values in this array...");
	}

}
