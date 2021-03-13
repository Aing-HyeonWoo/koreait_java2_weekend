package com.kita.second.level2;

public class Netflix {
	int chapter = 0;
	int maxChapter;
	
	
	public Netflix(int maxChapter) {
		this.maxChapter = maxChapter;
	}
	
	boolean watch() {
		++chapter;
		if(chapter <= maxChapter) {
			System.out.println("넷플 본다 ^_^");
			return true;
		}
		System.out.println("넷플릭스를 이미 다 시청했다.");
		return false;
	}
}

