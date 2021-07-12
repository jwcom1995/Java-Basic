package com.test01;

public class Variable01 {
	// 타입 변수명 = 값 ;
	// 타입 : 생성할 변수에 어떤 종류의 값이 들어갈지 타입을 지정
	// 변수명 : 변수의 이름
	// 값 : 변수에 들어갈 데이터
	public static void main(String[] args) {
		
		//1. 메소드 실행 준비
		Variable01 test = new Variable01();
		// 클래스명  변수명 = new 클래스명();
		
		//2. 메소드 실행
		test.declareVariable();
		//변수명.메소드명();
		
		test.initVariable();
	}
	public void declareVariable() {
		
		//숫자
		//정수
		byte bnum;
		short snum;
		int inum;
		long lnum;
		
		//실수
		float fnum;
		double dnum;
		
		//논리형
		boolean isTrue;
		
		//문자형
		char ch;
		
		//문자열(참조형)
		String str;

		//--------------
		bnum = 1;
		snum = 2;
		inum = 4;
		lnum = 8L;
		
		fnum = 4.0F;
		dnum = 8.0;
		
		isTrue = true; //true or false
		
		ch = 'A';
		str = "A";
		
		//------------------------------------------
		
		System.out.println(bnum);
		System.out.println(snum);
		System.out.println(inum);
		System.out.println(lnum);
		
		System.out.println(fnum);
		System.out.println(dnum);
		
		System.out.println(isTrue);
		
		System.out.println(ch);
		System.out.println(str);
	}
	
	public void initVariable() {
		
		byte bnum = 1;
		short snum = 2;
		int inum = 4;
		long lnum = 8L;
		
		float fnum= 4.0f;
		double dnum = 8.0;
		
		boolean isTrue = true;
		
		char ch = 'A';
		
		String str = "안녕하세요";
		
		System.out.println(bnum);
		System.out.println(snum);
		System.out.println(inum);
		System.out.println(lnum);
		
		System.out.println(fnum);
		System.out.println(dnum);
		
		System.out.println(isTrue);
		
		System.out.println(ch);
		System.out.println(str);
		
		
		
		
	}
}
