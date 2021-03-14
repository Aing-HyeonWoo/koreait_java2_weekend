package com.kita.second.level1;

//import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Calc myCalc = new Calc();
//		double pi = myCalc.pi;
//		int num = myCalc.num;
//		
//		double pi = Calc.pi;
		myCalc.num = 15;
		System.out.println("myCalc.num : "+myCalc.num);
		
		Calc yourCalc = new Calc();
		
		System.out.println("yourCalc.num : "+yourCalc.num);
		
//		ClassEx cl = new ClassEx();
//		int result = cl.sum(5, 5, 3*500000000);
//		System.out.println(result);
//		
//		Scanner sc = new Scanner(System.in);
	}
}