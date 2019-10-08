package Tutorials;

import java.util.Scanner;

public class EqualsJavaPython {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str1 = "We study java not python";
		String str2 = "What's the difference between java, javascript and python?";
		String str3 = scan.nextLine();

		int countJava = 0;
		int countPython = 0;

		for (int i = 0; i < str3.length() - 3; i++) {
			if (str3.substring(i, i + 4).equals("java")) {
				countJava++;
			}
		}
		for (int i = 0; i < str3.length() - 5; i++) {

			if (str3.substring(i, i + 6).equals("python")) {
				countPython++;
			}
		}
			System.out.println(countJava == countPython);
	}
}
