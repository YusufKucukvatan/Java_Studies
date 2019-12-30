package day41_InitializerBlocks;

public class StaticVsInstanceVsConstructor {
	
	public StaticVsInstanceVsConstructor(){
		System.out.println("Constructor-1");
	}
	public StaticVsInstanceVsConstructor(int a){
		System.out.println("Constructor-2");
		
	}
	
	static{
		System.out.println("Static Block");
		
	}
	{
		System.out.println("Instance Block");
		
	}
	
	public static void main(String[] args) {
		StaticVsInstanceVsConstructor obj1=new StaticVsInstanceVsConstructor();
		StaticVsInstanceVsConstructor obj2=new StaticVsInstanceVsConstructor();
		StaticVsInstanceVsConstructor obj3=new StaticVsInstanceVsConstructor(1);
	}

}
/*
 static: means that we can access the members through the class name
        
        static members belongs to the class, also called class members
what can have static in java:
                1. static variables (class, global)
                2. static methods
                3. static initializer block
                4. static inner class (nested class)
instance variables: created in the class outside any method.
        belongs to the object. each object will have its own copy
local variables: declared within the methods or blocks
                only accessible within the method or block
static variables: created in the class outside any method with static keyword
        when a variable is static, it's shared by class and all objects of the class. 
        we can call it through the class name
static methods: a method that we can call through the class name
        static methods only accepts class members (static)
        none static can only be called through the objects in the static method
instance variable VS static variable:
        instance variables belong to object (fileds)
        static variables belong to the class ( class variables)
        static methods only accepts class members, non static must be called through the object
        static features are shared by class and all other objects
        can only have one copy
        each objects they have their own copy of instance variables
summary:
        1. static is shared by class and all other objects
        2. there can only be one copy for the static variable
        3. each objects has its own copy of instance variable
        4. static members can be called through the class name
        5. static methods only accepts static members
        6. in order to call none static in a static method we MUST call it though the object
 */
