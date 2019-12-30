package day58_Exceptions;

public class TestCustomException {
    
    public static void main(String[] args) throws LunchTimeException {
        
    //   throw new NoBreakTimeException();
    //  throw new RuntimeException("There is a run time exception");
        
        boolean StudentAskedForBreak = false;
        
        if(StudentAskedForBreak) {
            throw new NoBreakTimeException();
            
        } else {
            System.out.println("Continue the class");
        }
        
        
        
    try {   
        throw new NoBreakTimeException();
        
    } catch (RuntimeException e) {
        System.out.println("It has to be a break time, No more java");
        
    }
        
        
    //throw new Exception("123213");
    
    
    throw new LunchTimeException();
        
        
        
        
        
    }
}
