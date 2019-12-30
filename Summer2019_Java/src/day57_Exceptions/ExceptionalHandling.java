package day57_Exceptions;

public class ExceptionalHandling {

	/*
    try{
            exception statements/code
        } catch(ExceptionClass name){
            statements
        }
*/

public static void main(String[] args) {

int[] number = {100,200,300};

try {
    
    System.out.println( number[5] );
    System.out.println("Trye block, Checked exception");
    
} catch(ArrayIndexOutOfBoundsException e) {
    
    System.out.println("catch block, unchecked exception");
    
}


System.out.println("===================================================");


try {
    
    Thread.sleep(3000);
    System.out.println("Trye block, Checked exception");
    
}catch(InterruptedException e) {
    System.out.println("catch block, unchecked exception");
}



System.out.println("Work Done");







}

public static void method(String kfc) {

}






	
}
