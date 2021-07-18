package com.test01;

import java.util.Scanner;

public class ForTest01 {

	public static void main(String[] args) {
		//ForTest01.test1();
		//ForTest01.test2();
		//ForTest01.test3();
		
		ForTest01 test = new ForTest01();
		//test.test4();
		test.test5();
	}
	
	public static void test1() {
		//0~10 출력
		
		int no = 0;
		
		while(no<=10) {
			System.out.println(no);
			no++;
		}
		
		for(int i = 0 ; i <= 10 ; i++) {
			System.out.println(i);
		}
	}
	
	public static void test2() {
		
		for(int i = 100 ; i > 0 ; i--) {
			if (i%10==0) {
			System.out.println();
			}
			System.out.print(i+" ");
		}
		
	}
	
	public static void test3() {
		
		for(int i = 1 ; i < 10 ; i+=2) {			
			System.out.println(i+"번째 출력");			
		}		
		System.out.println();
		
		for(int i = 0 , j = 10 ; i < 10 && j >0 ; i++, j--) {
			System.out.println( i + "번째 출력");
			System.out.println( j + "번째 출력");
		}
		System.out.println();
		
		int i = 1 ;
		for(;;) {
			System.out.print(i+" ");
			i++;
		}
	}
	
	public void test4() {
		// 1부터 100사이의 임의의 난수 하나를 구한 다음.
		// 0~ 난수 가지의 합계를 구한다.
		
		int ran = (int)(Math.random()*100+1);
		System.out.println("임의의 난수 : "+ran);
		
		int sum = 0;
		
		for(int i = 0 ; i < ran ; i++) {
			sum+=i;
		}
		
		System.out.println("0 ~ "+ran+" 까지의 합 : "+ sum);
	}
	
	public void test5() {
		// 정수 두개 입력 후
		// 작은수 ~ 큰수 까지의 합을 구해 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int numA = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int numB = sc.nextInt();
		
		if (numB<numA) {
			int s = numA;
			numA = numB;
			numB = s;
		}
		
		int sum = 0;
		
		for (int i = numA ; i <=numB ; i ++) {
			sum+=i;
		}
		
		System.out.println(numA+"~ "+numB+" 까지의 합 : "+sum);
	}
}
