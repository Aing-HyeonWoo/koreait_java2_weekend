package com.kita.second.level1;

public class PhoneTest {
	public static void main(String[] args) {
	
	Phone myPhone = new Phone();
	myPhone.call("엄마");
//	myPhone.color = "파랑";
//	myPhone.phoneName = "아이폰 12";
//	myPhone.owner = "me";
//	myPhone.memory = 512;
	
	Phone yourPhone = new Phone();
//	yourPhone.phoneName = "갤럭시 s2";
	
	Phone p1 = new Phone("갤럭시 S20", "빨강", 256);
	p1.setOwner("서현우");
	
	String p1Owner = p1.getOwner();
	
	
	p1.setColor("red");
	String p1Color = p1.getColor();
	
	}
}