package com.kh.collection.silsub3.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.kh.collection.silsub3.model.dao.BookDao;
import com.kh.collection.silsub3.model.vo.Book;

public class BookManager {
	private BookDao bd =new BookDao();
	private Scanner sc = new Scanner(System.in);
	
	public BookManager() {}
	
	public void addBook(Book book) {
		try {
		int lastNo=bd.getLastBookNo();
		book.setbNo(Integer.toString(lastNo+1));
		bd.addBook(book);
		} catch (IndexOutOfBoundsException e) {
			book.setbNo("0");
			bd.addBook(book);
		}
		
	}
	public Book deleteBook(String key) {
		return bd.deleteBook(key);
	}
	public String searchBook(String title) {
		return bd.searchBook(title);
	}
	public Book selectBook(String key) {
		return bd.selectBook(key);
	}
	public HashMap<String,Book> selectAll(){
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
