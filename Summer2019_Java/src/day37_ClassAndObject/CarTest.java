package day37_ClassAndObject;

public class CarTest {
	public static void main(String[] args) {
		CarClass car1=new CarClass();
		car1.make="Nissan";
		car1.model="Sentra";
		car1.year=2016;
		car1.VIN=123456789;
		car1.color="White";
		car1.milage=59_543;
		car1.price=9_000;
		
		car1.carID();
		car1.startCar();
		car1.shiftReverse();
		car1.accelerate();
		car1.stop();
		car1.shiftUp();
		car1.shiftUp();
		car1.accelerate();
		car1.accelerate();
		car1.shiftUp();
		car1.accelerate();
		car1.accelerate();
		car1.shiftUp();
		car1.accelerate();
		car1.accelerate();
		car1.shiftUp();
		car1.setSpeed(60);
		car1.radioOn();
		car1.increaseChannel();
		car1.increaseChannel();
		car1.setChannel(21);
		car1.increaseVolume();
		car1.increaseVolume();
		car1.increaseVolume();
		car1.increaseVolume();
		car1.increaseVolume();
		car1.setVolume(20);
		car1.speedCamera(car1.speed);
		car1.decelerate();
		car1.decelerate();
		car1.decelerate();
		car1.decelerate();
		car1.decelerate();
		car1.stop();
		car1.radioOff();
		car1.turnOffCar();
		
		CarClass car2=new CarClass();
		car2.make="BMW";
		car2.model="3.20";
		car2.year=2014;
		car2.VIN=987654321;
		car2.color="Navy Blue";
		car2.milage=121_000;
		car2.price=16_500;
		
		car2.carID();
		car2.startCar();
		car2.shiftUp();
		car2.accelerate();
		car2.shiftUp();
		car2.accelerate();
		car2.shiftUp();
		car2.accelerate();
		car2.shiftUp();
		car2.setSpeed(50);
		car2.radioOn();
		car2.increaseChannel();
		car2.setChannel(8);
		car2.setVolume(20);
		car2.speedCamera(car2.speed);
		car2.decelerate();
		car2.decelerate();
		car2.stop();
		car2.radioOff();
		car2.turnOffCar();
	}

}
