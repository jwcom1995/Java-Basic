package com.silsub1.example;

import java.util.Scanner;

public class ForWhile {
	
	Scanner sc = new Scanner(System.in);
	
	public void printStar1() {
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		if(num>0) {
			for(int i = 1 ; i <= num ; i ++) {
				for(int j = 1 ; j <= i ; j++) {
					if(j==i) {
						System.out.print(j);
					}
					else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		} else {
			System.out.println("양수가 아닙니다.");
		}
		System.out.println("====================");
	}
	
	public void printStar2() {
		
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		if(num>0) {
			for(int i = 1 ; i <= num ; i ++) {
				for(int j = 1 ; j <= i ; j++) {
						System.out.print("*");
				}
				System.out.println();
			}
		} else if(num<0){
			for(int i = num ; i < 0 ; i ++) {
				for(int j = i ; j < 0 ; j ++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else {
			System.out.println("출력 기능이 없습니다.");
		}
		
		System.out.println("====================");
	}
	
	public void countInputCharacter() {
		
		System.out.print("문자열 입력 : ");
		String str = sc.next();
		
		boolean eng = true;
		
		String checkE = str.toUpperCase();

		for(int i = 0 ; i< str.length() ; i ++) {
			if((int)checkE.charAt(i)>=65 && (int)checkE.charAt(i)<=90) {
				
			}else {
				eng = false;
			}
		}
		
		if(eng) {
			System.out.print("문자 입력 : ");
			char target = sc.next().charAt(0);
			
			int count = 0;
			
			for(int i = 0 ; i < str.length() ; i++) {
				if(str.charAt(i)==target)
					count++;
			}
			
			System.out.println("포함된 갯수 : "+ count+" 개");
		} else {
			System.out.println("영문자가 아닙니다.");
		}
		
		System.out.println("====================");
	}
}
