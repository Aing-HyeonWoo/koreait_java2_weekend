package com.kita.second.level2;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
	}
	
	
	@Override
	void cry() {
		System.out.println("개가 운다\n");
	}
	
}
