package com.kita.second.level1;

public class MacBookTest {
	public static void main(String[] args) {

		MacBook mac1 = new MacBook(512);
		MacBook mac2 = new MacBook(512, "space gray");
		MacBook mac3 = new MacBook(512, 2500000);
		MacBook mac4 = new MacBook(512, 2500000, "space gray");
																
		mac1.coding();
		mac2.webSurf();
		mac3.email("팀 쿡");
		mac4.webSurf();
	}
}
