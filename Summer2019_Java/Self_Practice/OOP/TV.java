package OOP;

public class TV {
	public TV() {
	}

	int channel = 1;
	int volume = 5;
	boolean on = false;

	public void turnOn() {
		on = true;
	}

	public void turnOff() {
		on = false;
	}

	public void setChannel(int newChannel) {
		if(on&&channel>0&&channel<=100)
		channel = newChannel;
	}

	public void setVolume(int newVolume) {
		if(on&&volume>=1&&volume<=100)
		volume = newVolume;
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
