package com.test01;

public class MethodTest01 {
	
	public static void main(String[] agrs) {
		
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		MethodTest01.defaultMethod();
		privateMethod();
		
		//
		MethodTest01 mt01 = new MethodTest01();
		mt01.NonStaticMethod();
	}
	
	// 접근제한자
	
	//public - 어디서나 접근 가능 ( + )
	public static void publicMethod() {
		System.out.println("public method");
	}
	
	//protected - 상속일 경우 상속된 곳에서 접근가능 ( # )
	//			- 상속이 아닌 경우 같은 패키지 안에서 접근가능
	protected static void protectedMethod() {
		System.out.println("protected method");
	}
	
	//default - 같은 패키지 내에서 접근 가능
	static void defaultMethod() {
		System.out.println("default method");	
	}
	
	//private - 현재 클래스 안에서만 접근가능 ( - )
	private static void privateMethod() {
		System.out.println("private method");
	}
	
	public void NonStaticMethod() {
		System.out.println("non static method");
	}
	
}
