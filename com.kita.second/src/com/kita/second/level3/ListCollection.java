package com.kita.second.level3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCollection {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<Dog> list2 = new LinkedList<Dog>();
		
		list1.add("안녕"); // 삽입
//		String result1 = list1.get(0); // 뽑아오기
//		list1.set(0, "ㅎㅇ"); // 수정
//		boolean result2 = list1.remove("ㅎㅇ"); // 삭제
//		int len = list1.size(); // 리스트의 길이
		
		// list2 안에 각각 "누렁이", "흰둥이", "얼룩이" 이름 가진
		// 멍멍이 세 마리 집어넣기
		// list2 안에 든 멍멍이 이름들 출력
		// "얼룩이" 자리에 "까망이"라는 이름 가진 새 멍멍이 넣기
		// "누렁이" 이름 가진 멍멍이 list2 에서 삭제
		Dog d1 = new Dog("누렁이");
		Dog d2 = new Dog("흰둥이");
		Dog d3 = new Dog("얼룩이");
		
		list2.add(d1);
		list2.add(d2);
		list2.add(d3);
		

		for(int i = 0; i < list2.size(); i++) {
			System.out.println("댕댕이 : "+list2.get(i).getName());
		}
		
		Dog d4 = new Dog("까망이");
		list2.set(2, d4);
		list2.remove(d1);
		
		for(Dog d : list2) {
			System.out.println(d.getName());
		}
		
		
	}
}
