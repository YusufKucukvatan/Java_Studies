package TutorialWeek5;

public class EncapsulationCarRegistrationTest {
	public static void main(String[] args) {
		EncapsulationCarRegistration obj1 = new EncapsulationCarRegistration();
		System.out.println(obj1.getYear());
		obj1.setYear(2020);
		
		
		
		
		EncapsulationCarRegistration obj2 = new EncapsulationCarRegistration();
		System.out.println(obj2.getMake());
		obj2.setMake("Toyota");
		System.out.println(obj2.getMake());
	}
}
