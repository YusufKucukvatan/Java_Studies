package day34_Constructors;

public class MuhtarOccurenceWarmUp {
    /*
    Warm up:
   1. write  a return method that can remove duplicates from a string
       Ex: RemoveDup("abcabc") ==> returns "abc";
   2. write a return method that accepts two parameter Strings a and b, 
           and returns the total numbers of apperence of string b in String a
           
               Ex: count("abcaba", "a")  ==> returns 3 ;
   3. use the above two methods to write a new method that can find the frequency of characters
       Ex: frequency("aabcabcabc") ==>a4b3c3
   4. write a return method that can find the maximum number from an Integer arrayList   
       (DO NOT use sort methods of Collections class)
   5. write a return method that can find the minimum number from an Integer arrayList 
       (DO NOT use sort methods of Collections class)
    */
   
   public static void main(String[] args) {
       //task01
       String a = RemoveDup("abcabcdefdef");   // "abc"
       
       System.out.println(a);
       System.out.println( RemoveDup("abcabcdefdef") );
       
       
       // task02
       int count  = AppearanceCount("abaacdabcdaaa", "c");
       System.out.println(count);
       
       System.out.println( AppearanceCount("abaacdabcdaaa", "a"));
       
       
       System.out.println(  frequencyTest("abcabcaabbcccc") );
       
       System.out.println(frequencyTest("dddddddddddddddddeeeeeeeeeeee"));
       
   }
   
   
   // task01
   public static String RemoveDup(String str) {
                                   //"abcabc"
       String result = "";
       for(int i=0; i < str.length(); i++) {
           if( ! result.contains(str.substring(i,i+1)) ) {
               result += str.substring(i, i+1);
           }
       }
       
       return result;
   }
   
   
   // task02
   public static int AppearanceCount(String str1, String str2) {
                           // abab        a   ==>1
                           // bab          a  ==. 2
           
       int count = 0;  //  to count how many time b is appeared in a
       
       while(str1.contains(str2)) {
           count++;
           str1 = str1.replaceFirst(str2, "");
       }
           
       return count;   
       
   }
   
   
   // task03
   public static String frequencyTest(String str) {
                               // "abcabcabc"  ==> "a3b3c3"
                               
       String nonDup = RemoveDup(str); // "abc" 
       
       String result = "";  // to store the expected result
           
       for(int i = 0; i < nonDup.length() ;  i++ ){
           int frequency = AppearanceCount(str,  nonDup.substring(i, i+1));
               result += nonDup.substring(i, i+1) + frequency;
       }
           
       return result;
   }
   
   
   
   // task04:

}
