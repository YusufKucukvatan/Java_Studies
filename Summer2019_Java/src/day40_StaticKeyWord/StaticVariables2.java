package day40_StaticKeyWord;

import java.util.Arrays;

public class StaticVariables2 {
	static String name;
	static double staticNum;
	int num1;

	public static void method1() {
		System.out.println("Open the browser-static");
	}
	public void method2() {
		System.out.println("Open the browser-instance");
	}

	public static void main(String[] args) {
		StaticKeyWord.method1(); // static method we can call it through the class name
		
		StaticVariables2 obj3=new StaticVariables2();
		obj3.method2();
		
		System.out.println( obj3.num1 ); // static method only accepts class members

		StaticVariables2 objectA = new StaticVariables2();
		System.out.println(objectA.num1);

		StaticVariables2 obj1 = new StaticVariables2();
		obj1.name = "Omer";
		System.out.println(obj1.name); // omer

		StaticVariables2 obj2 = new StaticVariables2();
		obj2.name = "Khurshed";

		System.out.println(obj2.name); // khurshed
		System.out.println(obj1.name); // khurshed

		// =======================================================
		System.out.println(StaticVariables2.staticNum); // 0.0

		StaticVariables2 object1 = new StaticVariables2();
		object1.staticNum = 4.5;
		System.out.println(object1.staticNum); // 4.5

		StaticVariables2 object2 = new StaticVariables2();
		System.out.println(object2.staticNum); // 4.5

	}

}
