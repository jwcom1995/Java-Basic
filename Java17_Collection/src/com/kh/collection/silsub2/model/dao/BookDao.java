package com.kh.collection.silsub2.model.dao;

import java.util.ArrayList;

import com.kh.collection.silsub2.model.comparator.AscCategory;
import com.kh.collection.silsub2.model.vo.Book;

public class BookDao {
	private ArrayList<Book> bookList=new ArrayList<>();
	
	public BookDao() {}

	public BookDao(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}
	public int getLastBookNo() {
		return bookList.size()-1;
	}
	public void addBook(Book book) {
		bookList.add(book);
	}
	public int deleteBook(int no) {
		for(int i = 0 ; i < bookList.size();i++) {
			if(bookList.get(i).getbNo()==no) {
				bookList.remove(i);
				return 1;
			}
		}
		return 0;
	}
	public int searchBook(String title) {
		for(int i = 0 ; i < bookList.size();i++) {
			if(bookList.get(i).getTitle().equals(title)) {				
				return i;
			}
		}
		return -1;
	}
	public Book selectBook(int index) {
		return bookList.get(index);
	}
	public ArrayList<Book> selectAll(){
		return bookList;
	}
	public ArrayList<Book> sortedBookList(){
		bookList.sort(new AscCategory());
		return bookList;
	}
	
}
