package day65_MapInterface;

public class ClassNotes {

}

/*
 
 12/20/2019
Topic: Map Interface
WarmUp task:
    write a program that can remove all even numbers from a List Interface
            Well Said Denis
Package Name: day65_MapInterface
Data Structures:
        -Arrays
        -Collections framework
        -Maps
Map Interface: accepts key and value, both key and value does not support primitives. Key cannot be duplicated, Value can be duplicated
    
    MAP DOES NOT ACCEPT DUPLICATED KEYS, BUT ACCEPTS DUPLICATED VALUES
        Set<Values>
        Map<Key, Value>
        implemented by HashMap(C), LinkedHashMap(C), HashTable(C)
        extended by SortedMap(I)
        SortedMap(I) is implemented by TreeMap(C)
        Map<Key, Value>  map1 = new HashMap<>();
        Map<Key, Value>  map2 = new LinkedHashMap<>();
        Map<Key, Value>  map3 = new HashTable<>();
        Map<Key, Value>  map1 = new TreeMap<>();
        SortedMap<Key, Value> = new TreeMap<>();
Map Interface:
    put(Key, value): inserts key and value objects to the map
    get(Key): retrieves the value of the given key 
    remove(Key): removes the given key object and its value
    size(): returns the size of the map
    containsKey(Key): verifies if the given Key is exist in the map. returns boolean
    containsValue(Value): verifies if the given value is exist in the map. returns boolean
    keySet(): returns all the keys as Set Interface
    clear(): removes everything, size will become 0
HashMap(C): does not maintain the insertion order as its
LinkedHashMap(C): maintains the insertion order as its
        doubly linked:  put() & remove() are faster than hashmap
                    get() is slower than hashmap
HashTable(C): Key and Value cannot be null. no null allowed
            Is synchronized ==> Thread-Safe
            very slow
TreeMap(C) : implementing SortedMap
            sorts the keys in ascending order

 Exp:
 
 HashMap<Integer, String> hm=new HashMap<>();
 hm.put(1,"Java");
 hm.put(2,"Ruby");
 hm.put(1,"Phython");
 
 for(Entry m : hm.entrySet()){
 System.out.println(m.getKey() + " " + m.getValue());   ==> works like for each loop
 };
 
*/