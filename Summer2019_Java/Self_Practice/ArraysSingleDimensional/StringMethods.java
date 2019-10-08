package ArraysSingleDimensional;

import java.util.Arrays;

public class StringMethods {
	public static void main(String[] args) {
		String sentence="Today is great day, Good day to learn Java";
		sentence.split(" ");
		String[] arr=sentence.split(" ");
		System.out.println(Arrays.toString(arr));
		
		String Java="I love.Java.and Java is Fun, Java is life";
		//			 I love  |   and  | is Fun,    |   is life
		String[] array2=Java.split("\\.");
		System.out.println(Arrays.toString(array2));
		String str=Arrays.toString(array2);
		System.out.println(str.replace("[","").replace("]", ""));
		String str2="Java";
		char[] ch=str2.toCharArray();
		System.out.println(ch);

	}

}
