package day45_Inheritance;


class TestBase{
    
    static String chromeDriver; // default
    
    public static void TakeScreenShot() {
        System.out.println("Took screenshot");
    }
    
    private static void closeBrowser() {
        System.out.println("Browser closed");
    }
    
    
}
public class Inheritance extends TestBase {
            // sub                // super
    // sub class is gonna inherit all the visible features from the super class
        
    /*
        static String chromeDriver;
        
        public static void TakeScreenShot() {
            System.out.println("Took screenshot");
        }
        
        those variable and method we can not see them but they are somewhere in this class
     */
    
    public static void main(String[] args) {
        
        System.out.println(chromeDriver);
        TakeScreenShot();
        
    }
}