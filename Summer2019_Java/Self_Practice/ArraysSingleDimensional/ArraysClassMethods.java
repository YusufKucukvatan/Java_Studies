package ArraysSingleDimensional;

import java.util.Arrays;

public class ArraysClassMethods {
	public static void main(String[] args) {
		String[] names = { "Yusuf", "Betul", "Murat", "Defne" };
		System.out.println(names[3]);
		System.out.println(Arrays.toString(names)); // converts to string and then prints all elements at once
		int[] numbers = { 4, 8, 1, 9, 43, 23, 56 };
		System.out.println(numbers); // give the hashcode of the array
		System.out.println(Arrays.toString(numbers)); // prints all elements without sorting
		Arrays.sort(numbers); // sorts all elements from smaller to greater
		System.out.println(Arrays.toString(numbers)); // and now prints all elements in order
		int[] numbers2 = { 4, 8, 1, 9, 43, 23, 56 };
		System.out.println(Arrays.toString(numbers2));

		char[] ch = { 'a', 'b', 'e', 'd', 'a' };
		System.out.println(ch);
	}

}
