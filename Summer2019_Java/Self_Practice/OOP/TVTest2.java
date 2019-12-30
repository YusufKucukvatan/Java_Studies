package OOP;

public class TVTest2 {
	public static void main(String[] args) {
		TV tv1 = new TV();
		tv1.turnOn();
		tv1.setChannel(5);
		tv1.setVolume(25);
		tv1.volumeDown();
		tv1.volumeDown();
		tv1.volumeDown();
		tv1.setChannel(99);
		tv1.channelDown();
		System.out.println("tv1's channel is " + tv1.channel + " and volume level is " + tv1.volume);
		
		TV tv2 = new TV();
		tv2.turnOn();
		tv2.channelUp();
		tv2.channelUp();
		tv2.volumeUp();
		tv2.volumeUp();
		tv2.setVolume(55);
		tv2.setChannel(33);
		System.out.println("tv2's channel is " + tv2.channel + " and volume level is " + tv2.volume);
	
//		TV.channel=50;
//		TV.volume=40;
//
//		System.out.println("tv2's channel is " + tv2.channel + " and volume level is " + tv2.volume);
//		System.out.println("tv1's channel is " + tv1.channel + " and volume level is " + tv1.volume);
	}

}
