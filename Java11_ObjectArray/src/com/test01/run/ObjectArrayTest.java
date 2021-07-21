package com.test01.run;

import java.util.Scanner;

import com.test01.model.dto.Book;

public class ObjectArrayTest {

	public static void main(String[] args) {
		//선언 및 할당
		Book[] bk = new Book[3];

		//초기화
		bk[0] = new Book("자바의 정석", "홍길동","나무",10000);
		bk[1] = new Book("c언어의 정석","김길동","KH",20000);
		bk[2] = new Book("프로그래밍", "박길동","바다",30000);
		
		//선언 및 할당과 동시에 초기화
		Book[] bk2 = { 	new Book("자바의 정석", "홍길동","나무",10000),
						new Book("c언어의 정석","김길동","KH",20000),
						new Book("프로그래밍", "박길동","바다",30000)
					};
		
//		System.out.println(bk);
//		System.out.println(bk[0]);
//		System.out.println(bk[0].getPrice());
//		
//		System.out.println("도서 갯수 : "+bk.length);
		
		//도서 출력
		for(int i =0 ; i<bk.length;i++) {
			System.out.println(bk[i].information());
		}
		
		//도서 검색
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 책 제목: ");
		String sTitle = sc.nextLine();
		
		for(int i =0 ; i<bk.length;i++) {
			if(bk[i].getTitle().equals(sTitle)) {
				System.out.println(bk[i].information());
			}
		}
		
	}

}
