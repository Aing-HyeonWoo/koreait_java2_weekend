package com.kita.second.level3.cafe;

//import java.util.Scanner;

public class Menu {
	private MenuItem[] arr = new MenuItem[4];
	
	public Menu() {
		arr[0] = new MenuItem("김치 아메리카노", 2000);
		arr[1] = new MenuItem("김치찌개", 24000);
		arr[2] = new MenuItem("미국산 김치전", 27250000);
		arr[3] = new MenuItem("김치 생크림 케이크", 20000);
	}

	public void showMenus() {
		System.out.println("--Menu--");
		for(int i = 0; i < arr.length; i++) {
			MenuItem mi = arr[i];
			System.out.println(i+1+". "+mi.toString());
		}
		System.out.println("\n---------------------------\n");
	}

	

	public MenuItem choose(int idx) {
		return arr[idx];
	}

}
