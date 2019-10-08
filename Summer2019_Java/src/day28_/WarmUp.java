package day28_;

import java.util.Arrays;

import ArraysSingleDimensional.SortDescending;

public class WarmUp {
	public static void main(String[] args) {
		int[] array = { 100, 80, 90 };
		sortAscending(array);
		sortDescendingnd(array);
		convertToMiles(100);
		converToLitters(3);
		calculate(1, 3, "/");
	}
	private static void sortAscending(int[] array) {
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[i]>array[j]) {
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}
	private static void sortDescendingnd(int[] array) {
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[i]<array[j]) {
					int temp=array[j];
					array[j]=array[i];
					array[i]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
		
	}
	public static void convertToMiles(double km) {
		double mile=km*1.609;
		System.out.println(km+" km is "+mile+" miles.");
	}
	public static void converToLitters(int gallon) {
		double litter=gallon*3.8;
		System.out.println(gallon+" gallons is "+litter+" litters.");
	}
	private static void calculate(int i, int j, String str) {
		if(i<j) {
			int temp=i;
			i=j;
			j=temp;
		}
		if(str.equals("+")) 
			System.out.println("result="+(i+j));
		else if(str.equals("-"))
			System.out.println("result="+(i-j));
		else if(str.equals("*"))
			System.out.println("result="+(i*j));
		else if(str.equals("/"))
			System.out.println("result="+(i/j));
		else 
			System.out.println("Please enter a valid operator.");
	}
}
