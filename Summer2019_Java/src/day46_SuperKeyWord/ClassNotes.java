package day46_SuperKeyWord;

/*
10/31/2019
Topic: super Keyword: super. & super()
       Constructor in Inheritance
       super vs this
package: day46_SuperKeyword
Inheritance:  super and sub classes
    
        class   A    extends    B
                sub            super
        subclass:   sub class inherits visible features from the super class
                    sub class gets rich
                    public and protected access modifiers can always be inheritable in the subclass
                    default access modifier can only be inherited to the classes that are in the same package with
                    private can NEVER be inherited
        superclass: super class does not inherit anything from the sub class
this. : used for calling instances variables from class itself(sub or super), can only be used in object instances
super. : used for calling instances (instance variable and methods) from the super class and used in sub class
            super keyword can only be used in the subclass
this. vs  super. :
        this. : used for calling the instances from the class itself
                to use this, we don't need inheritance 
        super. : used for calling the instances from the super class
                to use super, we MUST have super class and sub class
Constructor: at least one of the constructors from the super class has to be called in the sub class
			 if super class has any constructor other than default.
        
        super class' default constructor is called in the sub class by default
super(): used for calling the constructors from the super class
        can only be used in the sub class.
this(): used for calling the constructors from the class itself
All the rules of of the constructor:
      Constructor: special method. belongs to the object.  
             1. Every class MUST have constructor. 
                (if there isn't any, compiler will constructor by default without any args)
             
             2. Constructor cannot have return-types or specifiers
                        return-types: primitives, wrapper class, objects,...
                        specifiers: final, static, abstract
                        
             3. Constructor's name MUST be same with the ClassName
             
             4. constructor's execution depends on the creation of the object
             
             5. constructor can only be called from other constructor. 
                            ( methods or blocks cannot call constructor)
             
             6. constructor cannot be called by constructor-name, MUST be called with this or super keyword
                            this(): calls the class' itself constructor
                            super(): calls the super class' constructor
                            
             7. constructor cannot call or contain itself
             
             8. constructor cannot call more than one constructor 
             
             9. constructor call MUST be the first line
             
             10. class' object MUST be created with existing and visible constructor
             
             11. super class' default constructor (no-args) is called in sub class' constructor(any constructor) by default 
             
             12. at least one of the super class' constructors MUST be called in sub class if any constructor exist in super class
             
             13. Constructors can be overloaded

*/
public class ClassNotes {

}
