package day11;

public class Age {
	public static void main(String[] args) {
		
	int age;
	age = 25;
	
	boolean allowed=age>=18;
	boolean milk=age<18;
	boolean cigarette=age>=18;
	boolean hookah=age>=21;
	boolean alcohol=age>=25;

	String permission="You are under 18 and only allowed to drink milk.";
	String permission1="You are allowed to smoke cigarette.";
	String permission2="You are allowed to smoke cigarette and hookah.";
	String permission3="You are allowed to smoke cigarette and hookah and drink alcohol.";
			
	if (allowed) {
		if (alcohol) {
			System.out.println(permission3);
		}
		else if(hookah) {
			System.out.println(permission2);
		}
		else {
			System.out.println(permission1);
		
		}
		
	}
	else {
			System.out.println(permission);
	}
	}

}
