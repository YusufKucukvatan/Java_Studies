package day10_ifStatement;

public class MultiBranchIfStatement {

	public static void main(String[] args) {
		

	if (false) {
		System.out.println("if block");
	}
	
	else if (false) {
		System.out.println("else if block");
	}
	else {
		System.out.println("else block");
		}
	
	int grade;
	grade=79;
	String result=".";
	
	if(100>=grade && grade>=90) {
		result = "Your Grade is A.";
	}
	else if (grade>=80) {
		result = "Your Grade is B.";
	}
	else if(grade>=70) {
		result = "Your Grade is C.";
	}
	else if(grade>=60) {
		result = "Your Grade is D.";
	}
	else {
		result = "Your Grade is F.";
	}
	System.out.println(result);
	
	System.out.println("\n=============================================\n");
	
	
    int hour; // minute, second;
    hour=25;
    // minute=34
    // second=25
    String greet=".";
    
    if (12>hour && hour>=0) {
    	greet="Good morning";
    }
    
    if (15>hour && hour>12) {
    	greet="Good afternoon";
    }
    
    else if (23>hour && hour>=15) {
    	greet="Good night";
    	
    }
    if (hour==12) {
    	greet="Good noon";
    	
    }
    else {
    	greet="The time you typed is invalid.";
    }
    
    System.out.println(greet);
    
    System.out.println("\n========================\n");
	
	
	}
}
