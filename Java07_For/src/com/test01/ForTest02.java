package com.test01;

import java.util.Scanner;

public class ForTest02 {

	public static void main(String[] args) {
		//ForTest02.test1();
		//ForTest02.test2();
		//ForTest02.test3();
		ForTest02.test4();
	}
	
	public static void test1() {
		for( int i = 0 ; i < 10 ; i ++) {
			for(int j = 0 ; j < 5  ; j++) {
				System.out.println("i = "+i +", j = "+j);
			}
			System.out.println();
		}		
	}

	public static void test2() {
		//for문을 중첩하여 구구단 출력
		
		for (int dan = 2 ; dan < 10 ; dan ++) {
			for (int su = 1 ; su < 10 ; su ++){
				System.out.println(dan + " * " +su+" = "+(dan*su));
			}
			System.out.println();
		}
		
		//for문 1개로 작성
		int su = 1;
		for (int dan = 2 ; dan < 10 ; dan ++) {
			while(su<10) {
				System.out.println(dan + " * " +su+" = "+(dan*su));
				su++;
			}
			System.out.println();
			su=1;
		}
	}
	
	public static void test3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출력할 줄 수 : ");
		int row = sc.nextInt();
		
		System.out.print("출력할 칸 수 : ");
		int col = sc.nextInt();
		
		for(int r= 1 ; r <=row; r++) {
			//'*'문자를 5번 출력
			for (int c= 1 ; c <=col ; c++) {
				System.out.print("*");
			}
			System.out.println();		
		}			
	}
	
	public static void test4() {
		//별표문자를
		//입력된 줄수와 칸수 만큼 출력
		//단, 아래와 같이 출력해보자.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출력할 줄 수 : ");
		int row = sc.nextInt();
		
		System.out.print("출력할 칸 수 : ");
		int col = sc.nextInt();
		
		for(int r= 1 ; r <=row; r++) {
			//'*'문자를 5번 출력
			for (int c= 1 ; c <=col ; c++) {
				if(r==c) {
					System.out.print(r);
				}else {
				System.out.print("*");
				}
			}
			System.out.println();		
		}	
		
	}
}
