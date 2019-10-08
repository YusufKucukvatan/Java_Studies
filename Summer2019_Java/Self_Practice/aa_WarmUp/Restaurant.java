package aa_WarmUp;

public class Restaurant {
	public static void main(String[] args) {
		System.out.println("\n\n");
        
        for (int k = 1; k <= 9; k++) {
            for (int l = 1; l <= k; l++) {
                System.out.print("F  ");
            }
            for (int l = 1; l <= 9 - k; l++) {
                System.out.print("Y");
                System.out.print("U ");
            }
            for (int l = 1; l <= 9 - k; l++) {
                System.out.print("Y");
                System.out.print("U ");
            }
            for (int l = 0; l <= k - 1; l++) {
                System.out.print("Ⅎ  ");
            }
            System.out.println("");
        }
        for (int p = 1; p <= 9; p++) {
            for (int l = 1; l <= 9-p; l++) {
                System.out.print("F  ");
            }
            for (int l = 1; l <= p; l++) {
                System.out.print("S");
                System.out.print("U ");
            }
            for (int l = 1; l <=p; l++) {
                System.out.print("S");
                System.out.print("U ");
            }
            for (int l = 0; l <= 8-p; l++) {
                System.out.print("Ⅎ  ");
            }
            System.out.println("");}
	}

}
