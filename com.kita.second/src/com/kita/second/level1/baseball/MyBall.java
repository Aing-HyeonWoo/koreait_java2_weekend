package com.kita.second.level1.baseball;

import java.util.Scanner;

public class MyBall {
	
	private int[] myArr;
	private int max;
	private int min;
	Scanner scan;
	
	public MyBall(int gameCnt, int max, int min) {
		this.scan = new Scanner(System.in);
		myArr = new int[gameCnt];
		this.max = max;
		this.min = min;
	}
	
	void setNumbers(){
		int num;
		for(int i = 0; i < myArr.length; i++) {
			System.out.println();
			System.out.printf("%d째 값을 입력하세용 : ", i+1);
			num = scan.nextInt();
			if(num > max || num < min) {
				System.out.printf("%d이상 %d이하 값을 입력하라\n", min, max);
				i--;
			} else {
				myArr[i] = num;
			}
		}
	}
	
	
	
	int getMyNum(int idx) {
		return myArr[idx];
	}
}
