package com.chap02_throws;

import java.io.IOException;

public class MTest {
	
	public static void main(String[] args) /*throws IOException*/{
		try {
			methodA();
		}catch(IOException e) {
			System.out.println("main()에서 처리");
		}
		System.out.println("이것도 처리");
	}
	
	public static void methodA() throws IOException{
		methodB();
	}
	public static void methodB() throws IOException{
		methodC();
	}
	public static void methodC() throws IOException {
		throw new IOException();
	}
	
	
}
