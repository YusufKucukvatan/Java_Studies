package day63_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;


public class CollectionsReview {
    
    public static void main(String[] args) {
        
       Set<Integer> set1 = new    HashSet<Integer>();
            set1.add(100);
            set1.add(100);
            
            System.out.println(set1);
            
            
       ArrayList<Integer> arraylist = new ArrayList<Integer>();
                    arraylist.add(1);
            
        Vector<Integer> vector = new Vector<Integer>();
            
        
        Stack<Integer> stack = new Stack<Integer>();
        stack.add(100);
        stack.add(200);
        stack.add(300);
                    
        System.out.println(stack.pop()); // 300
        System.out.println(stack);  //[100, 200]
        
                System.out.println( stack.pop() ); //200
                System.out.println(stack); //100
        
        // ArrayList<WebElement> list = new ArrayList<>();
                    // list.add(  driver.findElement(By.xpath())  )
            
                
                
                //  List<WebElement> list = driver.findElements(locator)
                
        int[][] arr2D= { {1,2,3}}   ;
        
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        
        ArrayList< ArrayList<Integer> >  listOfList =  new ArrayList<>(); // it's not multidimensional
                // listOfList.add(1);
            listOfList.add(l1);
                
        
            
            
        Set<Integer> hashset = new HashSet<Integer>();
                hashset.add(100);
                hashset.add(90);
                hashset.add(80);
                hashset.add(70);
                hashset.add(70);
                
                System.out.println(hashset + "z");
        
    Set<Integer> linkedhashset = new LinkedHashSet<Integer>();
                linkedhashset.add(100);
                linkedhashset.add(90);
                linkedhashset.add(80);
                linkedhashset.add(70);
                
                System.out.println(linkedhashset);
            
        //SortedSet<Integer> sortedset = new HashSet();   
            
        List<Integer> lists = new ArrayList<Integer>( Arrays.asList(10, 9, 8, 7, 6));
        //  Collections.sort(lists) ;
        System.out.println(lists);
        
        
        SortedSet<Integer> sortedset = new TreeSet<Integer>( lists );
                System.out.println(sortedset);
                
            
            
            
            
            
    }
}
