package com.test01;

import java.util.Scanner;

public class SwitchTest02 {
	
	public void testSwitch() {
		//정수 두 개의 연산 기호문자(+,-,/,*) 1개를 입력 받아서
		//연산 기호 문자에 해당하는 계산을 수행하고 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하시오 : ");
		int numA = sc.nextInt();
		System.out.print("두번째 정수를 입력하시오 : ");
		int numB = sc.nextInt();
		System.out.print("연산기호를 입력하시오 : ");
		char cal = sc.next().charAt(0);
		
		int result=0;
		switch(cal) {
		case '+':
			result= numA+numB;
			break;
		case '-':
			result= numA-numB;
			break;
		case '/':
			result= numA/numB;
			break;
		case '*':
			result= numA*numB;
			break;
		default:
			System.out.println("올바른 값을 입력해주세요.");
		}
		
		System.out.printf("%d %c %d 의 결과값은 %d이다.", numA,cal,numB,result);
	}
}
