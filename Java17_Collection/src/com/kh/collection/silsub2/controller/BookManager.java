package com.kh.collection.silsub2.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.collection.silsub2.model.dao.BookDao;
import com.kh.collection.silsub2.model.vo.Book;

public class BookManager {
	private BookDao bd =new BookDao();
	private Scanner sc = new Scanner(System.in);
	
	public BookManager() {}
	
	public void addBook(Book book) {
		try {
		int lastNo=bd.getLastBookNo();
		book.setbNo(lastNo+1);
		bd.addBook(book);
		} catch (IndexOutOfBoundsException e) {
			book.setbNo(0);
			bd.addBook(book);
		}
	}
	public int deleteBook(int no) {
		return bd.deleteBook(no);
	}
	public int searchBook(String title) {
		return bd.searchBook(title);
	}
	public Book selectBook(int index) {
		return bd.selectBook(index);
	}
	public ArrayList<Book> selectAll(){
		return bd.selectAll();
	}
	public Book[] sortedBookList() {
		ArrayList<Book> sortedList = bd.sortedBookList();
		Book[] sortedBook= new Book[sortedList.size()];
		for(int i = 0 ; i < sortedBook.length;i++) {
			sortedBook[i]=sortedList.get(i);
		}
		return sortedBook;
	}
	public void printBookList(Book[] br) {
		for(Book bk :br) {
			System.out.println(bk.toString());
		}
	}
}
