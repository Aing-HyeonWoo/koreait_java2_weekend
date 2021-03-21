package com.kita.second.blackjack;

public class Game {
	public static void main(String[] args) {
		CardDeck cd = new CardDeck();
		Dealer dealer = new Dealer();
		Gamer gamer = new Gamer();
		Rule rule = new Rule();
		
		for(int i = 0; i < 2; i++) {
			// 딜러와 게이머는 순차적으로 카드를 하나씩 뽑아 각자 2개의 카드를 소지한다.
			dealer.recieveCard(cd.getCard());
			gamer.recieveCard(cd.getCard());
		}
		
		dealer.moreCards(cd);
		gamer.moreCards(cd);
		
		System.out.println("딜러 덱");
		dealer.openCards();
		System.out.println("게이머 덱");
		gamer.openCards();
		
		rule.whoIsWin(gamer, dealer);
	}
}
