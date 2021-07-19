package com.test01.chap05.test02;

public class Run {

	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		
		mt.method1();
		
		String result = mt.method2();		
		System.out.println(result);
		System.out.println(mt.method2());
		
		mt.method3(3, 15);
		
		int sum = mt.method4(10, 20);
		System.out.println(sum);
		System.out.println(mt.method4(20,50));
		return;

	}

}
