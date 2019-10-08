package day08_ShortHandOperators;

public class RelationalOperator {
	
	public static void main(String[] args) {
		
		System.out.println(10>9);
		boolean resultA=10>9;
		System.out.println(resultA);
		System.out.println(10>=9);
		
		boolean C= !false != !true; //==>true
		System.out.println(C);
		
		boolean D = !(!true);
		System.out.println(D);//==>true
				
		int num=198;
		System.out.println(num%2); //We can figure out by using reminder to 2 (%2)that any number is even or odd.
		
		
		
		
	}

}
