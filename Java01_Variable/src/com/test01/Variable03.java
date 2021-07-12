package com.test01;

public class Variable03 {
	
	public static void main(String args[]) {
		//상수 테스트
		
		int age;
		final int AGE;
		
		age = 20;
		AGE = 20;
		
		System.out.println("age: "+age);
		System.out.println("AGE: "+AGE);
		
		age = 19;
		// AGE = 19; 상수는 초기화 이후 값 변경 불가능!
		
		System.out.println("변경 후 age: "+age);
		System.out.println("변경 후 AGE: "+AGE);
	}
}
