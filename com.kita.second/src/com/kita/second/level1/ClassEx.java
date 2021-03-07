package com.kita.second.level1;

public class ClassEx{
	// 필드(속성)
	int field1;
	String field2;
	int[] field3;
	
	int field4;
	static int field5;
	
	void method4() { }
	
	static void method5() { }
	
	static void methodTest() {
//		field4 = 10;
//		method4();
		
		field5 = 10;
		method5();
	}

	
	// 생성자
	// 생성과 동시에 머머 할거
	public ClassEx() {
		super();
	}
	
	
public ClassEx(int field1) {
	this.field1 = field1;
}

//public ClassEx(int field1, String field2) {
//		this(field1, field2); // classEx(); 
//	}
	
	//public : 모두가 사용 할 수 있다아아
	


	// 메소드(동작)
	
	static public int sum(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	// 매개변수의 1. 타입, 2. 개수, 3. 위치
	
	int sum(int... arr) {
		// 실행코드
		int hap = 0;
		for(int i = 0; i < arr.length; i++) {
			hap += arr[i];
			}
		return hap;
	}

}
