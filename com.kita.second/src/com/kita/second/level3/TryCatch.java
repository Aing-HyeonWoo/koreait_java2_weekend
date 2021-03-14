package com.kita.second.level3;

import java.util.Scanner;

public class TryCatch {
	public static void main(String[] args) {
		try {
		int[] arr = new int[2];
		
		try {
			// 에러가 날 수 있는 코드
			System.out.println(arr[2]);
			
		} catch(NullPointerException e) {
			System.out.println("NullPointer 예외가 발생했습니다.");
		
		} catch(Exception e) {
			// 예외 발생시 처리 코드
			System.out.println("어머낫 에러가 났어요^^");
		} finally {
			System.out.println("에러 없앴다! 계속 진행하셈\n\n");
		}
		System.out.println("다음 코드임!\n\n\n\n\n\n\n");
		
		
		Scanner scan = new Scanner(System.in);
		int num;
		
		
		
//		System.out.println("숫 자 입 력 해 라 ! : ");
//		int num = scan.nextInt();
//		num = Integer.parseInt(scan.next());
//		System.out.println(num);
//		scan.close();
		
		System.out.println("입력 하셈 : ");
		String strNum = scan.next();
		
		
		// oo 오류가 발생했습니다. <- 2개 있음
		
		// 다른 모든 예외의 경우 -> 알 수 업슨ㄴ 오류가 발생
		
		try {
			num = Integer.parseInt(strNum);
			arr[2] = num;
							
		} catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("ArrayIndexOutOfBoundsException\n 에러가 발생했어요!");
			
		} catch(NumberFormatException e) {
			
			System.out.println("어머낫 NumberFormatException\n 에러가 발생했어요");
			
		} catch (Exception e){
			System.out.println("알수없는 오류가 발생했어요!");
		} finally {
			
			System.out.println("try 끝");
			scan.close();
			
		}
		
		} catch(Exception e) {
			System.out.println("예외가 발생했다!");
			
			
		} 
	}
}




