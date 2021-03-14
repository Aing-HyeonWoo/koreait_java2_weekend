package com.kita.second.level2;

public abstract class Animal {
	String name;
	String age;
//	private String type;
	
	// 메소드
	
	public Animal(String name) {
		this.name = name;
	}
	
	void breath() {
		System.out.println("숨을 쉰다");
	}

	abstract void cry();
	
//	private void method() {}
}

