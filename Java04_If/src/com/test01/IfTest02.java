package com.test01;

import java.util.Scanner;

public class IfTest02 {

	public void test() {
		int i = 20;
		
		if(i<10) {
			System.out.println(i+" 은 10보다 작습니다.");
		} else {
			System.out.println(i+" 은 10보다 크거나 같습니다.");
		}
	}
	
	public void test2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요: ");
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println(num+"은 짝수입니다.");
		} else {
			System.out.println(num+"은 홀수입니다.");
		}
		
	}

	public void test3() {
		//숫자를 하나 입력받아 50보다 큰 수라면 , 50보다 작은 수라면
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0보다 큰 정수를 하나 입력해 주세요. : ");
		int num = sc.nextInt();
		
		if(num>=50) {
			if(num%2==0) {
				System.out.println(num+"은 50보다 큰 짝수 입니다.");
			} else {
				System.out.println(num+"은 50보다 큰 홀수 입니다.");
			}
		} else{
			System.out.println(num+"은 50보다 작습니다.");
		}
	}
	
	public void test4() {
		// 숫자를 하나 입력 받아 양수인지, 음수인지 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력해 주세요");
		int num = sc.nextInt();
		
		if (num>=0) {
			if(num>0) {
				System.out.println(num+"은 양수입니다.");
			} else {
				System.out.println(num+"은 0입니다.");
			}
		} else {
			System.out.println(num+"은 음수입니다.");
		}
		
	}
}
