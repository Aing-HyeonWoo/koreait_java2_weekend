package com.kita.second.blackjack;

import java.util.LinkedList;
import java.util.List;

public class Gamer {
	// Gamer의 덱
	protected List<Card> arr;
	
	
	// arr 안에 LinkedList 인스턴스 들어가는
	// Gamer 생성자 작성
	
	
	public Gamer() {
		arr = new LinkedList();
	}
	
	// Gamer의 덱 안에 카드 한장씩 추가하는 메소드
	void recieveCard(Card cd) {
		arr.add(cd);
	}
	
	
	// Gamer의 덱에 있는 카드 전체 출력하는 메소드
	void openCards() {
		for(Card c : arr) {
			System.out.println(c.toString());
		}
	}
	
	// Gamer의 덱에 잇는 카드 전체 점수 리턴하는 메소드
	int getPoint() {
		int hap = 0;
		for(Card c : arr) {
			hap += c.getPoint();
		}
		return hap;
	}
	
	// 게이머가 그만둘 때까지 카드를 더 받는 메소드
	
	void moreCards(CardDeck cd) {
		// 게이머는 얼마든지 카드를 추가로 뽑을 수 있다.
		arr.add(cd.getCard());
	}
}
