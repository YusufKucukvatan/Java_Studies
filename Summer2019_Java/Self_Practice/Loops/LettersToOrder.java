package Loops;

public class LettersToOrder {
	public static void main(String[] args) {
		String word="cybertekschool";
		String order="";
		for (int i = 0; i < word.length()-1; i++) {
			for (int j =i+1; j < word.length(); j++) {
				if(word.charAt(j)<word.charAt(i)) {
					char temp=' ';
					order=order+word.charAt(j);
				}
				else {
					order=order+word.charAt(i);
				}
			}
		}
		System.out.println(order);
	}

}
