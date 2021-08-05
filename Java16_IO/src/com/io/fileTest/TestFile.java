package com.io.fileTest;

import java.io.File;
import java.io.IOException;
public class TestFile {

	public static void main(String[] args) {
		//File 클래스
		File file = new File("person.txt");
		System.out.println("파일명: "+file.getName());
		System.out.println("저장경로: "+file.getPath());
		System.out.println("저장경로: "+file.getAbsolutePath());
		System.out.println("파일용량: "+file.length());
		System.out.println("상위폴더: "+file.getParent());

		try {
			boolean b =file.createNewFile();	//생성
			System.out.println(b);
		
			boolean b1 = file.delete();			//삭제
			System.out.println(b1);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
