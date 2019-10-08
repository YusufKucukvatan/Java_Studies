package Methods;

import java.util.Scanner;

public class ReverseNumbers {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Please enter at least 5 digits number: ");
		int number=scan.nextInt();
		
		System.out.println(isPalindrome(number));
	}
	
	public static boolean isPalindrome(int num) {
		int num2=num;
		int remainder=0;
		int reverse=0;
		
		while(num2>0) {
			remainder=num2%10;
			reverse= reverse*10+remainder;
			num2=num2/10;
		}
		System.out.println("Reverse of the number is "+reverse);
		if(reverse==num) {
			return true;
		}
		
		return false;
	}
	

}
