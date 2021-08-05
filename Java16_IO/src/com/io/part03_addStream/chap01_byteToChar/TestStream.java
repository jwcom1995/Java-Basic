package com.io.part03_addStream.chap01_byteToChar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestStream {
	public void input() {
		
		//new 보조스트림 (new 보조스트림(new 기반스트림("외부자원 경로")));
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //System.in은 inputStream
		
		try {
			System.out.print("문자열 입력:");
			String value = br.readLine();

			System.out.println("value: "+value);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void output() {
		//new 보조스트림(new 보조스트림(new 기반스트림("외부자원")));
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			bw.write("java oracle jdbc");
			
	//		bw.flush();  //bw.close() 작성하지 않으면 출력 안됨 bw.flush 로 출력
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}			
		}
		
	}
}
