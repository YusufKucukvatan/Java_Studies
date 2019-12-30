package day46_SuperKeyWord;

import day45_Inheritance.ProtectedVariables;
class Data {
    
    public  int num1 =10;
    protected  int num2 = 20;
    private  int num3 = 30;
    int num4 = 40;
    
}
public class InheritanceReveiw  extends Data{
    //          sub                     super           
    
    /*
         public  int num1 =10;
         protected  int num2 = 20;
         int num4 = 40;
     */
    
        static int staticNum;
               int insNum;
               
               public void mm() {
                   System.out.println( this.insNum );
               }
    
    public static void main(String[] args) {
        //System.out.println( this.insNum ); 
        // in order to call instances in a static method or block, we MUST have object
        
        InheritanceReveiw obj = new InheritanceReveiw();
        
          System.out.println(obj.num1);
          System.out.println(obj.num2);
        //System.out.println(num3); ==> Private doesn't belong to subclass...
          System.out.println( obj.num4 );
          
          Data obj2 = new Data();
          System.out.println( obj2.num1 );
          System.out.println( obj2.num2);
        //System.out.println( obj2.num3); ==> private is not visible in subclass
          System.out.println( obj2.num4 );
          
        
          ProtectedVariables obj3 = new ProtectedVariables();
        //System.out.println( obj3.nameProtected );  // protected is not visible outside package
          System.out.println( obj3.namePublic); // public is worldwide
          
        
          InheritanceReveiw  objA = new InheritanceReveiw();
          staticNum  = 100;
          objA.insNum = 200;
                
          InheritanceReveiw  objB = new InheritanceReveiw();
          objA.staticNum  = 300;
          objB.insNum = 400;
                    
          System.out.println( objB.insNum );  //400
          System.out.println(objA.insNum );    //200
                
          System.out.println( objB.staticNum );  //300
          System.out.println( objA.staticNum );  //300
          
          
          
    }
    
    
}
