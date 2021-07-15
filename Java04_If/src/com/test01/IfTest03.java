package com.test01;

import java.util.Scanner;

public class IfTest03 {

	public void test() {

		int i = 10;
		int j = 20;

		if (i > j) {
			System.out.println(i + " 은 " + j + " 보다 큽니다.");
		} else if (i < j) {
			System.out.println(i + " 은 " + j + " 보다 작습니다.");
		} else {
			System.out.println(i + " 은 " + j + " 보다 같습니다.");
		}
	}

	public void test2() {
		// 점수 하나 이력받아 등급을 나누어 점수와 등급을 출력하자.
		// 등급
		// 90점 이상 A등급
		// 90점 미만 80점 이상 B등급
		// 80점 미만 70점 이상 C등급
		// 70점 미만 60점 이상 D등급
		// 60점 미만 F등급

		Scanner sc = new Scanner(System.in);

		System.out.print("점수를 입력해주세요. : ");
		int score = sc.nextInt();
		char rank;
		if (score >= 90) {
			rank='A';
		} else if (score >= 80) {
			rank='B';
		} else if (score >= 70) {
			rank='C';
		} else if (score >= 60) {
			rank='D';
		} else {
			rank='F';
		}
		
		System.out.printf("당신의 점수는 %d이고 등급은 %c입니다.", score,rank);

	}

	public void test3() {
		// 위의 문제에 각 등급별 중간 점수 이상의 경우에는
		// 등급에 "+"를 추가하여 출력
		// ex) 95ㅈㅁ 이상은 등급이 A+로 출력되게 함

		Scanner sc = new Scanner(System.in);

		System.out.print("점수를 입력하세요. :");
		int score = sc.nextInt();

		if (score >= 90) {
			if (score >= 95) {
				System.out.println(score + "은 A+등급 입니다.");
			} else {
				System.out.println(score + "은 A등급 입니다.");
			}
		} else if (score >= 80) {
			if (score >= 85) {
				System.out.println(score + "은 B+등급 입니다.");
			} else {
				System.out.println(score + "은 B등급 입니다.");
			}
		} else if (score >= 70) {
			if (score >= 75) {
				System.out.println(score + "은 C+등급 입니다.");
			} else {
				System.out.println(score + "은 C등급 입니다.");
			}
		} else if (score >= 60) {
			if (score >= 65) {
				System.out.println(score + "은 D+등급 입니다.");
			} else {
				System.out.println(score + "은 D등급 입니다.");
			}
		} else {
			System.out.println(score + "은 F등급 입니다.");
		}
	}
}
