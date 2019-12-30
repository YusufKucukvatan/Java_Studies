package day48_MethodOverriding;

class Student{
	public void printName() {
		System.out.println("Murat");
	}
}


public class MethodOverriding extends Student{
	
	public static void print(String str) {
		
	}
	public String print(double d) { // That is overloading. The same name, different arguments.
		return null;				// Return type doesn't matter. 
									// We can overload a method only in the same class.	
	}								// Overriding can only be implement in subclass.
	
	@Override
	public void printName() {
		System.out.println("Defne"); //==>It is Method Overriding. Same signature, only body is modified.
	}
	
	public static void main(String[] args) {
		MethodOverriding obj1=new MethodOverriding();
		obj1.printName();  //==>Defne Because we overridden the method. If we didn't override the method
						   // the result is gonna be Murat.
		
		MethodOverriding obj2=new MethodOverriding();
		obj2.printName();  //==>Defne
	}
	
}
