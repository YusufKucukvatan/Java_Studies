package day11;

public class WarmUp {
	public static void main(String[] args) {
		
		int year;
		year = 2019;
		String Result1="This year is a leap year.";
		String Result2="This year is not a leap year.";
		boolean LeapYear = year%4==0;
		
		if (LeapYear) {
			System.out.println(Result1);
		}
		else {
			System.out.println(Result2);
		}
	}
			
}

