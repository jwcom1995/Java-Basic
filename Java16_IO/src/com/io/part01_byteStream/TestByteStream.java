package com.io.part01_byteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
public class TestByteStream {
	public void fileSave() {
		FileOutputStream fout=null;
		
		try {
			fout=new FileOutputStream("sample.txt");
			
			fout.write(97);
			byte[] bar = {10,98,99,100,101,102};
			fout.write(bar);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {	//성공하든 실패하든 실행			
			try {
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void fileOpen() {
		FileInputStream fin = null;
		
		try {
			fin=new FileInputStream("sample.txt");
			
		/*	int fileSize=(int)new File("sample.txt").length();
		
			byte[] bar = new byte[fileSize];
			
			fin.read(bar);
			
			for(int i = 0 ; i<bar.length;i++) {
				System.out.print((char)bar[i]+" ");
			} */ //한번에 출력 
			
			int info = fin.read();
			
			while(info!=-1) {
				System.out.print((char)info+" ");
				info = fin.read();
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
