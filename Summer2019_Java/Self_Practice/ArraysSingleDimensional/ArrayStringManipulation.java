package ArraysSingleDimensional;
import java.util.*;

public class ArrayStringManipulation {
	public static void main(String[] args) {
		String[] str= {"yusuf", "cengiz","osman","defne","murat"};
		
		for (int i = 0; i < str.length; i++) {
			str[i]=str[i].charAt(str[i].length()-1)+str[i].substring(1,str[i].length()-1)+str[i].charAt(0);
		}
		System.out.println(Arrays.toString(str));
		
		String name="Yusuf Betul Murat Defne Ela";

		System.out.println(name);
	}

}
