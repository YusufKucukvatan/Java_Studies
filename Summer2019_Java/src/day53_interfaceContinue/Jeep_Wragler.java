package day53_interfaceContinue;

public class Jeep_Wragler implements Cars, GasVehicles{
	@Override
    public void PumpGas() {
        System.out.println("Pumping Gas");
    }
    @Override
    public void start() {
        System.out.println("Call Mechanic");
        System.out.println("Oild change");
        System.out.println("Jump Start");
    }
    @Override
    public void SelfParking() {
        System.out.println("Self parking mode");
        
    }

}
