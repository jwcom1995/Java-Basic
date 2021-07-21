package com.silsub2.person.controller;

import java.util.Scanner;

import com.silsub2.person.model.vo.Person;

public class TestPersonArray {

	public static void main(String[] args) {
		Person[] ps = new Person[5];
		
		Scanner sc = new Scanner(System.in);
		String name;
		int age,height;
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println((i+1)+"번째 사람 정보를 입력하세요");
			System.out.print("이름 : ");
			name=sc.next();
			System.out.print("나이 : ");
			age=sc.nextInt();
			System.out.print("키 : ");
			height=sc.nextInt();
			ps[i]=new Person(name,age,height);
		}
		int sumAge=0;
		int sumHeight=0;
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println(ps[i].information());
			System.out.println();
			sumAge+=ps[i].getAge();
			sumHeight+=ps[i].getHeight();
		}
		System.out.println("나이 평균 :"+ (sumAge/5));
		System.out.println("키 평균 :"+ (sumHeight/5));
	}

}
