package com.kita.second.level1.practice;

public class Adventurer {
	// 필드
	int strength;
	int dexterity;
	int intellegence;
	int luck; 
	int hp;

	// 생성자
	
	public Adventurer() {
		strength = 10;
		dexterity = 10;
		intellegence = 10;
		luck = 10;
		hp = 10;
	}
	
	public Adventurer(int strength, int dexterity) {
		this.strength = strength;
		this.dexterity = dexterity;
	}
	
	
	// 메소드
	void attack(){
		System.out.println("공격! ╰(*°▽°*)╯\n");
	}
	
	void jump() {
		System.out.println("점프!    (●'◡'●)");
		}
}