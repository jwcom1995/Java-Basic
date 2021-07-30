package com.kh.collection.silsub2.view;

import java.util.Iterator;
import java.util.Scanner;

import com.kh.collection.silsub2.controller.BookManager;
import com.kh.collection.silsub2.model.vo.Book;

public class BookMenu {

	private Scanner sc = new Scanner(System.in);
	private BookManager bm = new BookManager();

	public BookMenu() {
	}

	public void mainMenu() {
		boolean run = true;
		while (run) {
			System.out.println();
			System.out.println("*** 도서 관리 프로그램 ***");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서정보 정렬 후 출력");
			System.out.println("3. 도서 삭제");
			System.out.println("4. 도서 검색 출력");
			System.out.println("5. 전체 출력");
			System.out.println("6. 끝내기");
			System.out.println("----------------------");
			System.out.print("메뉴 번호 선택 : ");
			int menuNum = sc.nextInt();
			System.out.println();
			switch (menuNum) {
			case 1:
				System.out.println("[1] 새 도서 추가");
				bm.addBook(inputBook());
				break;
			case 2:
				System.out.println("[2] 도서정보 정렬 후 출력");
				bm.printBookList(bm.sortedBookList());
				break;
			case 3:
				System.out.println("[3] 도서 삭제");
				if(bm.deleteBook(inputBookNo())==1) {
					System.out.println("성공적으로 삭제");
				} else {
					System.out.println("삭제할 글이 존재하지 않음");
				}
				break;
			case 4:
				System.out.println("[4] 도서 검색 출력");
				String title =inputBookTitle();
				if(bm.searchBook(title)==-1) {
					System.out.println("조회한 글이 존재하지 않음");
				} else {
					System.out.println(bm.selectBook(bm.searchBook(title)));
				}
				break;
			case 5:
				System.out.println("[5] 전체 출력");
				if(bm.selectAll().isEmpty()) {
					System.out.println("없습니다.");
				}else {
					Iterator<Book> itr = bm.selectAll().iterator();
					while(itr.hasNext()) {
						System.out.println(itr.next());
					}
				}
				break;
			case 6:
				System.out.println("[6] 끝내기");
				System.out.println("검색을 종료합니다.");
				run=false;
				break;
			default:
				System.out.println("잘못된 값을 입력하였습니다.");
			}
		}
	}

	public Book inputBook() {
		System.out.print("도서 제목 : ");
		String bookName = sc.next();
		System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 /4:기타) : ");
		int bookCategory = sc.nextInt();
		System.out.print("도서 저자 : ");
		String author = sc.next();
		Book newBook = new Book(bookCategory, bookName, author);
		return newBook;
	}

	public int inputBookNo() {
		System.out.print("도서 번호 : ");
		int bNo = sc.nextInt();
		return bNo;
	}

	public String inputBookTitle() {
		System.out.print("도서 제목 : ");
		String bookName = sc.next();
		return bookName;
	}
}
