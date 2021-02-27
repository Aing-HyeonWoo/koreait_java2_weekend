package com.kita.second.level1.practice;

public class Practice1 {
	// 구구단 2단찍기 메소드
	public static void main(String[] args) {
		printStars(1, 5);
		System.out.println(sum(1, 2));
	}
	

	public static void printGuGudan(int num) {
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n",num, i, i*num);
		}
	}
	// 별찍기 메소드
	// 내가 입력하는 값에 따라 line(줄과) star(별의 개수)가 달라지도록
	
	public static void printStars(int line, int star) {
		for(int i = 0; i < line; i++) {
			for(int j = 0; j < star; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	public static int sum(int n1, int n2) {
		return n1 + n2;
	}
}
