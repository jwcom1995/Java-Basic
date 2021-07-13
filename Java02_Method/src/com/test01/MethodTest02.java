package com.test01;

public class MethodTest02 {
	
	public static void main(String[] agrs) {
		
		//method 호출방법
		//1. static : class.method();
		
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		MethodTest01.defaultMethod();
		//MethodTest01.privateMethod();		
		//
		
		//2.not static = new class();
		MethodTest01 mt01 = new MethodTest01();
		mt01.NonStaticMethod();
	}
}
