package com.test01.inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetTest {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress addr = InetAddress.getLocalHost();
		
		System.out.println(addr);
		
		InetAddress[] naver = InetAddress.getAllByName("www.google.com");
		
		for(int i = 0 ; i < naver.length;i++) {
			System.out.println(naver[i].getHostName()+":"+naver[i].getHostAddress());
		}
		
		
	}
}
