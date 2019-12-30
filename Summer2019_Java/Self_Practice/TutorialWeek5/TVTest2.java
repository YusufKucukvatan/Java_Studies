package TutorialWeek5;

public class TVTest2 {
	public static void main(String[] args) {
		TV tv1 = new TV();
		tv1.turnOn();
		tv1.setChannel(5);
		tv1.volumeDown();
		tv1.volumeDown();
		tv1.volumeDown();
		tv1.channelDown();
		tv1.setVolume(11);
		tv1.setChannel(11);
		System.out.println("tv1's channel is " + tv1.channel + " and volume level is " + tv1.volume);
		
		TV tv2 = new TV();
		tv2.turnOn();
		tv2.channelUp();
		tv2.channelUp();
		tv2.volumeUp();
		tv2.volumeUp();
		tv2.setVolume(22);
		tv2.setChannel(22);
		System.out.println("tv1's channel is " + tv1.channel + " and volume level is " + tv1.volume);
		System.out.println("tv2's channel is " + tv2.channel + " and volume level is " + tv2.volume);

		TV tv3 = new TV();
		tv3.turnOn();
		tv3.channelUp();
		tv3.channelUp();
		tv3.volumeUp();
		tv3.volumeUp(); 
		tv3.setVolume(33);
		tv3.setChannel(33);
		System.out.println("tv2's channel is " + tv3.channel + " and volume level is " + tv3.volume);
	
//		Replace channel and volume into static
//
		System.out.println("tv1's channel is " + tv1.channel + " and volume level is " + tv1.volume);
		System.out.println("tv2's channel is " + tv2.channel + " and volume level is " + tv2.volume);
		System.out.println("tv2's channel is " + tv3.channel + " and volume level is " + tv3.volume);
	}

}
