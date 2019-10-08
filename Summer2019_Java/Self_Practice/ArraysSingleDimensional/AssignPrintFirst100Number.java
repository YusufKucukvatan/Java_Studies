package ArraysSingleDimensional;
import java.util.Arrays;
public class AssignPrintFirst100Number {
	public static void main(String[] args) {
		int[] numbers=new int[100];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i]=i+1;
		}
		for(int each:numbers) {
			System.out.printf("%4d", each);
			if(each%10==0)
				System.out.println();
		}
	}
}
