package com.kita.second.level1;

public class Phone {
	// 필드(속성)
//	private String phoneName;
	private String owner;
	private String color;
//	private int memory;
//	private String phoneNumber;
	
	// setter, getter 메소드
	void setOwner(String owner) {
		this.owner = owner;
	}
	
	String getOwner() {
		return owner;
	}
	
	void setColor(String color) {
		this.color = color;
	}
	
	String getColor() {
		return color;
	}
	
	// Phone의 모든 필드에 초기값을 넣어주는 생성자 만들기
	
	public Phone(String phoneName, String owner, String color, int memory, String phoneNumber) {
//		this.phoneName = phoneName;
		this.owner = owner;
		this.color = color;
//		this.memory = memory;
//		this.phoneNumber = phoneNumber;
	}
	
	// 생성자
	// 생성자가 정의되지 않았을 때만!! 컴파일러가 기본 생성자 넣어줌
	public Phone(){ // 기본 생성자 안넣었을때
		super();
	}
	
	public Phone(String phoneName, String color, int memory) {
//		this.phoneName = phoneName;
		this.color = color;
//		this.memory = memory;
	}
	
	// 메소드(동작)
	// call(타입 person)
	// person에게 전화를 건다.
	
	void call(String person) {
		System.out.println(person+"에게 전화 검");
	}
	
	// message(String person){}
	// person에게 owner가 문자를 보낸다
	
	void message(String person) {
		System.out.printf("%s에게 %s가 문자를 보냄", person, owner);
	}
//	리턴타입 / void 메소드명(매개변수) {}
}
