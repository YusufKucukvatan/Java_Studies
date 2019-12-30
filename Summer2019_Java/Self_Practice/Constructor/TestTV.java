package Constructor;

import java.util.Random;

public class TestTV {
	public static void main(String[] args) {
		TV tv1 = new TV();
		tv1.turnOn();
		tv1.setChannel(5);
		tv1.setVolume(25);
		tv1.volumeUp();
		tv1.volumeDown();
		tv1.volumeDown();
		tv1.volumeDown();

		TV tv2 = new TV();
		tv2.turnOn();
		tv2.channelUp();
		tv2.channelUp();
		tv2.volumeUp();
		tv2.volumeUp();
		tv2.setVolume(55);
		tv2.channel = 33;
		tv2.volume = 18;
		tv2.on = false;
		
		System.out.println("tv1's channel is " + tv1.channel + " and volume level is " + tv1.volume);
		System.out.println("tv2's channel is " + tv2.channel + " and volume level is " + tv2.volume);

		Random random1 = new Random();
		int[] numbers=new int[10];
		for (int i = 0; i < 10; i++) {
			numbers[i]=50+random1.nextInt(50);
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		java.util.Date whatIsDate = new java.util.Date();
		System.out.println(whatIsDate.toString());

	}
}
