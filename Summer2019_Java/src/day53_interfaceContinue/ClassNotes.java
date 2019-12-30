package day53_interfaceContinue;

public class ClassNotes {

}
/*
11/18/2019
Topic: Interface Continue
            Abstract class VS Interface
            extends keyword vs implements keyword
package: day53_InterfaceContinue
Warmup:
    create an interface called Cars
            Actions: start()
    create an interface called ElectricVehicles
            Actions: Charge()
                     SelfDrive()
    create an interface called GasVehicles
            Actions: PumpGas()
    create classes:
            1. Tesla_Model3: 
                    implement Cars and  ElectricVehicles Interfaces
            2. Jeep_wrangler: 
                    implement Cars and GasVehicles Interfaces
            3. ToyotaHybird:
                    implement Cars, GasVehicles, and  ElectricVehicles Interfaces
Interface: used for achieving abstraction
            we can store abstract methods
        Interface is meant to be implemented not extended, cannot be final
        we can implement multiple interfaces to the class by implements keyword
            
        we cannot create object from both interface and abstract class, because object needs to be concrete
        abstract method cannot be overridden in Interface, because there is no instance methods in an Interface
    Interface Can Have:
            methods: abstract method, static method, default method
                    public abstract void methods();
                    public void method();
                    public access modifiers are given by default to all methods
            variables: public static final ==> automatically
    Interface Can Not Have:
            Methods: Constructor, instance methods
            variables: instance variable
            blocks: static initializer block, instance initializer block
Restrictions of abstract method:
                    cannot have body
                    cannot have private access modifiers 
                    cannot have static and final specifiers
                    MUST be created in abstract class or an Interface
Abstract class VS Interface:
            both can have abstract methods, used for achieving abstraction
            cannot create object from them
            both of them cannot be final
            Abstract class: meant to be extended to the regular class, extends keyword
                    methods: abstract and all non-abstract methods
                    variables: any variables
                    blocks: both instance and static blocks
                sub class can only extend one abstract class
            Interface: meant to be implemented to the regular class with implements keyword
                    methods: we can only have abstract, static, and default methods
                    variables: public final static are given by default
                    blocks: cannot have any blocks
                sub class can implement multiple interfaces
Extends keyword vs Implements keyword:
    
        extends keyword: a class can be extended by multiple classes
                         a class can extend only one class
                         class extends class
                         interface extends interface
        implements: only used for interface to be implemented to the class
                    can implement as many interfaces as we want
                    class implements interface 
        we can use extends and implement keyword at the same time
            a class extends class and implements interface(s)

*/
