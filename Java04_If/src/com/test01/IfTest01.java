package com.test01;

import java.util.Scanner;

public class IfTest01 {

	public void testIf() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요: ");
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("입력하신 숫자는 짝수입니다.");
		}
		
		if(num%2!=0) {
			System.out.println("입력하신 숫자는 홀수입니다.");
		}
		System.out.println("프로그램 종료");
	}
}
