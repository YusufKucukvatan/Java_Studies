package Assignments;

import java.util.Scanner;

public class BuildRoute {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String start = scan.next();
		String end = scan.next();
		char s = start.charAt(0); // 68
		char e = end.charAt(0); // 65
		char temp = 'x';
		String dir1 = "right";
		String dir2 = "down";
		String dir3 = "left";
		String dir4 = "up";

		if (s == e)
			System.out.println(start + " found");

		else {
			if (s == 'A') {
				if (s > e)
					e +=3;
				for (int i = 0; i < e - s; i++) {
					if (i < 0)
						i += 4;
					if (i == 0)
						System.out.print(dir1);
					else if (i == 1)
						System.out.print(" > " + dir2);
					else if (i == 2)
						System.out.print(" > " + dir3);
					else if (i == 3)
						System.out.print(" > " + dir4);

				}
				System.out.print(": " + end.charAt(0) + " found");
			}
			if (s == 'B') {
				if (s > e)
					e +=4;
				for (int i = 0; i < e - s; i++) {
					if (i < 0)
						i += 3;
					if (i == 0)
						System.out.print(dir2);
					else if (i == 1)
						System.out.print(" > " + dir3);
					else if (i == 2)
						System.out.print(" > " + dir4);
					else if (i == 3)
						System.out.print(" > " + dir1);
				}
				System.out.print(": " + end.charAt(0) + " found");
			}
			if (s == 'C') {
				if (s > e)
					e +=4;
				for (int i = 0; i < e - s; i++) {
					if (i < 0)
						i += 4;
					if (i == 0)
						System.out.print(dir3);
					else if (i == 1)
						System.out.print(" > " + dir4);
					else if (i == 2)
						System.out.print(" > " + dir1);
					else if (i == 3)
						System.out.print(" > " + dir2);
				}
				System.out.print(": " + end.charAt(0) + " found");
			}
			if (s == 'D') {
				if (s > e)
					e +=3;
				for (int i = 0; i <= e - s; i++) {
					if (i < 0)
						i += 4;
					if (i == 0)
						System.out.print(dir4);
					else if (i == 1)
						System.out.print(" > " + dir1);
					else if (i == 2)
						System.out.print(" > " + dir2);
					else if (i == 3)
						System.out.print(" > " + dir3);
				}
				System.out.print(": " + end.charAt(0) + " found");
			}
		}
	}
}
