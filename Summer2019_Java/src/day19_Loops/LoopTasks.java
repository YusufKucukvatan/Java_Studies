package day19_Loops;

public class LoopTasks {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
		System.out.println(Math.sqrt(i));	
		}
		
		for (int i=1; i<=32; i++) {
			if(i==1)
				System.out.print("Even numbers: ");
			if (i%2==0)
				System.out.print(i+" ");
		}
		
		for (int i = 1; i<=32; i++) {
			if (i==1)
			System.out.print("\nOdd  numbers: ");
			if (i%2==1)
				System.out.print(i+" ");
		}
		
		System.out.println("\n=======================");
		
		String str="CYBERTEK";
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println("\n");
		
		String reversed="";
		for (int i = str.length()-1; i >= 0; i--) {
			reversed+=str.charAt(i);
		}
		System.out.print(reversed);
	}
}
