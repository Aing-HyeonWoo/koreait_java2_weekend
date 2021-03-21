package com.kita.second.blackjack;

public class Rule {
	
	void whoIsWin(Gamer gamer, Dealer dealer) {
		int gPoint = gamer.getPoint();
		int dPoint = dealer.getPoint();
		int num = 0;
		
		if(gPoint > 21) {
			System.out.println("게이머 졌다!");
			num = 1;
		}
		if(dPoint > 21) {
			System.out.println("딜러 졌다!");
			num = 1;
		}
		
		int gResult = 21 - gPoint;
		int dResult = 21 - dPoint;
		
		
		if(gResult >= 0 && dResult >= 0 && num == 0) {
			if(gResult > dResult) {
				System.out.println(dPoint+"점으로 딜러 우승!");
			} else if(gResult < dResult) {
				System.out.println(gPoint+"점으로 게이머 우승!");
			} else {
				System.out.println("동점으로 무승부!");
			}
		}
		
	}
	
}
