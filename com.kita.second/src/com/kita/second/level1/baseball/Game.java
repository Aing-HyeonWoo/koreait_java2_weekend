package com.kita.second.level1.baseball;

public class Game {
	// 실행 클래스
	
	public static void main(String[] args) {
		int gameCnt = 3;
		int max = 9;
		int min = 1;
		Baseball ball = new Baseball(gameCnt, max, min);
		MyBall myBall = new MyBall(gameCnt, max, min);
		
		do {
			myBall.setNumbers();
		} while(Checker.check(gameCnt, ball, myBall));

		System.out.println("야구게임 종료!");
			
		
	}
}
