package day48_MethodOverriding;
public class FinalKeyWord {
	final static int age=37;
	
	public static void main(String[] args) {
		final int SSN;
		SSN=12345;
		//SSN = 67890; //We cannot reinitialize constant variable
		System.out.println(SSN);
		final String name;
		name="Murat";
		//age=1;
		System.out.println(age);
	}

}
