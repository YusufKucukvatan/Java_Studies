package day49_Abstract;

public abstract class Abstraction {
	
	public abstract void startCar();
	
	public void car() {
		System.out.println("car");
	}

}
class Test extends Abstraction{

	@Override
	public void startCar() {
		// TODO Auto-generated method stub
		
	}
	
}
