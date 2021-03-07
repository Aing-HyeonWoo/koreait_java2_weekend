package com.kita.second.level2.sogilli;

public class Sangsun {
	void method() {
		Hyori hr = new Hyori("ㅇㄱㄱ");
		String music = hr.music;
		int follower = hr.follower;
//		boolean star = hr.star;
		
		Hyori hr2 = new Hyori(50000); // default 생성자
//		Hyori hr3 = new Hyori(true);
		
		hr.drinkTea(); // public
		hr.sing(); // defaults
//		hr.yoga(); // private
	}
}
