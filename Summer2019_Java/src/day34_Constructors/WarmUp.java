package day34_Constructors;

import java.util.ArrayList;

public class WarmUp {
	public static void main(String[] args) {
		String dup = "abcabcabcDEFDEFabcabab";
		String str="ab";
		removeDup(dup);
		frequency(dup);
		stringOccurence2(dup, str);
		stringOccurence1(dup, str);

	}
	private static String removeDup(String dup) {
		String removed = "";
		for (int i = 0; i < dup.length(); i++) {
			if (!removed.contains(dup.substring(i, i + 1))) {
				removed += dup.substring(i, i + 1);
			}
		}
		System.out.println(removed);
		return removed;
	}
	private static void frequency(String dup) {
		String removed = "";

		for (char i = 0; i < 128; i++) {
			int count = 0;
			for (int j = 0; j < dup.length(); j++) {
				if (dup.charAt(j) == i) {
					count++;

				}

			}
			if (count > 1) {
				System.out.println(i + " occures " + count + " times");
			}
			if (count >= 1) {
				removed += i;
			}
		}
		System.out.println(removed);

	}
	private static void stringOccurence1(String a, String b) {
		int count=0;
		while(a.contains(b)) {
			count++;
			a=a.replaceFirst(b, "");
		}
		System.out.println(b+" occures "+count+" times in "+a);
		
	}
	private static int stringOccurence2(String a, String b) {
		int count=0;
		int i=0;
		while (i<=(a.length()-b.length())) {
			if(a.substring(i,i+b.length()).equals(b)){
				count++;
			}
		i++;	
		}
		System.out.println(b+" occures "+count+" times in "+a);
		return count;
	}
	
}
