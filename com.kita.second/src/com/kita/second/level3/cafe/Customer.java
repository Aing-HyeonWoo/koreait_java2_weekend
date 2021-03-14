package com.kita.second.level3.cafe;

public class Customer {
	
	public MenuItem order(Menu menu) {
		MenuItem mi = new MenuItem(menu.getName(), menu.getPrice());
		return mi;
	}
	
	public void drinkCoffee(Coffee coffee) {
		System.out.println(coffee.getPrice()+"짜리 "+coffee.getName()+"를 마신다");
		
	}
}
