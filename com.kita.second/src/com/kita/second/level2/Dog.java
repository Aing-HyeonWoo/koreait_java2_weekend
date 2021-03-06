package com.kita.second.level2;

public class Dog extends Animal{
	boolean cutiness;
	
	public Dog(String name) {
		super(name); // Animal name
//		super.age = 5;
		this.cutiness = true;
	}
	
	void barking() {
		System.out.println("개가 짖는다");
	}
	
	// Overriding
	@Override
	void cry() {
		System.out.println("개가 운다");
	}
}
