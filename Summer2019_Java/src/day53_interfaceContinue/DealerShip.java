package day53_interfaceContinue;

public class DealerShip {
public static void main(String[] args) {
        
        Tesla_Model3  obj1 = new Tesla_Model3();
                
            obj1.start();
            obj1.fly();
            
        Jeep_Wragler obj2 = new Jeep_Wragler();
                    obj2.start();
                    obj2.PumpGas();
                    
                    
        ToyotaHybird obj3 = new ToyotaHybird();
                    obj3.PumpGas();
                    obj3.Charge();
        
        
    }

}
