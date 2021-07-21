package com.test01.run;

import java.util.Scanner;

import com.test01.model.dto.Book;

public class ObjectTest {

	public static void main(String[] args) {
		Book bk1 = new Book("자바의 성적","홍길동","KH",10000);
		Book bk2 = new Book("C언어 성적","김길동","kH",20000);
		Book bk3 = new Book("프로그래밍","박길동","kh",30000);
		
		//출력
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());

		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 책 제목 : ");
		String sTitle = sc.nextLine();
		
		if(bk1.getTitle().equals(sTitle)) {
			System.out.println(bk1.information());
		} else if(bk2.getTitle().equals(sTitle)) {
			System.out.println(bk2.information());
		} else if(bk3.getTitle().equals(sTitle)) {
			System.out.println(bk3.information());
		}
	}

}
