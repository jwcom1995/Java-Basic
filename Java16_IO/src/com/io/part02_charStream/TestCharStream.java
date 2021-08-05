package com.io.part02_charStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestCharStream {
	public void fileSave() {
		FileWriter fw = null;
		
		try {
			fw=new FileWriter("sample2.txt");
			
			fw.write("우리나라 대한민국");
			fw.write(78);
			fw.write(' ');
			char[] carr = {'a','p','p','l','e'};
			fw.write(carr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void fileOpen() {
		FileReader fr = null;
		
		try {
			fr = new FileReader("sample2.txt");
			
			int val=0;
			while((val=fr.read())!=-1) {
				System.out.println((char)val);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
