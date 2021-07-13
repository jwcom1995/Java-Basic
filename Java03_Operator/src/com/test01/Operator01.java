package com.test01;

import java.util.Scanner;

public class Operator01 {
	
	public static void main (String[] agrs) {
		//Operator01.test();
		
		Operator01 test = new Operator01();
		test.test2();
	}
	
	public static void test() {
		// !논리값 : 논리값을 반대로 바꾸는 연산자
		System.out.println("true의 부정: " + !true);
		System.out.println("false의 부정: " + !false);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력: ");
		int num = sc.nextInt();
		
		System.out.println("입력한 정수가 양수인가? "+ (num>0));
		System.out.println("입력한 정수가 양수가 아닌가? "+ !(num>0));
		
		System.out.println("입력한 정수가 짝수인가? "+(num%2==0));
		System.out.println("입력한 정수가 짝수가 아닌가? "+(num%2!=0));
		
	}
	
	public void test2() {
		// ++ : 1증가, ++값, 값++로 사용
		// -- : 1감소, --값, 값--로 사용
		
		int age = 20; 
		
		System.out.println("현재 나이는? " + age);
		
		++age;
		System.out.println("++age의 결과는? "+ age);
		
		age++;
		System.out.println("age++의 결과는? "+ age);
		
		--age;
		System.out.println("--age의 결과는? "+ age);
		
		age--;
		System.out.println("age--의 결과는? "+ age);
		
		System.out.println();
		//////////////////////////////
		int num1 =20;
		
		//후위연산자
		int res = num1++ *3;
		System.out.println("res: "+ res);
		System.out.println("num1: "+ num1);
		
		//전위연산자
		int num2 = 20;
		
		int res2 = ++num2 * 3;
		
		System.out.println("res2: "+res2);
		System.out.println("num2: "+num2);
	}
	
}
