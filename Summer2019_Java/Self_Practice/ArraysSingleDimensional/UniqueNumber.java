package ArraysSingleDimensional;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Please enter the array length: ");
		int length=scan.nextInt();
		int[] arr=new int[length];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr value-"+i+" is :");
			arr[i]=scan.nextInt();
		}
		int uniquecount=0;
		for (int i = 0; i < arr.length; i++) {
			int count=0;
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(arr[i]+" is a unique value in this array.");
				uniquecount++;
			}
		}
		if(uniquecount==0) {
			System.out.println("There is no unique value in this array...");
		}
		else {
			System.out.println("There are "+uniquecount+" unique values in this array...");
		}
		System.out.println(Arrays.toString(arr));
	}

}
