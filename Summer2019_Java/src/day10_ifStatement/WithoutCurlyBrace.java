package day10_ifStatement;

public class WithoutCurlyBrace {
	public static void main(String[] args) {
		
		if (false) {
			
			System.out.println("Tomorrow is Friday."); //If we use {} after if condition; it recognizes that oll the lines belong to this 'if' block
			System.out.println("Tomorrow is Tuesday.");
			System.out.println("Today is Friday.");
		}
		
		if (true)
			System.out.println("2_Today is Friday."); // but for this id condition without {} after condition; it recognizes that only the first line belongs to this if block...
			System.out.println("2_Tomorrow is Tuesday.");
			System.out.println("2_Today is Friday.");
			
			// we are always supposed to put curly braces to the end of if condition...
			
			if (true)
				System.out.println("Hello");
				System.out.println("Good morning");
			//else if  // It doesn't recognize else if statement as a part of if statement, because there is no curly brace after if.
			
			//System.out.println("Holla");
			
			//else 
			//System.out.println("bye");
	}

}
