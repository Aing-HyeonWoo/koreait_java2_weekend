package com.kita.second.level1.practice;

public class Tv {
	// 전원(isPowerOn) 채널(channel) 볼륨(volume)
	// 기본값 전원 false, 채널 1, 볼륨 0
	// 전원 켜기(powerOn), 전원 끄기(powerOff)
	// 채널올리기(channelUp), 채널 내리기(channel Down)
	// 볼륨 높이기(volumeUp), 볼륨 낮추기(volumnDown)
	
	
	
	
	
	// 필드
	
	private Boolean power;
	private int channel;
	private int volume;
	
	
	
	
	// 생성자
	public Tv() {
		power = false;
		channel = 1;
		volume = 0;
	}
	
	
	
	
	// 메소드
	
	
	//-----------------------------채널(channel)
	
	
	void channel() {
		System.out.println("현재 채널은 "+channel+"번 입니당");
	}
	
	
	//-----------------------------볼륨(volume)
	
	
	void volume() {
		System.out.println("현재 볼룜은 "+volume+"입니당");
	}
	
	
	//-----------------------------전원 켜기(powerOn)
	
	void powerOn() {
		if(power == false) {
			power = true;
			System.out.println("TV 켜졌다!");
		} else {
			System.out.println("이미 켜져있음!");
		}
		
	}
	
	//-----------------------------전원 끄기(powerOff)
	
	
	void powerOff() {
		if(power == true) {
			power = false;
			System.out.println("TV 꺼졌다!");
		} else {
			System.out.println("이미 꺼져있음!");
		}
		
	}
	
	
	//-----------------------------채널올리기(channelUp)
	
	
	void channelUp() {
		channel++;
		System.out.println("채널 올라갔다!");
	}
	
	
	//-----------------------------채널 내리기(channel Down)
	
	
	void channelDown() {
		if(channel < 2) {
			System.out.println("1번 밑으론 못 내려감 ㅠㅠ");
		}else {
			channel--;
			System.out.println("채널 내려갔다!");
			}
	}

	
	
	//-----------------------------볼륨 올리기(volumeUp)
		
		
	void volumeUp(){
		volume++;
		System.out.println("볼륨 올라갔다!");
	}
	
	
	//-----------------------------볼륨 낮추기(volumnDown)
	
	
	void volumeDown() {
		if(volume < 0) {
			System.out.println("0 밑으론 못 내려감 ㅠㅠ");
		}else {
			volume--;
		System.out.println("볼륨 내려갔다!");
			}
		
	}
	
	
	
	
}
