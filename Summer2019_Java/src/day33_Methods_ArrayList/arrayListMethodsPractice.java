package day33_Methods_ArrayList;

import java.util.ArrayList;

public class arrayListMethodsPractice {
public static void main(String[] args) {
	/*
	 * 


Methods of arraylist:
        add(object): adds objects to arrayList
        get(index):  gets the data from the arraylist
        size(): returns the length of arraylist as int
        clear(): removes everything from arraylist
        set(index number, object): the given object will replace the object at the given index number
        contains(Object): checks if the given object is contained in the ArrayList or not, returns boolean values
        equal(ArrayList): checks if the two arrayList have same objects or not, returns boolean value
        remove(int): removes the given index
        remove(object) :  removes the first matching object, and retruns boolean value


	 */
	//set(index number, Object):
    ArrayList<String> Javengers =  new ArrayList<>();
        Javengers.add("Jena");  // 0
        Javengers.add("Mary");  // 1
        Javengers.add("Tarah"); // 2
        Javengers.add("Mahriban"); // 3
    
        Javengers.set(1, "Seyfo");  // [Jena, Seyfo, Tarah, Mahriban]
                        // Pilot Nijat Borhan
    
        Javengers.remove( 0 );
        Javengers.add(0, "Pilot Nijat Borhan");
        System.out.println(Javengers);

        
// remove(int):  removes the index
// remove(Object): removes the first matching object and retuns boolean value
        ArrayList<Integer> numbers = new ArrayList<>();
                numbers.add(1); //0
                numbers.add(2); //1
                numbers.add(3); //2
                numbers.add(4); //3
                numbers.add(5); //4
                
                numbers.remove( 3 );  // remeovs index 3 ==>[1, 2, 3, 5]
            System.out.println(numbers);
            
    //  numbers.remove( Integer.parseInt( "3" ) );  // parse method returns primitives  
        boolean result = numbers.remove(  Integer.valueOf("3") ); // value of method returns wrapper class
            
        System.out.println(numbers);
        System.out.println(result);
            
        
            
            
        
	
}
}
