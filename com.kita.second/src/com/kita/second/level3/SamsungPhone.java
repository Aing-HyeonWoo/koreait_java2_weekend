package com.kita.second.level3;

public class SamsungPhone extends Phone{
	public SamsungPhone(int memory) {
		super("갤럭시", memory, "빅스비");
	}
	
	// 빅스비를 호출
	
	@Override 
	void callAI() {
		System.out.println("헤이 빅스비");
	}
	
	@Override
	void method() {
		System.out.println("");
	}
}
