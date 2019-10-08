package day30_ArrayList_WrapperClass;

public class WarmUp {
	public static void main(String[] args) {
		String str = "AAAAaaaBBBBbbbCCcccccDddzXVNM";
		removeDup(str);
	}

	public static void removeDup(String str) {
		String str2 = "";
		String unique="";
		for (char i = 0; i < 128; i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (i == str.charAt(j)) {
					count++;
				}
			}
			if(count==1) {
				unique+=i+", ";
			}
			if (count > 1) {
			System.out.println(i+" occures "+count+" times within the string.");
				str2 += i;
			}
		}
		System.out.println("Word after removing duplication is: "+str2);
		System.out.println(unique.substring(0,unique.length()-2)+" are unique characters within the string.");	
	}
}