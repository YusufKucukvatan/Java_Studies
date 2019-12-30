package TutorialWeek4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice {
	/*
		- Declare an arrayList and print the length of the array,
		- initialize some value for ArrayList
		- print all of arrayList element at once,
		- add
		- size
		- get
		- set
		- add(index, object)
		- clear
		- sort
		- remove(int)
		- remove(Integer)
		- equals(object)
		- contains
		- indexOf(object)
		- lastIndexOf(object)
		- isEmpty()
		- Arrays.asList(Object Array)
		- addAll(Interface) ==> Interface:Arrays.asList
		- removeAll(Arrays.asList(x,y)
	 	* remove doesn't work in any loop. We have to use removeAll method
		- take input from user with loop
		
	 */
	public ArrayListPractice(int a) {
		
	}
	
	public static void main(String[] args) {

		String[] str= {"Cybertek","Muhtar"};
		int[] num1= {4,5,6};
		Integer[] arr= {1,2,3};
		Integer i1=1;
		Integer i2=2;
		Integer i3=3;
		
		ArrayList<String> list=new ArrayList<>();
		ArrayList<Integer> list1=new ArrayList<>();
		list.add("1");
		list.add("Ekrem");
		list.add("Tabriz");
		list.add("Tarik");
		list.add("Mizgin");
		list.add("1");
		list.add("Mizgin");
		list.add("1");
		list.add("Yasin");
		list.add("Yasin");
		list.add(" 				");
		
		System.out.println(list);
		list.set(3, "Nilufer");
		System.out.println(list);
		list.add(3, "Fatih");
		System.out.println(list);
		System.out.println(list.get(3));
		System.out.println(list.size());
//		Collections.sort(list);
		System.out.println(list);
		
		list.removeAll(Arrays.asList("1","Mizgin"));
		System.out.println(list);
		list.addAll(Arrays.asList("Ali", "Yasin","Mizgin"));
		System.out.println(list);
		System.out.println(list.indexOf("Ali"));
		System.out.println(list.indexOf("Nilufer"));
		System.out.println(list.lastIndexOf("Yasin"));
		System.out.println(list.get(6).isEmpty());
		
		list1.add(2);
		list1.add(3);
		int num=list1.get(0)+list1.get(1);
		System.out.println(num);
		
		
	}

}









