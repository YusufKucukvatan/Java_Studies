package day46_SuperKeyWord;


class Mehmet{
    
    public Mehmet() {
        System.out.println("Mehmet");
    }
    
}
class Resul extends Mehmet{
    
    public Resul() {
        super();  // Mehmet
        System.out.println("Resul");
    }
    
}
class Viktoria extends Resul {
    
    public Viktoria() {
        super(); //Mehmet + Resul
        System.out.println("Viktoria");
    }
    
}
public class Constructors {
    
    public static void main(String[] args) {
        
        Viktoria obj = new Viktoria();
        
        
    }
}
