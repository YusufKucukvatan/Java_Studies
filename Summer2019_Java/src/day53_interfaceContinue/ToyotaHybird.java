package day53_interfaceContinue;

public class ToyotaHybird implements Cars, ElectricVehicles, GasVehicles{
	 @Override
	    public void PumpGas() {
	        System.out.println("pumping gas");
	    }
	    @Override
	    public void Charge() {
	        System.out.println("Charging");
	    }
	    @Override
	    public void SelfDrive() {
	        System.out.println("Self Driving mode");
	    }
	    @Override
	    public void start() {
	        System.out.println("push strt button");
	    }
	    @Override
	    public void fly() {
	        System.out.println("Toyota is flying");   
	    }
	    @Override
	    public void SelfParking() {
	        System.out.println("Self parking");
	    }

}
