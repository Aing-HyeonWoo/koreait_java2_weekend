package com.kita.second.level3.cafe;

import java.util.Scanner;

public class Customer {
	
	public MenuItem order(Menu m) {
		m.showMenus();
		MenuItem mi = null;
		
		Scanner scan = new Scanner(System.in);
		
		
		while(mi == null) {
			System.out.print("메뉴 번호를 입력해 주세요 : ");
			String strNum = scan.next();
			int menuNum;
			try {
				menuNum = Integer.parseInt(strNum);
				mi = m.choose(menuNum-1);
			} catch(NumberFormatException e) {
				
				System.out.println("숫자만 입력해주세요.");
				
			} catch(Exception e) {
				
				System.out.println("메뉴를 잘못 선택했습니다.");
				
			}

		}		
		
		scan.close();
		return mi;
	}
	
	public void drinkCoffee(Coffee coffee) {
		System.out.println(coffee.getName()+"를(을) 먹는다");
		
	}
}
