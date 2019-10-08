package day11;

public class NumberOfDates3 {
public static void main(String[] args) {
	
	int month=2;
	int year= 1980;
	
	boolean valid = 0 < month && month <=12;
	boolean day28 = month==2;
	boolean day29 = month==2 && year%4==0;
	boolean day30 = month==4 || month==6 || month==9 || month==11;
	boolean day31 = month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12;
	
	String d28 = "February is 28 days for this year.";
	String d29 = "The year you are in is leap year and February is 29 days for this year.";
	String d30 = "The month you are in is 30 days.";
	String d31 = "The month you are in is 31 days.";
	String invalid = "Your input is invalid.";
	
	
	if (valid) {
		
		if (day29) {
		System.out.println(d29);
		}
		else if (day28) {
			System.out.println(d28);
		}
		else if (day30) {
			System.out.println(d30);
		}
		else {
			System.out.println(d31);
		}
	
	}
	
	else {
	System.out.println(invalid);
	}
}
}
