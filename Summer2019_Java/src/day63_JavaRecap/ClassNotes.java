package day63_JavaRecap;

public class ClassNotes {

}

/*

Java Reveiw: List Interface
             Set Interface
Package Name: day63_JavaRecap
            Quiz
List(I): does have index numbers, accept duplicates, size is automatically adjusted
            implemented by: ArrayList(C), LinkedList(C), Vector(C)
        ArrayList(C): array based, internally uses array
        LinkedList(C): each objects are doubly linked
                add() & remove() are faster than ArrayList
                get()is slower than arraylist
        Vector(C): is synchronized --> Thread safe
                slower than LinkedList & ArrayList
                Has a child class: Stack
                Stack: LIFO
                    pop(): LIFO ==> Last In First out
                            removes the last object from the Stack
Set(I): does not have index numbers, does not accept duplicates, size is automatically adjusted
        implemented by: HashSet(C), LinkedHashSet(C);
        HashSet: does not keep the order of the objects as it's
        LinkedHashSet: does keep the order of the objects as it's
                    doubly linked
        extended by SortedSet(I)
        SortedSet(I): sorts the objects in ascending order  , no duplicates
                implemented by TreeSet
synchronized keyword: used for achiving thread safety in multi-thread
        synchronized  ==> Thread safe ==> slower
multi-thread: multiple threads trying to get access to same resources
Next Week' topics: Queue Interface
                   Iterables
                   
                   Map Interface


*/