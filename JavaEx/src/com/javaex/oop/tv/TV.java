package com.javaex.oop.tv;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	
	public TV() {
		this(7,20,false);
	}
	
	public TV(int channel,int volume,boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isPower() {
		return power;
	}
	
	void power(boolean on) {
		power = on;
	}
	
	public void channel (int channel) {
		if (channel <= 255 && channel >= 1) {
			this.channel = channel;
		} else {
			System.out.println("채널 범위 초과 (1~255)");
		}
	}
	
	public void channel (boolean up) {
		if (up) {
			channel(channel + 1);
		} else {
			channel(channel - 1);
		}
		
		
	}
}
