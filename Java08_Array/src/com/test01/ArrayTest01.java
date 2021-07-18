package com.test01;

import java.util.Scanner;

public class ArrayTest01 {
	
	public void test01() {
		/*
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;
		
		int sum = 0;
		
		sum += num1;
		sum += num2;
		sum += num3;
		sum += num4;
		sum += num5; */
		
		int[] arr = new int[5];
		
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
		
		//반복문을 이용하여 값 대입
		int value = 10;
		for(int index = 0 ; index<arr.length ; index++) {
			arr[index]=value;
			value+=10;
		}
		
		int sum = 0;
		
//		sum += arr[0];
//		sum += arr[1];
//		sum += arr[2];
//		sum += arr[3];
//		sum += arr[4];
		
		//반복문을 이용하여 합 구하기
		
		for(int i = 0 ; i < arr.length; i++) {
			sum+= arr[i];
		}		
		
	}

	public void test02() {
		// 배열 사용 방법
		//선언
		//자료형[] 변수명;
		//자료형 변수명[];
		
		//int[] iarr;
		//char carr[];
		
		int iarr[]= new int[5];
		char[] carr = new char[10];
		
		System.out.println("iarr: "+ iarr);
		System.out.println("carr: "+ carr);
		
		//hashCode - 실제주소를 찾기위한 key역할
		System.out.println("iarr의 hashcode : "+ iarr.hashCode());
		System.out.println("carr의 hashcode : "+ carr.hashCode());
		
		//배열.length - 메서드가 아닌 필드값
		System.out.println("iarr의 길이: "+ iarr.length);
		System.out.println("carr의 길이: "+ carr.length);
		
		//스캐너를 통해 입력받은 정수로 배열의 길이를 지정하여 할당
		Scanner sc = new Scanner(System.in);
		
		System.out.print("새로 할당할 배열의 길이 : ");
		int size = sc.nextInt();
		
		double[] darr = new double[size];
		
		System.out.println("darr의 hashcode: "+ darr.hashCode());
		System.out.println("darr의 길이: "+ darr.length);
		
		darr = new double[30];
		
		System.out.println("수정 후 darr의 hashcode : "+ darr.hashCode());
		System.out.println("수정 후 darr의 길이 : "+ darr.length);
		
		//연결은 끊는 느낌
		darr = null;
		
		System.out.println("darr : "+ darr);
		System.out.println("darr의 길이 : "+ darr.length);
		
	}
	
	public void test03() {
		
		int[] iarr= new int[5];
		
		//배열 생성시 JVM에서 값을 설정해 둠
		//배열값이 존재하지 않을수는 없다.
		for(int i = 0 ; i < iarr.length ;i++) {
			System.out.println("iarr["+i+"]의 값 : "+iarr[i]);
			
		}
		
		int[] iarr2 = new int[] {11,22,33};
		System.out.println("iarr2의 길이: "+iarr2.length);
		
		String[] sarr = {"apple", "banana", "grape", "orange"};
		
		for(int i =0 ; i <sarr.length;i++) {
			System.out.println(sarr[i]);
		}
		
	}
}



