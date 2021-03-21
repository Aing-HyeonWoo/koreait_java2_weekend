package com.kita.second.blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
	private List<Card> arr = new ArrayList<Card>();
	
	
	public CardDeck() {
		init();
	}
	
	private void init() {
		// 반복문 사용하여 CardDeck인  arr안에 중복되지 않게 Card타입 인스턴스 생성하여 집어넣기
			for(String p : Card.PATTERNS){
				for(int i = 1; i <= 13; i++) {
					int point = i;
					if(point >= 10) {
						point = 10;
					}
					Card c = new Card(p, getDeno(i), point);
					arr.add(c);
				}
			}
		
	}
	
	private String getDeno(int num) {
		// 1 ~ 13
		switch(num) {
		
			// 1이면 A
			// 11이면 J
			// 12면 Q
			// 13이면 K
			// 나머지 숫자값은 그대로 리턴
		case 1:
			return "A";
		case 11:
			return "J";
		case 12:
			return "Q";
		case 13:
			return "K";
		default:
			return Integer.toString(num);
			
		}
	}
	
	public Card getCard() {
		// 0 ~ list의 크기보다 1 작은 값까지 중 한 값을 랜덤으로 뽑아서
		// list에서는 삭제
		// return 뽑은 값
		
		int rNum = (int)(Math.random()*(arr.size() - 0 + 1));
		Card temp;
		temp = arr.get(rNum);
		arr.remove(rNum);
		return temp;
	}
	
	@Override
	public String toString() {
		String str = "";
		for(Card c : arr) {
			str += (c + "\n");
		}
		return str;
	}
}
