package com.test01.chap03.test01;

//변수 선언 위치에 따른 구분
public class Variable01 { //클래스 영역의 시작

	//클래스 여역에 작성하는 변수를 필드
	//필드 == 멤버변수(클래스가 가지는 멤버라는 의미) == 전역변수(클래스 전역에서 사용할 수 있는 변수라는 의미)
	private int globalNum;
	
	public void testMethod(int num) {//메소드 영역의시작
		//메소드 영역에서 작성하는 변수를 지역변수
		int localNum=0;
		
		System.out.println(num);
		
		//지역변수는 초기화가 되어 있어야 사용 가능하다.
		System.out.println(localNum);
		

		System.out.println(globalNum);
	}//메소드 영역의 끝
	
	public void testMethod2() {
		System.out.println(globalNum);
//		System.out.println(localNum);    //다른 블럭에서 생성되었으므로 사용 불가능
		
		for(int i = 0 ; i < 5 ; i++) {}
		
		//System.out.println(i);        //영역 밖
	}
}//클래스영역의 끝
