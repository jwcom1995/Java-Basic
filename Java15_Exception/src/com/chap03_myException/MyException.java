package com.chap03_myException;

public class MyException extends Exception{
	MyException(){
		System.out.println("내가 만든 예외 클래스다!!");
	}

	public MyException(String msg) {
		super(msg);
	}
}
