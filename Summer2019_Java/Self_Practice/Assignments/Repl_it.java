package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_it {

	public static void main(String[] args) {
		String check = "Nurses run";
		check = check.replace(" ", "").toLowerCase();
		String reverse = "";
		for (int i = check.length() - 1; i >= 0; i--) {
			reverse += check.charAt(i);
		}
		if (check.equals(reverse)) {
			System.out.println(true);
			;
		} else {
			System.out.println(false);
		}
	}
}
