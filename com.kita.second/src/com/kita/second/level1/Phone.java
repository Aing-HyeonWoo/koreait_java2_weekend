package com.kita.second.level1;

public class Phone {
	// 필드(속성)
	
	String phoneName;
	String owner;
	String color;
	int memory;
	String phoneNumber;
	
	// 생성자
	// 생성자가 정의되지 않았을 때만!! 컴파일러가 기본 생성자 넣어줌
	public Phone(){
		super();
	}
	
	public Phone(String phoneName, String color, int memory) {
		this.phoneName = phoneName;
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
