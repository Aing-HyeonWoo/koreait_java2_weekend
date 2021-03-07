package com.kita.second.level2;

public class MapleTest {
	public static void main(String[] args) {
		Adventurer adv = new Adventurer();
		Magician mg = new Magician();
		
//		adv.mp = 10;
		mg.mp = 10;
		
		
		adv.attack();
		adv.jump();
//		adv.teleport()
		
		mg.attack();
		mg.jump();
		mg.teleport();
	}
}
