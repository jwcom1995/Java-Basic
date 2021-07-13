package com.test01;

public class Operator02 {
	
	public static void main(String[] args) {
		
		//new Operator02().opTest();
		new Operator02().opTest2();
	}
	
	public void opTest() {
		
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 + num2 = "+ (num1+num2));
		System.out.println("num1 - num2 = "+ (num1-num2));
		System.out.println("num1 * num2 = "+ (num1*num2));
		System.out.println("num1 / num2 = "+ (num1/num2));
		
		System.out.println("num1 % num2 = "+ (num1%num2));
	}
	
	public void opTest2() {
		
		//비교 연산자
		
		int a = 10, b=20;
		boolean res1, res2, res3;
		
		res1 = (a==b);
		res2 = (a<=b);
		res3 = (a>b);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		
		
		
		
		
		
		
	}
}
