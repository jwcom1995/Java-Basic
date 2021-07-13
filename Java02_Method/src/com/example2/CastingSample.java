package com.example2;

import java.util.Scanner;

public class CastingSample {

	public void printUniCode() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.println(ch+" is unicode "+(int)ch);
	}
	
	public void calculatorScore() {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double scoreA = sc.nextDouble();
		System.out.print("영어 : ");
		double scoreB = sc.nextDouble();
		System.out.print("수학 : ");
		double scoreC = sc.nextDouble();
		
		int sum = (int)(scoreA + scoreB + scoreC);
		int avg = (int)((scoreA + scoreB + scoreC)/3);
		
		System.out.println();
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+avg);
	}
}
