package Tutorials;

import java.util.Scanner;

public class AboveAverage2 {
	public static void main(String[] args) {
		int[] array=new int[100];
		Scanner scan=new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			array[i]=(int)(Math.random()*1000);
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
			if(i%20==0)
				System.out.println();
		}
		
		System.out.println();
		
		int sum=0;
		for (int i = 0; i < array.length; i++) {
			sum+=array[i];
		}
		System.out.println("Sum of the array is "+sum);
		int ave=sum/100;
		int count=0;
		for (int i = 0; i < array.length; i++) {
			if(array[i]>ave) {
				count++;
				System.out.println(array[i]+" is greater than "+ave);
			}
		}
		System.out.println(count+" number is greater than "+ave);
	}

}
