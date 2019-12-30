package day34_Constructors;

public class ConstructorMethod {
	/*
	 Declaration of constructor:
	 accessModifier className(parameters) {
	 
	 }
	 Every single class must have a constructor...
	 if we do not provide a constructor, compiler will give the default constructor without argument.
	 default constructor: 
	 access-modifier className () {
	 
	 }
	 */
	public ConstructorMethod(Integer n) {
		System.out.println("Default constructor");
		System.out.println("I am a default constructor");
	}
	
	public ConstructorMethod() {
		System.out.println("Default constructor");
		System.out.println("I am a default constructor");
	}
	
	public static void main(String[] args) {
	
		ConstructorMethod obj1 = new ConstructorMethod();
		
		ConstructorMethod obj2 = new ConstructorMethod(3);
		method1();
	}
	public static void method1() {
		ConstructorMethod obj2 = new ConstructorMethod(3);
	}
}
