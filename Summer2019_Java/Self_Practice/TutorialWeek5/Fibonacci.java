package TutorialWeek5;

import java.util.ArrayList;
import java.util.Arrays;

public class Fibonacci {
	public static void main(String[] args) {
		ArrayList<Integer> fibonacci=new ArrayList<>();
		fibonacci.add(1);
		fibonacci.add(2);
		for (int i = 2; i < 10; i++) {
			fibonacci.add(fibonacci.get(i-2)+fibonacci.get(i-1));
		}
		System.out.println(fibonacci);
		
		
		
		
		int[] fibo=new int[10];
		fibo[0]=1;
		fibo[1]=2;
		for (int i = 2; i < fibo.length; i++) {
			fibo[i]=fibo[i-2]+fibo[i-1];
		}
		System.out.println(Arrays.toString(fibo));
		
		
		
		int num1=1;
		System.out.print(num1+"  ");
		int num2=2;
		System.out.print(num2+"  ");
		for (int i = 0; i < 8; i++) {
			int num3=num1+num2;
			System.out.print(num3+"  ");
			num1=num2;
			num2=num3;
		}
	}

}
