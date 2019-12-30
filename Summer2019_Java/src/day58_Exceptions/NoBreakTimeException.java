package day58_Exceptions;


public class NoBreakTimeException extends RuntimeException{
    public NoBreakTimeException() {
        
        super("Too much breaks have occured in java course");
        System.err.println("There is no break till we get job done");
    }
    
}
