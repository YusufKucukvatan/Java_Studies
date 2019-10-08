package day14_Scanner;

public class WarmUp {
	public static void main(String[] args) {

		String day = "Tuesday";
		switch (day) {
		case ("Monday"):
		// We didn't use any println and break in this case. So, It is a kind if boolean logic in switch case.
		// Either Monday or Tuesday is the true case, system is going to print "Java class" below. 	
		case "Tuesday":
			System.out.println("Java class");
			break;
		case "Wednesday":
			System.out.println("SQL class"); // We can also delete this statement and add this case just before Saturday case. So it the as Monday-Tuesday combination.
			break;							 // So it the as Monday-Tuesday combination.
		case "Thursday":
			System.out.println("Java class");
			break;
		case "Friday":
			System.out.println("Selenium");
			break;
		case "Saturday":
			System.out.println("SQL");
			break;
		default:
			System.out.println("Day off");
		}
	}

}
