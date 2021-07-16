package com.silsub1.example;

import java.util.Scanner;

public class Munjae {
	
	public void test1() {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하시오 : ");
		int scoreK = sc.nextInt();
		System.out.print("영어 점수를 입력하시오 : ");
		int scoreE = sc.nextInt();
		System.out.print("수학 점수를 입력하시오 : ");
		int scoreM = sc.nextInt();
		
		int sum = scoreK+scoreE+scoreM;
		double avg = sum/3;
		
		if(avg>=60) {
			if(scoreK >=40 && scoreE >=40 && scoreM >=40) {
				System.out.println("국어 점수 : "+ scoreK);
				System.out.println("영어 점수 : "+ scoreE);
				System.out.println("수학 점수 : "+ scoreM);
				System.out.println("합계 : "+sum+", 평균 점수 : "+ avg);
			} else {
				System.out.println("불합격");
			}
				
		}else {
			System.out.println("불합격");
		}
	}
	
	public void test2() {
		
		System.out.println("**** 초기메뉴 ****");
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("메뉴번호 입력 : ");
		int num = sc.nextInt();
		
		System.out.println();
		
		switch(num) {
		case 1:
			System.out.println("입력메뉴가 선택되었습니다.");
			break;
		case 2:
			System.out.println("수정메뉴가 선택되었습니다.");
			break;
		case 3:
			System.out.println("조회메뉴가 선택되었습니다.");
			break;
		case 4:
			System.out.println("삭제메뉴가 선택되었습니다.");
			break;
		case 7:
			System.out.println("프로그램이 종료됩니다..");
			break;
		default:
			System.out.println("번호가 잘못 입력되었습니다.");
			System.out.println("다시 입력하시오.");
		}
	}
	
	public void test3() {
		int i = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나를 입력하시오 : ");
		i = sc.nextInt();
		
		if(i > 0 ) {
			System.out.println("양수다");
		} else if ( i < 0) {
			System.out.println("음수다");
		} else {
			System.out.println("0이다");
		}
	}
	
	public void test4() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나를 입력하시오 : ");
		int i = sc.nextInt();
		
		if(i > 0 ) {
			if(i%2==0) {
				System.out.println("짝수다");
			} else {
				System.out.println("홀수다");
			}
		} else {
			System.out.println("올바른 값을 입력하시오.");
		}
	}
	
	public void inputTest() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하시오 : ");
		String name = sc.next();
		System.out.print("나이를 입력하시오 : ");
		int age = sc.nextInt();
		System.out.print("키를 입력하시오 : ");
		double h = sc.nextDouble();
		
		if(name != null && name.length()>0) {
			if(age>0 && h > 0) {
				System.out.println("이름 : "+name);
				System.out.println("나이 : "+age);
				System.out.println("키 : "+h);
				System.out.println("확인 : "+name+"의 나이는 "+age+"세이고, 키는 "+h+"cm 이다.");
			} else {
				System.out.println("올바른 값을 입력하시오.");
			}
		} else {
			System.out.println("올바른 값을 입력하시오.");
		}
	}
	
	public void test6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int numA = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int numB = sc.nextInt();
		
		if(numA > 0 && numB > 0) {
			System.out.println(numA + " + " +numB + " = " +(numA + numB));
			System.out.println(numA + " - " +numB + " = " +(numA - numB));
			System.out.println(numA + " * " +numB + " = " +(numA * numB));
			System.out.println(numA + " / " +numB + " = " +(numA / numB));
			System.out.println(numA + " % " +numB + " = " +(numA % numB));
		} else {
			System.out.println("양의 정수를 입력하시오.");
		}
	}
	
	public void test7() {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하시오 : ");
		int score = sc.nextInt();
		
		char rank = ' ';
		if(score >=90) {
			rank = 'A';
		} else if(score >=80) {
			rank = 'B';
		} else if(score >=70) {
			rank = 'C';
		} else if(score >=60) {
			rank = 'D';
		} else if(score >=0) {
			rank = 'F';
		} else {
			System.out.println("올바른 값을 입력하시오.");
		}
		
		System.out.println("점수 : "+score + ", 학점 : "+ rank);
	}
	
	
	
	
	
	
	
}
