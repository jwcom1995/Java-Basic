package com.test01;

import java.util.Scanner;

public class WhileTest02 {
	
	public static void main(String[] args) {
		//WhileTest02.test1();
		WhileTest02.test2();
	}
	
	public static void test1() {
		int i = 1 ;
		
		do {
			System.out.println(i);
			i++;
		} while(i==10); {
			System.out.println("do while이 종료된 후 i 값 : "+ i);
		}
	}
	
	public static void test2() {
	//키보드로 영어 문자열 입력, 출력
	// 단, "exit" 입력되면 종료!
		
		Scanner sc = new Scanner(System.in);
		String str = null;
		
		do {
			System.out.print("문자열 입력 : " );
			str = sc.next();
			System.out.println("str: "+ str);
		}while(!str.equals("exit"));
		
	}
}
