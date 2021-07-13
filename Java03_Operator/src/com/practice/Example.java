package com.practice;

import java.util.Scanner;

public class Example {
	
	public void sample1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------점수를 입력하세요-------");
		
		System.out.print("국어 : ");
		int scoreA = sc.nextInt();
		System.out.print("영어 : ");
		int scoreB = sc.nextInt();
		System.out.print("수학 : ");
		int scoreC = sc.nextInt();
		
		int sum = scoreA + scoreB + scoreC;
		double avg = sum/3.0;
		System.out.println();
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		System.out.println((sum<40)?"불합격입니다.":(avg<60)?"불합격입니다":"합격입니다");
	}
	
	public void sample2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------정보를 입력하세요-------");
		
		System.out.print("학생이름 : ");
		String name = sc.next();
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		System.out.print("반 : ");
		int classNum = sc.nextInt();
		System.out.print("번호 : ");
		int num = sc.nextInt();
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		System.out.print("성적 : ");
		double scoreAll = sc.nextDouble();
		
		System.out.println();
		System.out.println(grade+"학년 "+classNum+"반 "+num+"번 "+((gender=='M')?"남학생 ":"여학생 ")+name+"은(는) 성적이 "+scoreAll+"이다.");
	}
	
	public void sample3() {
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요. : ");
		num = sc.nextInt();
		
		System.out.println();
		System.out.println(num+"은(는) "+((num>0)?"양수다.":"양수가 아니다."));
		
	}
	
	public void sample4() {
		
		int num;
		String str;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요. : ");
		num = sc.nextInt();
		
		str = (num%2==0)?"짝수다":"홀수다";
		
		System.out.println(num+"은(는) "+str);
	}
	
}
