package TutorialWeek5;

public class CarClass {
	//static String country;
	String make;
	String model;
	int year;
	int VIN;
	String color;
	int milage;
	int price;

	boolean start;
	int speed;
	int shift;
	boolean radio;
	int channel = 1;
	int volume = 10;

	public CarClass() {
	}

	public void carID() {
		System.out.println("\nYour car is a " + year + " " + make + " " + model);
		System.out.println("It is " + color + " color and milage is " + milage);
		System.out.println("VIN is " + VIN);
		System.out.println("Price of the car is $" + price + "\n");
	}

	public boolean startCar() {
		System.out.println(make + " " + model + " is driving...\n");
		System.out.println(make + "=> Engine is turned ON");
		return start = true;
	}

	public boolean turnOffCar() {
		System.out.println(make + "=> Engine is turned OFF");
		return start = false;
	}

	public int shiftUp() {
		if (start == true && shift < 6) {
			shift++;
			System.out.println(make + "=> You shifted to the " + shift + " gear");
			return shift;
		} else
			return shift;
	}

	public int shiftDown() {
		if (start == true && shift > 0) {
			shift--;
			System.out.println(make + "=> You shifted to the " + shift + " gear");
			return shift;

		} else
			return shift;
	}

	public int shiftReverse() {
		if (start == true) {
			shift = -1;
			System.out.println(make + "=> You shifted to the reverse gear");
			return shift;
		} else
			return shift = 0;
	}

	public int accelerate() {
		if (start == true) {
			speed += 5;
			System.out.println(make + "=> Your speed is " + speed);
			return speed;
		} else
			return 0;
	}

	public int decelerate() {
		if (start == true && speed >= 5) {
			speed -= 5;
			System.out.println(make + "=> Your speed is " + speed);
			return speed;
		} else
			return speed;
	}

	public int setSpeed(int s) {
		if (start == true) {
			speed = s;
			System.out.println(make + "=> Your speed is " + speed);
			return speed;
		} else
			return 0;
	}

	public int stop() {
		if (start == true && speed > 0) {
			speed = 0;
			System.out.println(make + "=> You stopped");
			return speed;
		} else
			return 0;
	}

	public boolean radioOn() {
		radio = true;
		System.out.println(make + "=> Radio is now ON");
		return radio;
	}

	public boolean radioOff() {
		radio = false;
		System.out.println(make + "=> Radio is now OFF");
		return radio;
	}

	public int setChannel(int c) {
		channel = c;
		System.out.println(make + "=> Channel " + channel + " selected");
		return channel;
	}

	public int increaseChannel() {
		if (channel < 10) {
			channel++;
			System.out.println(make + "=> Channel " + channel + " selected");
			return channel;
		} else
			return channel;
	}

	public int decreaseChannel() {
		if (channel > 1) {
			channel--;
			System.out.println(make + "=> Channel-" + channel + " selected");
			return channel;
		} else
			return channel;
	}

	public int setVolume(int v) {
		volume = v;
		System.out.println(make + "=> Volume is " + volume);
		return volume;
	}

	public int increaseVolume() {
		if (volume < 30) {
			volume++;
			System.out.println(make + "=> Volume is " + volume);
			return volume;
		} else
			return volume;
	}

	public int decreaseVolume() {
		if (volume > 0) {
			volume--;
			System.out.println(make + "=> Volume is " + volume);
			return volume;
		}

		else
			return volume;
	}

	public void speedCamera(int speed) {
		if (start == true && speed > 55) {
			System.err.println(make + "=> WARNING: You passed the speed limitation and got a speed ticket...");
		}
	}

}
