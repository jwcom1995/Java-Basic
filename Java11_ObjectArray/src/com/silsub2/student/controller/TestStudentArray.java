package com.silsub2.student.controller;

import java.util.Scanner;

import com.silsub2.student.model.vo.Student;

public class TestStudentArray {

	public static void main(String[] args) {
		Student[] st = new Student[10];
		Scanner sc = new Scanner(System.in);

		boolean act = true;
		int count = 0 ;
		char ch;
		boolean con = true;
		
		int sumKor=0;
		int sumEng=0;
		int sumMath=0;
		
		while(act) {
			
			System.out.println("-------"+(count+1)+"번째 학생 정보 입력-------");
			
			st[count]=new Student();
			
			System.out.print("학년 : ");
			st[count].setGrade(sc.nextInt());
			System.out.print("반 : ");
			st[count].setClassroom(sc.nextInt());
			System.out.print("이름 : ");
			st[count].setName(sc.next());
			
			System.out.print("국어점수 : ");
			int kor =sc.nextInt();
			sumKor+=kor;
			st[count].setKor(kor);
			
			System.out.print("영어점수 : ");
			int eng =sc.nextInt();
			sumEng+=eng;
			st[count].setEng(eng);
			
			System.out.print("수학점수 : ");
			int math =sc.nextInt();
			sumMath+=math;
			st[count].setMath(math);
			
			count++;			
			System.out.println();
			
			//추가 입력 여부
			while(con) {
				System.out.print("계속 입력 하시겠습니까?(Y/N) : ");
				System.out.println();
			
				ch=sc.next().charAt(0);
			
				if(Character.toLowerCase(ch)=='y') {
					act=true;
					break;
				} else if(Character.toLowerCase(ch)=='n') {
					System.out.println("입력을 종료합니다.");
					act=false;
					break;
				} else {
					System.out.println("올바른 값을 입력하시오.");
				}
			}
			
		}
		
		//학생들의 평균 점수 구하기
		
		double avgKor = sumKor/count;
		double avgEng = sumEng/count;
		double avgMath = sumMath/count;
		double avgAll = (avgKor+avgEng+avgMath)/3;
		
		System.out.println();
		System.out.println();
		System.out.println("====== 입력된 학생들의 평균점수 ======");
		System.out.println("국어 평균점수 :"+avgKor+"점");
		System.out.println("영여 평균점수 : "+ avgEng+"점"); 
		System.out.println("수학 평균점수 : "+avgMath+"점"); 
		System.out.println("전체 평균점수 : "+avgAll+"점 입니다.");
		System.out.println();
		
		System.out.println();
		System.out.println("------- 입력된 학생들의 정보 -------");
		for(int i = 0 ; i < count ; i++) {
			System.out.println(st[i].information());
		}
	}

}
