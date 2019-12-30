package day34_Constructors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import day36_ConstructorsReview.Constructor_Review;

public class ArrayListMethods {
public static void main(String[] args) {
	ArrayList<Integer> list=new ArrayList<>();
	list.add(1);
	list.add(Integer.valueOf("35"));
	list.add(Integer.parseInt("44"));
	list.add(200);
	list.add(30);
	list.add(1);
	
	Constructor_Review obj1=new Constructor_Review(2);
	obj1.sum(5, 50);
	
	
	int a1=list.indexOf(1);
	System.out.println(a1); //==> 0
	int a5=list.lastIndexOf(1);
	System.out.println(a5); //==> 5
	int a2=list.indexOf(17);
	System.out.println(a2); //==> -1
	int a3=list.indexOf(200);
	System.out.println(a3); //==> 3
	int a4=list.indexOf(30);
	System.out.println(a4); //==> 4
	
	Integer[] arr= {1,2,3,4,5};
	ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(arr)); //==> converts only object arrays into ArrayList...
	System.out.println(list2);
	list2.add(100);
	list2.add(0,200);
	System.out.println(list2);
	
	String[] arr2= {"Java", "Python","C#","C++"};
	ArrayList<String> list3=new ArrayList<>(Arrays.asList(arr2));
	System.out.println(list3);
	System.out.println(list3.isEmpty());
	System.out.println(arr2[0].isBlank());
	list3.add(3,"F");
	System.out.println(list3);
	
	
	int[] arr3= {1,2,3,4,5}; //==> We cannot convert primitive array into ArrayList
	//ArrayList<String> list4=new ArrayList<>(Arrays.asList(arr3));
	
	ArrayList<String> names=new ArrayList<>();
	names.addAll(Arrays.asList("Murat","Defne","Ela","Yusuf"));
	
	ArrayList<Integer> numbers=new ArrayList<>();
	numbers.addAll(Arrays.asList(1,1,1,1,2,2,2,2,2,3,3,4,4,4));
	numbers.removeAll(Arrays.asList(1));
	System.out.println(numbers); 			//==>2,2,2,2,2,3,3,4,4,4
	numbers.removeAll(Arrays.asList(2,3));
	System.out.println(numbers); 			//==>4,4,4
	
	ArrayList<Integer> list1=new ArrayList<>();
	list1.addAll(Arrays.asList(1,1,1,2,2,3,3,4,2,1));
	System.out.println(list1);
	
	for (int i = 0; i < list1.size(); i++) {
		if(list1.get(i)==1) {
			list1.remove(i);   //==> remove() method doesnt work in loops
		}
	}
	System.out.println(list1); 
	
	
	
	//Arrays.sort(variableName); ==> array
	//Collections.sort(VariableName); ==> ArrayList
	
	Integer[] array={1000, 900, 80, 765, 123, 542};
	ArrayList<Integer> price=new ArrayList<>();
	price.addAll(Arrays.asList(array));
	System.out.println(price);
 	Collections.sort(price);
 	System.out.println(price);
	
}
}






















