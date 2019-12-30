package day50_Abstraction;

public class Cat extends Animal {

	public Cat(String gender, int age, String color, String name) {
		super(gender, age, color, name);
		System.out.println("My cats's name is " + name);
		System.out.println("My cat's gender is " + gender);
		System.out.println("My cat's color is " + color);
		System.out.println("My cats's age is " + age);
	}

	@Override
	public void speak(String language) {
		System.out.println("My cat " + name + " speaks as meow...");
	}

	@Override
	public void sleep(byte hours) {
		System.out.println("My cat " + name + " sleeps 14 hours...");

	}

	@Override
	public void eat(String food) {
		System.out.println("My cat " + name + " eats only m&m...");

	}

	@Override
	public void drink(String drink) {
		System.out.println("My cat " + name + " drinks hot chocolate...");

	}

	public static void main(String[] args) {
		Cat myCat = new Cat("female", 2, "white", "Minnosh");
		myCat.speak("meauw");
		myCat.sleep((byte)15);
		myCat.eat("mama");
		myCat.drink("milk");
	}

}
