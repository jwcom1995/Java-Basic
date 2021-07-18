package com.silsub2.example;

import java.util.Scanner;

public class Exercise {
	
	public void exercise1() {
	
		int no = 1;
		int sum = 0;
		
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				
				System.out.print(no+"\t");
				
				if(i==j) {
					sum+=no;
				} else if(4-j==i){
					sum+=no;
				}
				no++;
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("두 대각선 X의 합 : "+sum);
	}
	
	public void exercise2() {
		
		int target = (int)(Math.random()*100)+1;
		
		int cnt = 1;
		
		boolean start = true;
		Scanner sc = new Scanner(System.in);
		
		while(start) {
			
			System.out.print("정수 하나를 입력해주세요 [1~100] : ");
			int num = sc.nextInt();
			
			if(num>target) {
				System.out.println("입력하신 정수보다 작습니다.");
			} else if(num<target) {
				System.out.println("입력하신 정수보다 큽니다.");
			} else {
				System.out.println("정답입니다. "+cnt+"회 만에 정답을 맞추셨습니다.");
				start=false;
			}
			
			System.out.println();
			cnt++;
		}
	}
}
