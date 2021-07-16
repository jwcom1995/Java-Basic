package com.test01;

import java.util.Scanner;

public class WhileTest01 {
	public static void main(String[] args) {
		
		//WhileTest01.test1();
		//WhileTest01.test2();
		//WhileTest01.test3();
		//WhileTest01.test4();
		WhileTest01.test5();
	}
	
	public static void test1() {
		int i = 1;
		
		while (i<10) {
			System.out.println(i+"번째 반복문 수행중..");
			i++;
		}
		
		System.out.println("while 종료 후 i 값 : "+ i);
	}
	
	public static void test2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.next();
		
		//1.
//		System.out.println(str.charAt(0));
//		System.out.println(str.charAt(1));
//		System.out.println(str.charAt(2));
//		System.out.println(str.charAt(3));
//		System.out.println(str.charAt(4));
		
		//2.
//		int index = 1 ;
//		int no=0;
//		while (index<6) {
//			System.out.println(str.charAt(no));
//			no++;
//			index++;
//		}
		
		//3
//		int index = 1 ;
//		while (index<6) {
//			System.out.println(str.charAt(index-1));
//			index++;
//		}
		
		//4
//		int index = 0 ;
//		while (index<5) {
//			System.out.println(str.charAt(index));
//			index++;
//		}
		
		//5
		int index = 0 ;
		while(index<str.length()) {
			System.out.println(str.charAt(index));
			index++;
		}			
	}
	
	public static void test3() {
		//1부터 입력받은 수 가지의 정수들 합을 구해 출력하자.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나를 입력하시오 : ");
		int num = sc.nextInt();
		int val = 1;
		int sum = 0;
		while(val<=num) {
			sum += val;
			val++;
		}
		System.out.println("1부터 "+num+"까지의 정수들 합 : "+sum);
	
	}
	
	public static void test4() {
		int i = 1;
		
		while(true) {
			System.out.print(i);
			i++;
			
			if(i==100) {
				break;
			}
		}
		
		System.out.println("while이 종료된 후 i 의 값 : "+i);
	}
	
	public static void test5() {
		//키보드로 4를 입력받을때 까지 반복
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("숫자입력[1~10] : ");
			int i = sc.nextInt();
			
			if(i==4) {
				System.out.println("4입력 ! , 종료 !");
				break;
			}
		}
		
	}
}
