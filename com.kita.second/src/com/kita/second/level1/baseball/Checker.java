package com.kita.second.level1.baseball;

public class Checker {
	// 스트라이크, 볼, 아웃 개수 확인하는 클래스
	
	public static boolean check(int gameCnt, Baseball ball, MyBall myBall) {
		int strike = 0;
		int ball1 = 0;
		
		for(int i=0; i < gameCnt ; i++) {
			for(int z=0; z < gameCnt ; z++) {
				if(ball.getRNum(i) == myBall.getMyNum(z)) {
					if(i==z) {
						strike++;
					} else {
						ball1++;
					}
				}
			}
		}
		System.out.printf("strike : %d, ball %d, out : %d \n\n\n",strike, ball1, strike);
		System.out.println("-----------------------\n");
		return (strike != gameCnt);
		
	}
}