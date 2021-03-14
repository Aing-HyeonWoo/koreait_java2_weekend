package com.kita.second.level3;

public class Tv implements RemoteControl, Bluetooth{
	private int volume;
	
	@Override
	public void connect() {
		System.out.println("TV에 블루투스를 연결합니다.");
	}
	
	@Override
	public void turnOn() {
		System.out.println("TV 킨다");
	}
	
	
	@Override
	public void turnOff() {
		System.out.println("TV 끈다");
	}
	
	
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		
		System.out.println("현재 TV 볼륨 : "+this.volume);
	}
}
