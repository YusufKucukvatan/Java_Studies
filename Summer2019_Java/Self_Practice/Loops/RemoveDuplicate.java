package Loops;

public class RemoveDuplicate {
	public static void main(String[] args) {
		String str="aaaabbbbddddaaaeeedddeeecccbbbgggfffhhh";
		String removeDup="";
		for (int i = 0; i < str.length(); i++) {
			if(!removeDup.contains(str.substring(i,i+1))) {
				removeDup+=str.substring(i,i+1);
			}
		}
		System.out.println(removeDup);
	}

}
