package day50_Abstraction;

public abstract class Animal {
	public String gender;
	public int age;
	public String color;
	public String name;

	public Animal(String gender, int age, String color, String name) {
		this.gender = gender;
		this.age = age;
		this.color = color;
		this.name = name;
	}

	public abstract void speak(String language);

	public abstract void sleep(byte hours);

	public abstract void eat(String food);

	public abstract void drink(String drink);

}
