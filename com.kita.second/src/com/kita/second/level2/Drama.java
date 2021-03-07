package com.kita.second.level2;

public class Drama extends Netflix{
	int chapter;
	
	public Drama(String title, int chapter) {
		super(title); // Netflix()
		this.chapter = chapter;
	}
}
