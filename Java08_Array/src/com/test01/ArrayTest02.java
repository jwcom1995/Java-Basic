package com.test01;

public class ArrayTest02 {

	public static void main(String[] args) {
		
		char[] ch = new char[26];
		
		//0. 배열에 데이터 입력
		for(int i = 0 ; i <ch.length;i++) {
			ch[i]=(char)(i+97);
		}		
		
		
		//1. a~z 일차원 배열 출력
		
		ArrayTest02.prn(ch);
		
		//2. 배열을 거꾸로 출력(z~a)
		ArrayTest02.reverse(ch);
		
		//3. 대문자로 바꾸어 출력
		ArrayTest02.upper(ch);
	}
	
	public static void prn(char[] ch) {
		
		System.out.print("배열 값 출력 : ");
		for(int i = 0; i < ch.length ; i++) {
			System.out.print(ch[i]+" ");
		}
		System.out.println();
	}
	
	public static void reverse(char[] ch) {
		
		System.out.print("배열 값 역순출력 : ");
		for(int i = ch.length-1; i >= 0 ; i--) {
			System.out.print(ch[i]+" ");
		}
		System.out.println();
	}

	public static void upper(char[] ch) {
		
		System.out.print("배열 값 대문자 출력 : ");
		for(int i = 0; i < ch.length ; i++) {
			ch[i]=(char)(ch[i]-32);
			System.out.print(ch[i]+" ");
		}
		System.out.println();
	}
}
