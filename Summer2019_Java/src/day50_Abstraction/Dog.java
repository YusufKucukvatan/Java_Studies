package day50_Abstraction;

public class Dog extends Animal {

	public Dog(String gender, int age, String color, String name) {
		super(gender, age, color, name);
		System.out.println("My dog's name is " + name);
		System.out.println("My dog's gender is " + gender);
		System.out.println("My dog's color is " + color);
		System.out.println("My dog's age is " + age);
	}

	@Override
	public void speak(String language) {
		System.out.println("My dog " + name + " speaks as "+language);
	}

	@Override
	public void sleep(byte hours) {
		System.out.println("My dog " + name + " sleeps "+hours+" hours...");

	}

	@Override
	public void eat(String food) {
		System.out.println("My dog " + name + " eats only "+food);

	}

	@Override
	public void drink(String drink) {
		System.out.println("My dog " + name + " drinks "+drink);
		this.age=5;

	}

	public static void main(String[] args) {
		Dog myDog = new Dog("Yellow", 5, "yellow", "Funny");
		myDog.speak("haw haw");
		myDog.sleep((byte)5);
		myDog.eat("chocolate");
		myDog.drink("water");		
		
	}

}
