package day40_StaticKeyWord;

public class StaticVariables {
	    static String name ;
	    
	    public static void main(String[] args) {
	        
	        StaticVariables obj1 = new StaticVariables();
	                obj1.name = "Omer";
	        System.out.println( obj1.name );    // omer
	                
	        
	        StaticVariables obj2  = new StaticVariables();  
	                obj2.name = "Khurshed" ; 
	                
	        System.out.println(  obj2.name );  // khurshed
	        
	        System.out.println( obj1.name );   // khurshed
	        
	}

}
