package ArraysSingleDimensional;

public class SortAscending {
	public static void main(String[] args) {
		int[] scores= {7,2,3,10,5,13,7,8,9,11};
		
		int max=0;
		for (int i = 0; i < scores.length; i++) {
			if(max<scores[i]) {
				max=scores[i];
			}
		}
		int max2=0;
		for (int i = 0; i < scores.length; i++) {
			if(max2<scores[i]&&scores[i]<max) {
				max2=scores[i];
			}
		}
		System.out.println(max);
		System.out.println(max2);
		
		for (int i = 0; i < scores.length-1; i++) {
			for (int j = i+1; j < scores.length; j++) {
				if(scores[i]>scores[j]) {
					int temp=scores[j];
					scores[j]=scores[i];
					scores[i]=temp;
				}
			}

		}
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i]+" ");
		}
		}
		
	}
