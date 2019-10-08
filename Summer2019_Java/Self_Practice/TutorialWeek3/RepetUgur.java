package TutorialWeek3;

public class RepetUgur {
	public static void main(String[] args) {
		String str="book is fun book is fun book is fun book";
		
		String str2="";
		int count=0;
		for (int i = 0; i < str.length(); i++) {
		str2+=str.charAt(i);
			if(str2.endsWith("book")) {
				
				count++;
			}
		}
		System.out.println(count);
		
//		for (int i = 0; i < str.length(); ) {
//			if(str.contains("book")) {
//					count++;
//		}
//			str=str.replaceFirst("book", "");
//	}
//		System.out.println(count);

}
}