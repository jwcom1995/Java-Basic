package com.chap01_runtime;

import java.util.Scanner;

public class RunExcep {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		//new RunExcep().ArithEx();
		new RunExcep().ClassNArrayEx();
	}
	
	public void ArithEx() {
		int ran=0;
		int result=0;
		
		while(true) {
			System.out.print("나눌 수 입력:");
			int inputNum=sc.nextInt();
			
			if(inputNum==0) {
				System.out.println("0을 입력했습니다. 프로그램 종료!");
		
			}else {
				ran = (int)(Math.random()*10)+1;
				result=ran/inputNum;
				System.out.printf("%d / %d = %d\n",ran,inputNum,result);
		
			}
		}
	}
	
	public void ClassNArrayEx() {
		//ClassCastException
	/*	Object obj = 'a';
		System.out.println(obj);
		String str=(String)obj;
		System.out.println(str); */
		
		//ArrayIndexOutOfBoundsException
	/*	int[] arr= new int [2];
		arr[0] = 1;
		arr[1] = 2;
		
		arr[2] = 3;
		System.out.println("실행가능?"); */
		
		//NullPointerException
		try {
			String str = null;
			int length = str.length();
			System.out.println("실행안됨");
		}catch(NullPointerException e) {
			System.out.println("null 입니다.");
		}finally {
			System.out.println("무조건 실행");
		}
		
		
		
	}
}
