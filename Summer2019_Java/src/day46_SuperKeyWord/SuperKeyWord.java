package day46_SuperKeyWord;

class A {
    
    String name = "Madina";
    
    public void methodA() {
        
    }
    
    
    public A ( int a ) {
        
    }
    
}
public class SuperKeyWord extends A {
        //      sub               super
    
    public SuperKeyWord(double b) {
        super(10);  // super class' constructor MUST be called in the sub class
    }
    
          
    
    
  
        String name  = "Madina";
   
    
    
    
    public void method() {
        super.name = "Mahir";
        this.name = "Ihsan";
        super.methodA();
        this.methodA();
    }
    
    
}

