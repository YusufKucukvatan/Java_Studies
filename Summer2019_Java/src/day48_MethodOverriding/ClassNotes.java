package day48_MethodOverriding;

public class ClassNotes {

}

/*


11/04/2019
Topics:     1. Method Overriding
            2. Overloading vs Overriding
            3. final keyword:
                    constant variables
                    immutable class
                    final methods
package: day48_MethodOverRiding
method overloading:  same name, different parameter
                    return type doesn't matter
                    access modifiers don't matter
                    any method can be overloaded 
method overriding: same name, same parameters, implementation functionality is different
                    Return-Type MUST be same
                    cannot happen in the same class
                    method MUST be override in sub class
                    ONLY THE INSTANCE METHODS CAN BE OVERRIDE
                    constructor and static methods cannot be overridden
                    private methods cannot be overridden
                    the method we are going to override MUST be inheritable to the sub class
                    overridden method's access modifiers need to be same or more visible
                                private ==> cannot be overridden
                                default ==> default, protected, public
                                protected ==> protected, public
                                public ==> public
                            public > protected > default > private
@Override: used to verify if the method is overridden or not
why do we need overriding?
        to implement specific functionality to the method
            we create methods with same name and same parameters, then provide different implementation
Example: 
                Webdriver driver = new chromeDriver();
                driver.get("URL"): goes to the URL in chrome browser
                WebDriver driver = new FireFoxDriver();
                driver.get("URL"): goes to URL in firefox browser
    super class: Bank
            actions: InterestRate()  ==>   9%
    sub classes: BankOfAmerica  ==> 7%
                 PNC            ==> 6%
                 CapitalOne     ==> 8%
                 
                 
                 
Override VS overload:
        Overload: access modifier can be same or different
                  return-type can be same or different
                  parameters MUST be different
                  any method can be overload
                  method name MUST be same
                  can happen in the same class
        Override: access modifier needs to be same or more visible.
                  the method MUST be inheritable to the sub class
                  return type MUST be same
                  method name Must be same
                  parameters MUST be same
                  only instance methods can be overridden
                  static methods cannot be overridden
                  final methods cannot be overridden
                  MUST be override in sub class
                  @Override annotation can be applicable
override benefits: 
            readable
            reusability
            flexible
            
            
            
final keyword: constant, cannot be changed or modified
        final key word can only be applied to: 
                    variables: we cannot re-assign it
                            instance variables and static variables MUST be assigned immediately
                            local variable needs to be assigned before use and only once
                            if the private data is final, we can only generate getters
                            cannot have setters
                    methods: the implementation of the method cannot be changed
                            final methods cannot be override
                            final methods can be overload
                            main method can be final
                    classes: final class cannot be super class, but can be sub class
                                final classes are immutable, they cannot be extended


*/