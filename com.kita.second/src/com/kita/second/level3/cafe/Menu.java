package com.kita.second.level3.cafe;

import java.util.Scanner;

public class Menu {
	private String name;
	private int price;
	
	public MenuItem Menu() {
		System.out.println("메뉴 \n 아메리카노 : 1500");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("음료 : ");
		name = scan.next();
		
		if(name == "아메리카노") {
			price = 1500;
		}
		
		MenuItem mi = new MenuItem(name, price);
		return mi;

	}

	public String getName() {
		return name;
	}

	

	public int getPrice() {
		return price;
	}

	
	
	
}
