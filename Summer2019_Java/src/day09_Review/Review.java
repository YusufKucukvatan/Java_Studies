package day09_Review;

public class Review {

	public static void main(String[] args) {
		// LOGICAL OPERATORS
		System.out.println('Z'>'A');//True
		System.out.println('Z'>='A');//True
		System.out.println('z'>'Z');// Capital letters has smaller values than lower case letters in ASCII table.
									// Means that A=68, a=97
		System.out.println('a'>'Z');// True
		
		
		if (true) {
			System.out.println("Hello");
			System.out.println("world");
			
		}
		
		if (false) {
			System.out.println("hello"); // Doesn't print if the result of the boolean expression within the paranthesis after if is false...
			System.out.println("world");
		}
		
		int x=9877650;
		if (x%2==0) {
			System.out.print(x);
			System.out.println(" is an even number");
			
		}
		
		long m = 877865;
		if (m%2>0) {
			System.out.print(m);
			System.out.println(" is an odd number");
	
		}
		String CEO="Main Boss";
		String Kuzzat="Main Boss";
		System.out.println(CEO==Kuzzat); //true
		
		if(CEO==Kuzzat) {
			System.out.println("Great person in the world");
		}
		
		double TotalNumber=100;
		boolean CyberTek=true;
		boolean BestSchool=true;
		
		if(CyberTek==BestSchool) {
			TotalNumber+=500;  //600 if CyberTek is the Best School. If it doesn't happen so the if statement below will happen.
			System.out.println(TotalNumber);
		}
		if(CyberTek!=BestSchool) {
			TotalNumber-=50; //The value is gonna be 50 if the statement above didn't happen.
			System.out.println(TotalNumber);
		}
		
		
		int PersonAge=17;
		int VoteAge=18;
		if (PersonAge>=VoteAge) {
			System.out.println("This person is eligible to vote.");
		}
		
		if(PersonAge<VoteAge) {
			System.out.println("This person is not eligible to vote.");
		}
	}
}
