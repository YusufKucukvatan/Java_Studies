package TutorialWeek5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.SortedMap;

public class DenominatorWithString {
	public static void main(String[] args) {

		int n = 5;
		
		ArrayList<Double> nums = new ArrayList<>();
		ArrayList<String> sortedNums=new ArrayList<>();
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j <= n; j++) {
				if (i < j) {
					double num = (double)i/j;
					if (!nums.contains(num)) {
						String str = i + "/" + j;
						nums.add(num);
						sortedNums.add(str);
					}

				}
			}
		}
		
		Collections.sort(sortedNums);
		System.out.println(sortedNums);
	}
}
