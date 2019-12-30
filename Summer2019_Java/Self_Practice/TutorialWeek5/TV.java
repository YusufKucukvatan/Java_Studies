package TutorialWeek5;

public class TV {
	static int channel = 1;
	static int volume = 1;
	boolean on = false;
	
	public TV() {
	}


	public void turnOn() {
		on = true;
	}

	public void turnOff() {
		on = false;
	}

	public void setChannel(int channel) {
		if(on&&channel>0&&channel<=100)
		this.channel = channel;
	}

	public void setVolume(int volume) {
		if(on&&volume>=1&&volume<=100)
		this.volume = volume;
	}

	public void channelUp() {
		if(channel>=1&&channel<=99)
		channel++;
	}

	public void channelDown() {
		if(on&&channel>=2&&channel<=100)
		channel--;
	}

	public void volumeUp() {
		if(on&&volume>=0&&volume<=99)
		volume++;
	}

	public void volumeDown() {
		if(on&&volume>=0&&volume<=100)
		volume--;
	}
}
