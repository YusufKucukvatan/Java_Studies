package TutorialWeek4;

import java.util.Arrays;

public class WrapperClass {
	/*
        primitives                     wrapper-class : classes that are dedicated to primitives
          byte                            Byte            null
          short      Auto-boxing          Short           null
          int        ==========>          Integer         null
          long                            Long            null
          float                           Float           null
          double     Auto-Unboxing        Double          null
          boolean    <===========         Boolean         null
          char                            Character       null  
          
      
          default values of primitives:  
                  byte, short, int, long ==>0;
                  double, float ==> 0.0
                  boolean ==> false
                  char ==> space
                  
                  
   Default value of wrapper class:  null (All object are null)
          
   If we do not give any objects to class (reference) null will be given by default
          
   String's default value is also null
	 */
	public static void main(String[] args) {
		
		int num1=3;
		Integer num2=new Integer(5);
		Integer num18=5;
		int num3=num2;
		Integer num4=num3;
		int num5=Integer.MAX_VALUE;
		Integer d5=new Double(12.4).intValue();
//		
		double d1=5.4;
		Double d2=5.4;
		String str="";
		int num=0;
		
		Boolean[] arr1 =new Boolean[3];  // default value?
	    boolean[] arr2 =new boolean[3];  // default value?
	    System.out.println(Arrays.toString(arr1));
	    System.out.println(Arrays.toString(arr2));
		
		System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Character.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Character.MIN_VALUE);
	}

}
