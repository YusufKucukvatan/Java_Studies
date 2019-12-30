package ArrayList;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
public class Review {
	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<>();
		list1.add(9);
		list1.add(3);
		list1.add(5);
		list1.add(8);
		list1.add(2);
		list1.add(6);
		list1.add(2, 4);
		System.out.println(list1);
		list1.set(0, 7);
		System.out.println(list1);
		System.out.println(list1.get(2));
		Collections.sort(list1);
		System.out.println(list1);
		list1.remove(0);
		System.out.println(list1);
		list1.remove(Integer.valueOf("6"));
		System.out.println(list1);
		System.out.println(list1.size());
		
		ArrayList<Integer> list2=new ArrayList<>();
		list2=list1;
		System.out.println(list2);
		list2.add(1);
		list2.add(5);
		System.out.println(list1.get(2).equals(5));
		System.out.println(list1.lastIndexOf(5));
		Integer[] arr= {11,12,13};
		list1.addAll(Arrays.asList(arr));
		System.out.println(list1);
		list1.add(3);
		list1.add(3);
		list1.add(3);
		System.out.println(list1);
		list1.removeAll(Arrays.asList(3,4,5));
		System.out.println(list1);
	
		
		
	}

}
