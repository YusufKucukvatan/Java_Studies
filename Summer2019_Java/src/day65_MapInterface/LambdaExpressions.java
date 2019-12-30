package day65_MapInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class LambdaExpressions {
    public static void main(String[] args) {
        
        Predicate<Integer>  remove100  = p -> p == 100; 
        
    List<Integer> list1 = new ArrayList<>(Arrays.asList(100, 100, 100, 100, 100, 100));
    //  list1.removeIf( remove100);
        
        System.out.println(list1);
        
    
 List<Integer> list2 = new ArrayList<>(Arrays.asList(100, 200, 300, 400, 500, 600));
 list2.removeIf( Erhan -> Erhan > 300);
 
 System.out.println(list2);
 
 //foreEach()
 List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
 
 list3.forEach( p -> {  if(p < 5) {System.out.println(p);}  } );
 System.out.println("=================================");
 
 list3.forEach( System.out::println );
 
 
 
 // remove all names that's ended with et
 List<String> names = new ArrayList<String>();
names.addAll(Arrays.asList("Ahmet", "Ibrohim", "Madina", "Ahmet", "Mehmet"));
        
        Predicate<String> remveET = Suna -> Suna.endsWith("et");
        
        names.removeIf(remveET);
        
        System.out.println(names);
        
// task
        List<String> l1 = new ArrayList<String>();
        l1.addAll(Arrays.asList("Muhtar","Marufjon","Akerke", "Asiya","Meryem") );
        
        List<String> l2 = new ArrayList<String>();
        
        l1.forEach( A -> { if(A.startsWith("M")) { l2.add(A);}    } );
        
        System.out.println(l2);
        
        
        l1.removeIf( M -> M.startsWith("M") );
        System.out.println(l1);
        
        
        
        
    }
}
