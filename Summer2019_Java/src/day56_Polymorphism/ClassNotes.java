package day56_Polymorphism;

public class ClassNotes {

}
/*
Good Morning 
11/25/2019
Topic: Polymorphisim Reveiw
       Type Castings:
                UpCasting
       OOP Summary
Agenda:
    Morning: Java
    Afternoon : Selenium
package name: day56_Polymorhisim
Polymorphisim:  occures when a super class/interface is reference and object from is created from child class
            A   extends   B
            sub          super
            B        obj       =   new     A()
        ref-type   ref-name           object
        reference type decides what can be accessible
        child class cannot be the reference to parent class' object.
        if we make the abstract class as reference, object MUST be created from sub class(non abstract)
        if we make the interface as reference, object MUST be created from the classes(Non Abstract) that's impleenting the interface 
        A obj11 = new B();  
            obj11.methodA();   // from B clas
        //  if a method is exist in both reference type and object, the overridden one gets executed
            
        obj11.methodC();
            // if the method is not being overridden, then the reference type method gets executed
            
        WebDriver driver = new ChromeDriver();
                driver.get("URL")  // opens the chrome browser,  overridden
    // ChromeDriver driver = new FireFoxDriver();
            // there is no IS A relation between Chrome Driver and FireFoxDriver
interface: WebDriver, WebElement, JavaScriptExecuter, TakeScreenShot...
IS A: inherited/implemented relation between class
        
        Dog extends Animal
        PitBull extends Dog
        Dog IS An Animal
        Pitbull IS A Dog
        PitBull IS An Animal
Has A:
        class Car{
            Engine obj = new Engine();
        }
        Car HAS An Engine
        class Zoo {
            Lion li = new Lion();
            Tiger ti = new Tiger();
            ....
        }
        Zoo Has A lion
        Zoo Has A tiger
method Overriding: same method name , same parameter
            only the instance method can be overridden
            HAS to be overridden in the sub class
            Cannot be private, static, final
            access modifier needs to be same or more visible
            return-type HAS to be same
            @Override has to be applicable
there are TWO types of castings between class:
        RemoteDriver implements WebDriver, JaveScriptExecuter, TakeScreenSH
    multiple reference name, refer to the same object ( same memory)
        ChromeDriver extends RemoteDriver
            1. UpCasting: converting sub type to super type
                    Always allowed to use
                WebDriver driver = new ChromeDriver();
                // JavaScriptExecuter js = new ChromeDriver(); // not the same browser we are automating the test case with. new window
                JavaScriptExecuter js = (JavaScriptExecuter)driver;
                    js.ExecuteScript("window.open()")''
                TakeScreenShot ts = new ChromeDriver();
                TakeScreenShot ts = (TakeScreenShot) driver;
                    ts.TakeScreenShotAs("");
            2. Downcasting: converting super type to sub type
                            not allowed. throw ClassCastException
OOP Summary:
    OOP: Object Oriented Programming
        1. Encapsulation: data hiding by giving private access modifier to the variable, and provide public getter/setter
            benifits: control the data condition. ( by using setter)
                      Data Security
            if the private data is final, we can ONLY generate getter
        2. Inheritance: sub & super relationship. methods & variables of one class can be inherited to another
                        super --> sub
            benefits: reusable
                       easy to maintain
                       organized
        3. Abstraction: hiding the implementation. concentrating on the importance/essentials without worrying about the details
                2 ways to achieve abstraction:
                            1. Abstract class
                            2. Interface
                benefits: reusability
                          able to focus on what to do instead of how to do
        4. Polymorphism: object behavior in many forms.
                        super class/interface can be reference type to any child class' objects
                benifits: flexible
                    - one single variable with reference type of parent class is able to any objects of child class
Assessment Quiz 14 due by 1:30 pm
Tomorrow: Exception Intro
                what's exception
                how to handle the exceptions 

*/