package day12_SwitchStatement;

public class SwitchStatement {
	public static void main(String[] args) {

		/*
		 * 
		 * Switch statement does similar things with multi-branch if statement
		 * 
		 * 
		 * switch (variable name) { 
		 * case variablevalue: System.out.println("....."); ==>
		 * behaves like else if or if break; ========================> once we put
		 * break, case behaves like else if. case variablevalue:
		 * System.out.println("......");==> behaves like else if or if break;
		 * ========================> if we don't put break, case behaves like if
		 * default: System.out.println("......");==> behaves like else } the order of
		 * the cases and default doesn't matter. we can have only one default for each
		 * switch statement
		 * 
		 * We can use String, byte, short, int and char for a case of switch.
		 * We cannot use long, float, double and boolean as a case of switch.
		 * 
		 */

		int score = 1;
	
		if (score == 1) {
			System.out.println("1");
		} else if (score == 2) {
			System.out.println("2");
		} else {
			System.out.println("invalid");
		}

		switch (score) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		default:
			System.out.println("invalid");
		}

		///////////////////////////////

		String str = "Java";

		switch (str) {

		case "C#":
			System.out.println("C# programming language");
			System.out.println("D# programming language");
			break;
		case "Python":
			System.out.println("Phython programming language");
		default:
			System.out.println("Invalid");
		}

		///////////////////////////////////////

		char ch = 'A';
		switch (ch) {

		case 'B':
			System.out.println("Passed with B");

		case 'A':
			System.out.println("Passed with A");

		default:
			System.out.println("Failed");

		}

		int pin = 1234;

		switch (pin) {
		case 1236:
			System.out.println("You can drive car1");

		case 1235:

			System.out.println("You can drive car2");
			break;

		case 1234:
			System.out.println("You can drive car3");

		default:
			System.out.println("You can drive car4");
		}
		////////////////////////////////////////////////////////

		String days = "Tuesday";

		switch (days) {
		case "Monday":
			System.out.println("Monday is fun day");
			break;
		case "Tuesday":
			System.out.println("Tuesday is great day");
			break;
		case "Wednesday":
			System.out.println("Wednesday is off day");
			break;
		case "Thursday":
			System.out.println("Thursday is fabulous day");
			break;
		default:
			System.out.println("Invalid");
			break;
		}

		/////////////////////////////

		String dayss = "Tuesday";

		switch (dayss) {
		default:
			System.out.println("Invalid");
			// break;
		case "Monday":
			System.out.println("Monday is fun day");
			// break;
		case "Tuesday":
			System.out.println("Tuesday is great day"); // Without break==>After finding first true expression,
			// break; Java prints all next statement regardless that case is true or
			// false...
		case "Wednesday":
			System.out.println("Wednesday is off day");
			// break;
		case "Thursday":
			System.out.println("Thursday is fabulous day");
			// break;
		}
		
		////////////////////
		
		char char1 = 'A';
		switch ('A') {
		case 'A':
			System.out.println("Trial");
		}
		
		/////////////////////
		
		String US = "USA";
		
		if(US=="USA" || US=="America" || US=="US") {
			System.out.println("American");
		}
		else {
			System.out.println("Not American");
		}
		
		// The switch statement below is the converted version to the switch statement below... 
		
		switch (US) {
		case "USA":
		case "America":
		case "US":
			System.out.println("American");
			break;
		default:
			System.out.println("Not American");
		}
	}
}
