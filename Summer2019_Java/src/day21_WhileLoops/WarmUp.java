package day21_WhileLoops;

public class WarmUp {
	public static void main(String[] args) {

		String dup = "aabbcc";
		String result = "";

		for (int i = 0; i < dup.length() - 1; i++) {
			if (dup.charAt(i) == dup.charAt(i + 1)) {
				for (int j = i; j < i + 1; j++) {
					result += dup.substring(j, j + 1);
					j++;
				}
			}
		}
		System.out.println(result);
	}

}
