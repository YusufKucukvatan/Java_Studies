package Assignments;

public class Time {
	public static void main(String[] args) {
		int hour, minute, second; 
		hour=25;
		minute=55;
		second=34;
		
		String am="AM";
		String pm="PM";
		if (hour<=12 && minute<=59 && second<=59) {
			System.out.println("Time is: "+hour+":"+minute+":"+second+":"+am);
		}
		
		else {
			System.out.println("Time you typed is invalid.");
		}
		
	}

}
