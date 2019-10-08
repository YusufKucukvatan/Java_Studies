package day26_Arrays;

import java.util.Arrays;

public class ForEachMultiD {
	public static void main(String[] args) {
		int[] arr1D= {1,2,3,4};
		int[][] arr2D= {{1,2,3,4}, {5,6,7,8}};
		
		for(int[] each1:arr2D) {
			for(int each2:each1) {
				System.out.print(each2);
			}
		}
		System.out.println();
		
		String[][] str2D= {{"Yusuf", "Betul"},{"Murat","Defne","Ela"}};
		for(String[] each1: str2D) {
			for(String each2: each1)
			System.out.println(each2);
		}
		
		int[][] num2D = {{1,2},{3,4}};
		
		int[][][] num3D = {{{1,2},{3,4}},{{5,6},{7,8}}}; //num3D is 3 dimensional array
		for(int[][] each2DArray:num3D) { 				 //each2DArray represents 2 dimensional arrays in num3D
			for(int[] each1DArray:each2DArray) {		 //each1DArray represents 1 dimensional arrays in num3D
				for(int eachValues:each1DArray) {		 //eachValues represents each single value in num3D
					System.out.print(eachValues);
				}
			}
		}
		System.out.println();
		int[][][] nums3D = {{{1,2},{3,4}},{{5,6},{7,8}}};
		for(int[][] each1: nums3D) {
			for(int[] each2: each1) {
				for(int each3:each2) {
					System.out.print(each3+" ");
				}
			}
		}

	}
}
