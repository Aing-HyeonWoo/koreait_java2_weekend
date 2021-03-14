package com.kita.second.level2.sogilli;

public class Hyori {
//	1. public : 제한 X
//	2. protected : 
//	3. default : 본인 패키지 내부
//	4. private : 자신클래스 내부
	
	// field
	public String music;
	int follower;
//	private boolean star = true;
	
	// 생성자
	public Hyori(String music) {
		this.music = music;
		follower = 100;
//		star = true;
	}
	
	Hyori(int follower) {
		sing();
		drinkTea();
		yoga();
	} 
	
//	private Hyori(boolean star) {} // 딴데서 접근 못함
	
	
	// 메소드
	
	public void sing() {}
	void drinkTea() {}
	private void yoga() {}
}
