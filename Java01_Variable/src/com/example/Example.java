package com.example;
import java.util.Scanner;
public class Example {
	
	public void example1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int numA = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		int numB = sc.nextInt();
						
		System.out.println();
		System.out.println("==========계산결과==========");
		System.out.println("더하기 결과 : "+(numA+numB));
		System.out.println("빼기 결과 : "+(numA-numB));
		System.out.println("곱하기 결과 : "+(numA*numB));
		System.out.println("나누기한 몫 : "+(numA/numB));
		System.out.println("나누기한 나머지 : "+(numA%numB));
		System.out.println();				
	}
	
	public void example2() {
		
		Scanner sc = new Scanner(System.in);		
		sc.nextLine();
		
		System.out.print("가로 : ");
		double doubleA = sc.nextDouble();
		
		System.out.print("세로 : ");
		double doubleB = sc.nextDouble();		
		
		
		System.out.println();
		System.out.println("==========계산결과==========");
		System.out.println("면적 : "+(doubleA*doubleB));
		System.out.println("둘레 : "+((doubleA+doubleB)*2));
		System.out.println();
				
		
	}
	
	public void example3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하시오 : ");
		String str = sc.nextLine();
		
		System.out.println();
		System.out.println("첫번째 문자 : "+str.charAt(0));
		System.out.println("두번째 문자 : "+str.charAt(1));
		System.out.println("세번째 문자 : "+str.charAt(2));
		System.out.println();
		
	}
}
