package day22_NestedLoop;

public class NestedLoop {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("\n\n");
		int i=1;
		while(i<=5) {
			int j=1;
			while(j<=5) {
				System.out.print("* ");
				j++;
			}
		System.out.println("");
		i++;
		}
	

		
	}

}
