package com.kita.second.blackjack;

public class Dealer extends Gamer {
	
	public Dealer() {
		
	}
	
	@Override
	void moreCards(CardDeck cd) {
		int hap = getPoint();
		if(hap <= 16) {
			arr.add(cd.getCard());
		}
		
		
	}
}
