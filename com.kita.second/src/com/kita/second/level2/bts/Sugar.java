package com.kita.second.level2.bts;


import com.kita.second.level2.sogilli.Hyori;
import com.kita.second.level2.sogilli.Sangsun;

public class Sugar {
	
	void method() {
		Hyori hr = new Hyori("ㅇㄱㄱ");
		String music = hr.music;
//		int follower = hr.follower;
//		boolean star = hr.star;
		
//		Hyori hr2 = new Hyori(2147483647); // 패키지 다름
//		Hyori hr3 = new Hyori(true); // private 써서 못함
		
		hr.sing(); // public
//		hr.drinkTea(); // default
//		hr.yoga(); // private
	}
}

//