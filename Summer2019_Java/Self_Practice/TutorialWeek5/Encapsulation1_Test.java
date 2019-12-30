package TutorialWeek5;

public class Encapsulation1_Test {
	public static void main(String[] args) {
		Encapsulation1 obj1=new Encapsulation1();
		System.out.println(obj1.age);
		obj1.age=55;
		System.out.println(obj1.age);
//	
		System.out.println(obj1.getName());
		obj1.setName("Yusuf");
		System.out.println(obj1.getName());
		obj1.setName("Marufjan");
		System.out.println(obj1.getName());
		
		
		Encapsulation1 obj2=new Encapsulation1();
		System.out.println(obj2.getName());
		obj2.setName("Marufhgfhgfhgjan");
		System.out.println(obj2.getName());
		System.out.println(obj2.getSSN());
		
		Encapsulation1 obj3=new Encapsulation1();
		obj3.setName("Maaaaaaaannnn");
		System.out.println(obj3.getName());
		System.out.println(obj3.getSSN());
		
		Encapsulation1 obj4=new Encapsulation1();
		obj4.setName("Maaaaaaaaaaaaaaaaaaaaaaaaaaaaannnn");
		System.out.println(obj1.getName());
		System.out.println(obj2.getName());
		System.out.println(obj3.getName());
		System.out.println(obj4.getName());

		
		// Change the data field to static for practice
	}

}
