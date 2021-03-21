package com.kita.second.level3;

public abstract class Animal {
	public String name;
	int age;
	
	public Animal(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	void cry() {
		System.out.println();
	}
}
