package com.test01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Variable02 {
	
	public static void main(String[] args) {
		
		Variable02 test = new Variable02();
		
		//test.input1();
		test.input2();
	}
	
	public void input1() {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("정수 값 한 개를 입력 하세요: ");
		String value;
		
		try {
			value = br.readLine();  //문자열 형태로 저장
			
			//System.out.println("계산 결과:"+(value*3));  문자열 값은 * 할 수 없음
			
			int no = Integer.parseInt(value);  //문자열 형태의 숫자를 실제 숫자 데이터로 변환
			
			System.out.println("계산 결과:"+(no*3));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void input2() {
		
		
		java.util.Scanner sc = new java.util.Scanner(System.in); //import를 사용하지 않더라도 사용 가능
		
		System.out.print("Name: ");
		String name = sc.nextLine();  //한 줄을 문자열로 읽어온다.
		
		System.out.print("Age: ");
		int age = sc.nextInt(); //정수 값을 읽어온다.
		
		System.out.print("Height(소수점 첫째 자리까지): ");
		double height = sc.nextDouble();
		
		System.out.print("Gender(F/M): ");
		sc.nextLine();  //enter키를 입력받기 때문에 한라인 더 작성하여 오류해결 or sc.next().charAt(0)으로 값을 입력받음
		char gender = sc.nextLine().charAt(0);
		
		System.out.println(name+"님은 "+ age +"세 이며, 키는 " +height+"cm이며 성별은 "+gender+" 입니다.");
	}
}
