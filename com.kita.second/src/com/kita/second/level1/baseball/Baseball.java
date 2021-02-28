package com.kita.second.level1.baseball;

public class Baseball {
	// 랜덤으로 숫자 뽑느 ㄴ클래스
	//필드
	private int[] rArr;
	int max;
	int min;
	public Baseball(int gameCnt, int max, int min) {
		rArr = new int[gameCnt];
		this.max = max;
		this.min = min;
		setRandoms();
	}
	
	private void setRandoms() {

		for(int i = 0; i < rArr.length; i++) {
			rArr[i] = (int)(Math.random()*(max-min +1));
			for(int z = 0; z < i; z++) {
				if(rArr[i] == rArr[z]) {
					i--;
					break;
				}
			}
		}
	}
	
	int getRNum(int idx) {
		return rArr[idx];
	}
}
