package ArraysMultiDimensional;

import java.util.Scanner;

public class FindingClosestPoints {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the amount of numbers: ");
		int number = scan.nextInt();
		int[][] points = new int[number][2];
		for (int i = 0; i < number; i++) {
			System.out.println("Please enter location of the point-"+i+": ");
			for (int j = 0; j < 2; j++) {
				points[i][j] = scan.nextInt();
			}
		}
		System.out.println("Thank you for the inputs...");
		int x = 0;
		int y = 0;
		int minDistance=Integer.MAX_VALUE;
		int p1=-1;
		int p2=-1;
		for (int i = 0; i < points.length - 1; i++) {
			for (int j = i + 1; j < points.length; j++) {
				int distance=0;
				x = points[i][0] - points[j][0];
				y = points[i][1] - points[j][1];
				distance=(int) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
				if (distance < minDistance) {
					minDistance=distance;
					p1=i;
					p2=j;
				}
			}
		}
		String result = "Closest points are " + points[p1][0] + ","+points[p1][1] + " and " + points[p2][0] + ","+points[p2][1];
		System.out.println(result);
	}
}
