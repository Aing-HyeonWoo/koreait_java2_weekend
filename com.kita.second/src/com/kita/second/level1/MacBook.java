package com.kita.second.level1;

public class MacBook {
	// 메모리, 가격, 색상
	
	// 메모리만
	// 메모리, 가격
	// 메모리, 색상
	// 메모리, 가격, 색상
	
	// 웹서핑을 한다, 코딩을 한다
	
	int memory;
	int price;
	String color;
	
	public MacBook(int memory) {
		this.memory = memory;
	}
	
	public MacBook(int memory, int price) {
		this.memory = memory;
		this.price = price;
	}
	
	public MacBook(int memory, String color) {
		this.memory = memory;
		this.color = color;
	}
	
	public MacBook(int memory, int price, String color) {
		this.memory = memory;
		this.price = price;
		this.color = color;
	}
	
	void webSurf() {
		System.out.println("웹서핑 한다");
	}
	
	void coding() {
		System.out.println("코딩 한다");
	}
	void email(String person) {
		System.out.printf("%s에게 이메일을 보낸다\n", person);
	}	
}
