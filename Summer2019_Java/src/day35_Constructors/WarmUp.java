package day35_Constructors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUp {
	public static void main(String[] args) {
		Integer[] arr1= {5,4,3,2,1};
		double[] arr2= {5,6,7,8,9};
		ArrayList<Integer> list1=new ArrayList<>(Arrays.asList(5,9,6,2,4,7));
		ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(11,5,9,6,2,4,8));

		System.out.println(arrayToArrayList(arr1));
		System.out.println(arrayToArrayList(arr2));
		System.out.println(maxNum(list2));
		System.out.println(secondMax(list2));
		System.out.println(secondMax2(list2));
	}

	private static int secondMax2(ArrayList<Integer> list2) {
		list2.remove(list2.indexOf(maxNum(list2)));
		return maxNum(list2);
	}

	private static int secondMax(ArrayList<Integer> list1) {
		Integer max=maxNum(list1);
		list1.remove(max);
		int secondMax=maxNum(list1);
		return secondMax;
		
		
	}

	private static int maxNum(ArrayList<Integer> list1) {
		int max=Integer.MIN_VALUE;
		for(int each:list1) {
			if(each>max) {
				max=each;
			}
		}
		return max;
		
	}

	private static ArrayList<Integer> arrayToArrayList(Integer[] arr1) {
		ArrayList<Integer> list=new ArrayList<>(Arrays.asList(arr1));
		Collections.sort(list);
		return list;
	}
	
	private static ArrayList<Double> arrayToArrayList(double[] arr1) {
		ArrayList<Double> list=new ArrayList<>();
		for(double each:arr1)
			list.add(each);
		return list;
	}


}
