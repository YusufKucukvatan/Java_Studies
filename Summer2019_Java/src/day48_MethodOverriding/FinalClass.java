package day48_MethodOverriding;

class NonFinal {

}

final public class FinalClass extends NonFinal {
	public static void main(String[] args) {
		
	}
}

final class Test { //extends FinalClass ==> final class cannot be super class
}
