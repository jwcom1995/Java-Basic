package com.arrayPractice1.sample;

import java.util.Random;
import java.util.Scanner;

public class ArraySample {

	public void test1() {
		
		int[] arr = new int[10];
		Random ran = new Random();
		
		int sum=0;
		
		System.out.print("배열 값 : ");
		for(int i  = 0 ; i < arr.length ; i++) {
			arr[i]=ran.nextInt(100)+1;
			System.out.print(arr[i]+" ");
			sum +=arr[i];
		}
		System.out.println();
		
		System.out.println("배열 값들의 합 : "+sum);
		
	}
	
	public void test2() {
		
		int[] arr = new int [10];
		
		System.out.print("배열 값 : ");
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i]=(int)(Math.random()*100+1)+1;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		
		int max = 1; 
		int min = 100;
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		
		System.out.println("가장 큰 값 : "+max);
		System.out.println("가장 작은 값 : "+min);
		
	}
	
	public void test3() {
		
		byte[] barr = new byte[10];
		Random ran = new Random();
		
		System.out.print("배열 값 : ");
		for(int i = 0 ; i < barr.length ; i++) {
			barr[i]=(byte)(ran.nextInt(Byte.MAX_VALUE));
			System.out.print(barr[i]+" ");
		}
		System.out.println();
		
		int sum = 0;
		for(int i = 0 ; i < barr.length ; i++) {
			if(barr[i]%2==0)
				sum+=barr[i];
		}
		
		System.out.println("배열 값 중 짝수의 합 : "+sum);
	}
	
	public void test4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력(숫자만) : ");
		String input = sc.next();
		
		int sum=0;
		for(int i = 0 ; i < input.length() ; i++) {
			sum+=Integer.parseInt(input.substring(i, i+1));
		}
		System.out.println("합계 : "+sum);
	}

	public void test5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력(숫자만) : ");
		String input = sc.next();
		
		int sum=0;
		for(int i = 0 ; i < input.length() ; i++) {
			sum+=(int)(input.charAt(i)-'1'+1);
		}
		
		System.out.println("합계 : "+sum);
	}
}
