package Loops;

import java.util.Scanner;

public class aaaaaFutureTuition {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int tuition=10_000;
		int year=0;
		
		while(tuition<=20_000) {
			tuition*=1.07;
			year++;
		}
		System.out.println("Tuition will be doubled in " + year + " years");
		System.out.printf("Tuition will be $"+tuition);
	}

}
