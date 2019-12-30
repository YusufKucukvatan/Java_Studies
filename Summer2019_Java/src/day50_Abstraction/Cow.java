package day50_Abstraction;

public class Cow extends Animal {

	public Cow(String gender, int age, String color, String name) {
		super(gender, age, color, name);
		System.out.println("My cow's name is " + name);
		System.out.println("My cow's gender is " + gender);
		System.out.println("My cow's color is " + color);
		System.out.println("My cow's age is " + age);
	}

	@Override
	public void speak(String language) {
		System.out.println("My cow " + name + " speaks as "+language);
	}

	@Override
	public void sleep(byte hours) {
		System.out.println("My cow " + name + " sleeps "+hours+" hours...");

	}

	@Override
	public void eat(String food) {
		System.out.println("My cow " + name + " eats only "+food);

	}

	@Override
	public void drink(String drink) {
		System.out.println("My cow " + name + " drinks "+drink);

	}

	public static void main(String[] args) {
		Cow myCow = new Cow("female", 3, "black and white", "Nazli");
		myCow.speak("moooo");
		myCow.sleep((byte)8);
		myCow.eat("grass");
		myCow.drink("water");
	}

}
