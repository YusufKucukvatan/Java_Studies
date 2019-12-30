package TutorialWeek5;

import java.util.ArrayList;

public class RemoveMethodWithLoop {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i+1);
		}
		System.out.println(list);

		
		for (int i = 9; i >= 0; i--) {
			list.remove(i);
		}
		System.out.println(list);
		
		
		for (int i = 0; i < 10; i++) {
			list.add(i+1);
		}
		System.out.println(list);
		
		
		for (int i = 0; i<list.size(); i++) {
			list.remove(i--);
		}
		System.out.println(list);
	}
	

}
