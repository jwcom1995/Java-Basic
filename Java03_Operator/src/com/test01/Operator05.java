package com.test01;

public class Operator05 {
	
	public static void main(String[] args) {
		new Operator05().opTest();
	}
	
	//복합 대입 연산자(산술 대입 연산자)
	//+=, -=, *= , /=, %=
	
	public void opTest() {
		
		int res, num = 12;
		
		num = num + 3;
		System.out.println("num: "+ num);
		
		num += 3;
		System.out.println("num: "+ num);
		
		num -= 5;  // num = num-5;
		System.out.println("num: "+ num);
		
		num /= 2;
		System.out.println("num: " + num);
		
		num *= 2;
		System.out.println("num: " + num);
	}
	
}
