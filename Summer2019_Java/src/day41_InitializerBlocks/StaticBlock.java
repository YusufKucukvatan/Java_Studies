package day41_InitializerBlocks;

import java.util.ArrayList;
import java.util.Arrays;

public class StaticBlock {
	static {
		System.out.println("Static block-1");
//		int[] arr=new int[5];
//		System.out.println(Arrays.toString(arr));
//		students.addAll(Arrays.asList(online));
	}
	static String name;
	public static int[] arr;
	static ArrayList<String> list=new ArrayList<String>();
	public static ArrayList<String>students=new ArrayList<>();
    public static String[]online= {"Arzugul","me","spike","savas","bahadir"};
    public static String []inClass= {"Daryna","nadira","olga","mizgin"};
	
	public StaticBlock() {
		System.out.println("Constructor");
	}
	{
		System.out.println("Instance-1");
	}
	public void ahmet() {
		System.out.println("method");
	}
	public static void main(String[] args) {
		System.out.println("Main method");
		StaticBlock obj1=new StaticBlock();
		obj1.ahmet();
		obj1.ahmet();
		System.out.println("Main method");
		StaticBlock obj2=new StaticBlock();
		System.out.println("Main method");
		//System.out.println(students);
		obj2.ahmet();
	}
	static {
		System.out.println("Static block-2");
//		int[] arr=new int[3];
//		System.out.println(Arrays.toString(arr));
//		students.addAll(Arrays.asList(inClass));
	}
	{
		System.out.println("Instance-2");
	}
}
