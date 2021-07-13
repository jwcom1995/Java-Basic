package com.test01;

import java.util.Scanner;

public class Operator03 {
	
	public static void main(String[] args) {
		Operator03 test = new Operator03();
		//test.opTest1();
		test.opTest2();
	}
	
	//&& (그리고 , ~면서 )
	//|| ( 또는 , ~거나 )
	//논리값 && 논리값, 논리값 || 논리값
	
	public void opTest1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		System.out.println("1부터 100 사이인지 확인 : "+((num>=1)&&(num<=100)));
		
		
		System.out.print("계속 하시려면 y혹은 Y를 입력하세요: ");
		char ch2 = sc.next().charAt(0);
	
	}
	
	public void opTest2() {
		
		int num =10;
		
		int res = (false && ++num == 0) ? num:num;
		System.out.println("&&확인 ㅣ "+ num);
	}
}
