package day36_ConstructorsReview;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUp {
	public static void main(String[] args) {
		ArrayList<Integer> list1= new ArrayList<>();
		list1.addAll(Arrays.asList(1,1,1,2,2,3,3,3,3,3,4,4,5,5,5,5,6,7,8));
		ArrayList<Integer> removed= new ArrayList<>();
		removed=removeDuplicate(list1);
		System.out.println(removed);
	}

	public static ArrayList<Integer> removeDuplicate(ArrayList<Integer> list){
		ArrayList<Integer> result=new ArrayList<>();
		for(Integer each : list) {
			if(!result.contains(each)) {
				result.add(each);
			}
		}
		return result;
	}
}
