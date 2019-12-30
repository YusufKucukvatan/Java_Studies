package TutorialWeek5;

public class Encapsulation1 {
	private  String name = "Muhtar";
	private  String lastName = "Mahmut";
	private  int SSN = 123456789;
	int age = 25;
	int height = 175;
	int weight = 70;
	String company = "Cybertek";

	public int getSSN() {
		return SSN;
	}

	public void setSSN(int SSN) {

		if (SSN > 999999999)
			this.SSN = SSN;
		else
			System.out.println("Name should be at least 6 characters...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {

		if (name.length() > 5 && name.startsWith("M") && name.endsWith("n")) {
			this.name = name;
		} 
//		else {
//			System.out.println("Name must be at least 6 characters...");
//
//			System.out.println("Name must start with 'M' and ends with 'n'...");
//		}
	}

}
