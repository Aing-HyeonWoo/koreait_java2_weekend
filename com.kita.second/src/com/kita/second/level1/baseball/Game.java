package com.kita.second.level1.baseball;

public class Game {
	// 실행 클래스
	
	public static void main(String[] args) {
		int gameCnt = 3;
		int max = 9;
		int min = 1;
		int count = 0;
		Baseball ball = new Baseball(gameCnt, max, min);
		MyBall myBall = new MyBall(gameCnt, max, min);
		
		
		do {
			myBall.setNumbers();
			count++;
		} while(Checker.check(gameCnt, ball, myBall));

		
		System.out.println("ㅊㅊㅊ 야구게임 끝");
		System.out.printf("%d 번 만에 맞힘 ㅊㅊㅊㅊ\n", count);
			
		
	}
}
