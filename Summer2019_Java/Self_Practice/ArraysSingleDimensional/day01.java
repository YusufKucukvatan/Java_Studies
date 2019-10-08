package ArraysSingleDimensional;

import java.util.Arrays;
import java.util.Scanner;

public class day01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	int[] array = new int[5];
	array[0]=1;
	array[1]=2;
	array[2]=3;
	array[3]=4;
	array[4]=5;
	java.util.Arrays.fill(array, 2, 5, 8);
	System.out.println(Arrays.toString(array));
//	double[] doubleArray = new double[10];
//	double[] doubleList = {1.1, 2.3, 4.5};
//	//int arrayLength=scan.nextInt();
//	//int[] myList=new int[arrayLength];
//	System.out.println(array.length);
//	System.out.println(array[0]);
		
		char[] city= {'T','y','s','o','n','s'};
//		System.out.println(city);
//		int[] num= {1,2,3,4,5};
//		System.out.println(num);

		//System.out.println("Please enter 5 different value for array: ");
		//int[] array = new int[5];
		
//		for(int i=0; i<array.length; i++) {
//			array[i]=scan.nextInt();
//			//System.out.println(array[i]);
//		} 
		int sum=0;
		array=new int[20];
		for (int i = 0; i < array.length; i++) {
			array[i]=(int)(Math.random()*100);
		}
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%5d", array[i]);
			if((i+1)%5==0)
				System.out.println();
		}
		for (int i = 0; i < array.length; i++) {
			sum+=array[i];
		}
		System.out.printf("Sum of array elements is: "+"%5d",sum);
		System.out.println();
		
		int greatest=0;
		int greatIndex=-1;
		for (int i = 0; i < array.length; i++) {
			if(array[i]>greatest) {
				greatest=array[i];
				greatIndex=i;
			}	
		}
		System.out.println("Geatest number of the array is "+greatest);
		System.out.println("Index of greatest number is "+greatIndex);
	
		for (int i = 0; i < array.length; i++) {
			int randomIndex=(int)(Math.random()*array.length);
		
			int temp=array[i];
			array[randomIndex]=temp;
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%5d", array[i]);
			if((i+1)%5==0)
				System.out.println();
		}
		String[] days= {"monday", "tuesday","wednesday","thursday","friday","saturday","sunday"};
		System.out.println(array);
		System.out.print("Please enter a number to learn day: ");
//		int day=scan.nextInt();
//		System.out.println("Today is "+days[day-1]);
		
		
		
	}
}
