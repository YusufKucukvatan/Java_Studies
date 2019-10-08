package aa_WarmUp;

import java.util.Scanner;

public class SchoolRegistration2 {
	public static void main(String[] args) {

		/*
		 * Scenario: School Registration... Write an application which; - student's
		 * name, - student's age, - if student knows English, (if student doesn't know
		 * english register student a lower grade than expected) - student's mother
		 * tongue, - if any school/pre-school experience that student has in U.S, (if
		 * student doesn't have any school experience, register student a lower grade
		 * than expected) - if student has any health care coverage, (If student doesn't
		 * have any coverage, register student only to soft sports branch IOT prevent
		 * any injuries in advance) - student's resident status such as U.S citizen,
		 * green card, immigrant or undocumented, (provide student a free lunch benefit
		 * if student is an immigrant or undocumented) - the distance between school and
		 * student's home in order to calculate school bus departure and arrival time
		 * from/to the nearest bus stop, - if family wants to get free lunch benefit
		 * from Fairfax County Public School Associate, (Free lunch can be provided if
		 * only you are undocumented and immigrant) - sports teams which is available
		 * for student, (take into consideration health care coverage for injuries)
		 * 
		 * - Finally print out all the information that family needs such as: - personal
		 * information about the student (name, age, language, health care coverage ) -
		 * which class student is going to attend, - is student going to able to get
		 * free lunch benefit, - school bus departure and arrival time from/to the
		 * nearest bus stop, - which sports team is student going to attend, - Available
		 * sports for the student
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("*** Welcome to Cybertek Elementary School ***\nPlease type all characters in lower cases.");
		System.out.print("Please enter student's last name: ");
		String lastname = input.next();
		System.out.print("Please enter student's name: ");
		String name = input.next();
		System.out.print("Please enter student's age: ");
		int age = input.nextInt();
		System.out.print("Please enter the distance between your home and school: ");
		int distance = input.nextInt();
		System.out.print("Has student attended any school in U.S before: ");
		String experience = input.next();
		System.out.print("Does student have any health care coverage: ");
		String healthcare = input.next();
		System.out.print("What is student's resident status in U.S: ");
		String residentstatus = input.next();
		System.out.print("Do you want to benefit from free lunch: ");
		String freelunch = input.next();
		System.out.print("Please enter student's mother tongue: ");
		String tongue = input.next();
		
		
		switch (tongue) {
		case "english":

			switch (age) {
			case 4:
				System.out.println("Student is going to attend Pre-K.");
				break;
			case 5:
				System.out.println("Student is going to attend Kindergarten.");
				break;
			case 6:
				System.out.println("Student is going to attend 1st grade.");
				break;
			case 7:
				System.out.println("Student is going to attend 2nd grade.");
				break;
			case 8:
				System.out.println("Student is going to attend 3rd grade.");
				break;
			default:
				System.out.println("Please contact with the Public Schools Associate for other age groups");
			}
			break;
		default:
			System.out.print("Does student know English: ");
			String knowsEnglish = input.next(); 
			switch (knowsEnglish) {
			case "yes":
				switch (experience) {
				case "yes":
					switch (age) {
					case 4:
						System.out.println("Student is going to attend Pre-K.");
						break;
					case 5:
						System.out.println("Student is going to attend Kindergarten.");
						break;
					case 6:
						System.out.println("Student is going to attend 1st grade.");
						break;
					case 7:
						System.out.println("Student is going to attend 2nd grade.");
						break;
					case 8:
						System.out.println("Student is going to attend 3rd grade.");
						break;
					default:
						System.out.println("Please contact with the Public Schools Associate for other age groups");
					}
					break;
				default:
					switch (age) {
					case 4:
						System.out.println("Please contact with the Public Schools Associate for other age group.");
						break;
					case 5:
						System.out.println("Student is going to attend Pre-K.");
						break;
					case 6:
						System.out.println("Student is going to attend Kindergarten.");
						break;
					case 7:
						System.out.println("Student is going to attend 1st grade.");
						break;
					case 8:
						System.out.println("Student is going to attend 2nd grade.");
						break;
					case 9:
						System.out.println("Student is goind to attend 3rd grade.");
						break;
					default:
						System.out.println("Please contact with the Public Schools Associate for other age groups");
					}

				}
				break;
			default:
				switch (age) {
				case 4:
					System.out.println("Please contact with the Public Schools Associate for other age group.");
					break;
				case 5:
					System.out.println("Student is going to attend Pre-K.");
					break;
				case 6:
					System.out.println("Student is going to attend Kindergarten.");
					break;
				case 7:
					System.out.println("Student is going to attend 1st grade.");
					break;
				case 8:
					System.out.println("Student is going to attend 2nd grade.");
					break;
				case 9:
					System.out.println("Student is goind to attend 3rd grade.");
					break;
				default:
					System.out.println("Please contact with the Public Schools Associate for other age groups");
				}
			}
		}
		if (distance <= 5) {
			System.out.println(
					"School Bus with the number LM-04 departures from the closest bus stop at 8.05am and arrives at 3.10pm.");
		} else if (5 < distance && distance <= 10) {
			System.out.println(
					"School Bus with the number LM-04 departures from the closest bus stop at 7.55am and arrives at 3.20pm.");
		} else {
			System.out.println(
					"School Bus with the number LM-04 departures from the closest bus stop at 7.45am and arrives at 3.30pm.");
		}

		switch (healthcare) {
		case "yes":
			System.out.println("Student can attend any of our sports team.");
			break;
		default:
			System.out.println("Student can only attend badminton, table tennis and chest teams");
		}

		switch (freelunch) {
		case "yes":
			switch (residentstatus) {
			case "immigrant":
				System.out.println(
						"You are eligable for free lunch. Student's PIN for free lunch is 1234. Enjoy your lunch.");
				break;
			case "undocumented":
				System.out.println(
						"You are eligable for free lunch. Student's PIN for free lunch is 1234. Enjoy your lunch.");
				break;
			default:
				System.out.println("You are not eligable for free lunch.");
			}
		}
	}
}
