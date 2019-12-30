package day20_JavaRecap;

import java.util.Scanner;

public class WarmUp_1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String a="Yusuf";
		boolean b=a.charAt(0)==89;
		if (b)
			System.out.println("XXXX");
		
		int sum=0;
		for(int i=0; i<=1000; i++) {
			sum+=i;
		}
		System.out.println("Sum of numbers is "+sum);
		
		int sumeven=0;
		for(int i=0; i<=1000; i++) {
			if(i%2==0)
				sumeven+=i;
		}
		System.out.println("Sum of even numbers is "+sumeven);
		
		int sumodd=0;
		for(int i=0; i<=1000; i++) {
			if(i%2==1)
				sumodd+=i;
		}
		System.out.println("Sum of odd numbers is "+sumeven);
		System.out.println("Sum of odd and even numbers is "+(sumeven+sumodd));
	}

}
