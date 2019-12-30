package day56_Polymorphism;

class A {
    
    protected void methodA() {
        System.out.println("method A from A class ");
    }
    
    public  static void methodC() {
        System.out.println(" method c from A class");
    }
    
}
class B extends A{
    public void methodB() {
        System.out.println("method B");
    }
    
    
    public void methodA() {
        System.out.println("method A from B class");
    }
    
    public  static void methodC() {
        System.out.println("method C from B class");
    }
    
    
}
public class PolymorphismReview {
    public static void main(String[] args) {
        A  obj = new A();
        
        A  obj2 =  new  B();
            obj2.methodA();
        //  obj2.methodB();
            
       //   B obj3 = new A(); // child class cannot be the reference to parent class' object.
                
            
        // C obj4 = new C(); // abstract class is not concrete
        
            C obj5 = new D() ;
            
            E obj6 =  new D() ;
            
        //  D obj7 = new E();  // we cannot create objecty from the interface
            
        //  C  obj8 = new E();  // we cannot create objecty from the interface
        
        //  E obj9 = new C();
            
        //  E obj10 = new F();
            
            A obj11 = new B();  
            obj11.methodA();   // from B clas
        //  if a method is exist in both reference type and object, the overridden one gets executed
            
            obj11.methodC();
            // if the method is not being overriddedn, then the reference type' method gets executed
            
    }
}
abstract class C{
    
}
class D extends C implements E {
    
}
interface E {   
    
}
abstract class F implements E{
    
}
