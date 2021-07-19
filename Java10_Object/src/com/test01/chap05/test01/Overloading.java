package com.test01.chap05.test01;

public class Overloading {
	public int test() {
		return 0;
	}
	
	public int test(int a) {
		return 0;
	}
	
	public int test(int a, int b) {
		return 0;
	}
	
	public int test(int a , String s) {
		return 0;
	}
	//매개변수명은 상관이 없다.
//	public int test(int b , String a) {
//		return 0;
//	}
	
	public int test(String s, int a) {
		return 0;
	}
	
	public String test(int a, int b ,String str) {
		return null;
	}
	//에러
	//리턴타입이 다르다고 오버로딩이 적용되는것은 아니다.
//	public int test(int a, int b ,String str) {
//		return null;
//	}
	//에러
	//접근제한자가 다르다고 오버로딩이 적용되는것은 아니다.
//	private String test(int a, int b ,String str) {
//		return null;
//	}
	
	
}
