package com.test01.chap01;

public class Score {

	private String name="이창진";
	private int kor = 90;
	private int eng = 84;
	private int math = 97;
	
	
	//총합을 구해 출력하는 메소드
	public void sum() {
		int sum = kor+eng+math;
		
		System.out.println("점수의 총합 : "+sum);
	}
	
	//평균을 구해 출력하는 메소드
	public void avg() {
		double avg = (kor+eng+math)/3;
		System.out.println("점수의 평균 : "+avg);
	}
	
	//평균점수를 구해 등급을 출력하는 메소드
	public void grade() {
		double avg = (kor+eng+math)/3;
		
		if(avg>=90) {
			System.out.println("A등급 입니다.");
		} else if(avg>=80) {
			System.out.println("B등급 입니다.");
		} else if(avg>=70) {
			System.out.println("C등급 입니다.");
		} else if(avg>=60) {
			System.out.println("D등급 입니다.");
		} else {
			System.out.println("F등급 입니다.");
		}
	}
	
	public void prn() {
		System.out.println("이름 : "+name);
		System.out.println("국어 점수 : "+kor);
		System.out.println("영어 점수 : "+eng);
		System.out.println("수학 점수 : "+math);
	}
}
