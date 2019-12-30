package day58_Exceptions;

public class ClassNotes {

}
/*

12/03/2019
Topic: Exceptions Continue
            Multi-catch blocks
            throws keyword
            throw keyword
            Custom Exceptions: NoBreakException
            throw vs throws
            final vs finally
        Exceptions Interveiw Questions
Package Name: day59_Exceptions
Agenda:
    Morning: Java
    Afternoon: Selenium
Multi- catch block:
        we can have multiple catch blocks with one try block
        CONDITION: parent exception type needs to be after it's sub exception type, otherwise code will be unreachable
        CANNOT BE CONFLICTED
        Exception > RuntimeException > Arithmetic .....
            try{
            } catch( exception1 name){
            } catch(exception2 name){
            }
            Ex: 
                try{
                }catch(ArithmaticException e){
                }catch(ArithmaticException e){
                }
            in multi-catch block whichever handles the exception first will gets executed
throws keyword: used for handling exceptions
        used with method signature, indicates that method might throw exception
        MUST be used with method signature
        Ex:
            public static void sleep() throws InterruptedException{
                Thread.sleep(1000);
            }
        there will be exception thrown with the method.
        whoever calls the method , they must handle it
        CALLER still has to deal with the exception, it's Caller' responsibility to handle the xception
        method can throw more than one exception
            Ex: public void method() throws Interrupted, IOE ... { }
        MAINLY used for checked exception
throw keyword:  used for manually throw an exception 
            create object: new ClassName();
            throw objectOfException;
                Ex: throw new RuntimException();
            after throwing an exception, any code we give will be unreachable
            when we throw checked exception, code will not compile, 
Custom exception: we can create a class that extends exceptions to make it a custom exception class
    how we create a custom unchecked exception?
        create a class that extends runtimException  class
    how we create a custom checked exception?
        create a class that extends Exception class
Friday: review exception
            checked & unchecked
            tr&catch
            throws
            throw
            


*/