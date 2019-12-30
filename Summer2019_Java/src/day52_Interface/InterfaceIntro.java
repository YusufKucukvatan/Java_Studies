package day52_Interface;

public interface InterfaceIntro {
		/*  
		    {
		        
		    }
		    
		    static {
		        
		    }
		    
		    */
		    // public InterfaceIntro() {  }
		    
		    // public void methodB() { }
		    
		    public default void  methodC() {
		        
		    }
		    
		    public abstract void methodA();
		    
		    public static void mm() {
		        
		    }
		    
		    
		     int a =100;  // public static final
		     
		     public static final int b = 200;
		        
		        // public  protected int num =100;
		    
		    public static void main(String[] args) {
		        InterfaceIntro.mm();
		        
		        System.out.println(a);  //  variables are static by default 
		        //a = 200; // vairables are final by default 
		    }
		    
		    
		    
		    
		    
		}
		interface Data{
		    
		    
		}
		class Test implements InterfaceIntro, Data{
//		    subtype           supertype,     supertype
		    
		    @Override
		    public void methodA() {
		        
		    }
		    
		    
		}
		// class B extends A, Test{  }  a class can only extend one class
		class D{
		    static int a =200;
		    
		    static {
		        a = 500;
		    }
		    
		    
		}

	

