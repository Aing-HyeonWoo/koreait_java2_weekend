package com.kita.second.level3.cafe;

import java.util.Scanner;

public class Menu {
	private MenuItem[] arr = new MenuItem[4];
	
	public Menu() {
		arr[0] = new MenuItem("아메리카노", 2000);
		arr[1] = new MenuItem("아메리카노", 2000);
		arr[2] = new MenuItem("아메리카노", 2000);
		arr[3] = new MenuItem("아메리카노", 2000);
	}

	public String getName() {
		return name;
	}

	

	public int getPrice() {
		return price;
	}

	
	
	
}
