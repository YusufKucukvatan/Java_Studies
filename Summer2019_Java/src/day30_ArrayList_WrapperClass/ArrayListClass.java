package day30_ArrayList_WrapperClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListClass {
	public static void main(String[] args) {
		Integer[] arr= {1,2,3};
		ArrayList<Integer> list1=new ArrayList<>(Arrays.asList(arr));
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list2.get(2));
		System.out.println(list2.size());
		list2.clear();
		System.out.println(list2); 
		System.out.println(list2.size());
		
		
	}

}
