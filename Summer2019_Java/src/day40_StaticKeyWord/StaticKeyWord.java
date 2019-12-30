package day40_StaticKeyWord;

public class StaticKeyWord {
    
    int a;
    static int b ;

public static void main(String[] args) {
    
    StaticKeyWord obj1 = new StaticKeyWord();
        obj1.a = 100; 
        
    StaticKeyWord obj2 = new StaticKeyWord();
        obj2.a = 200;
        
        System.out.println( obj1.a );  // 100
            // each object has its own copy of instance variables
        
        System.out.println( obj2.a ); //  200
        
    double num = 100.5;
    
    System.out.println( StaticKeyWord.b );
    System.out.println( obj1.b );
    System.out.println( obj2.b );
    
    System.out.println("=======================");
    
    StaticKeyWord obj3 = new StaticKeyWord();
            obj3.a = 100;
            System.out.println(obj3.a);    // 100
            
            
    StaticKeyWord obj4 = new StaticKeyWord();       
    System.out.println(  obj4.a );   //  0
    
    
    obj3.b = 400;
    System.out.println( obj3.b ); // 400  
    
    System.out.println( obj4.b ); // 400
    
    
    
}

public static void method1(){
//  System.out.println( num );  local variables only visible within the methods
    
}



}

