package com.io.part03_addStream.chap02_buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestBuffer {
	
	public void input() {
		
		BufferedReader br = null;
		
		try {
			br=new BufferedReader(new FileReader("sample3.txt"));
		
			String tmp=null;
			while((tmp=br.readLine())!=null) {
				System.out.println(tmp);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}	
	public void output() {
			
		BufferedWriter bw = null;
		try {
			bw=new BufferedWriter(new FileWriter("sample3.txt"));
			bw.write("안녕하세요\n");
			bw.write("반갑습니다\n");
			bw.write("안녕하세요\n");
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
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
