package day50_Abstraction;

public class Zoo {
	public static void main(String[] args) {
		Dog dog=new Dog("male", 7, "black", "Oscar");
		dog.speak("haw haw");
		dog.sleep((byte) 3);
		dog.eat("meat");
		dog.drink("coke");
		
		System.out.println("=====================================");

		Cat cat=new Cat("male", 1, "brown", "Pisi Pisi");
		cat.speak("misha");
		cat.sleep((byte) 18); 
		cat.eat("KFC");
		cat.drink("apple juice"); 
		
		System.out.println("=====================================");
		
		Cow cow=new Cow("female", 6, "brown", "Nazli");
		cow.speak("meeeeeeee");
		cow.sleep((byte) 12);
		cow.eat("chaff");
		cow.drink("pepsi");
		
	}

}
