package com.kh.collection.silsub3.model.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.kh.collection.silsub3.model.vo.Book;

public class BookDao {
	private HashMap<String, Book> bookMap = new HashMap<>();

	public BookDao() {
	}

	public BookDao(HashMap<String, Book> bookMap) {
		this.bookMap = bookMap;
	}

	public int getLastBookNo() {
		return bookMap.size()-1;
	}

	public void addBook(Book book) {
		bookMap.put(book.getTitle(), book);
	}

	public Book deleteBook(String key) {
		Set<String> kSet = bookMap.keySet();
		Iterator<String> itr = kSet.iterator();
		
		while (itr.hasNext()) {
			if(itr.next().equals(key)) {
				Book bk = bookMap.get(key);
				bookMap.remove(key);
				return bk;
			}
		}
		return null;
		
	}

	public String searchBook(String title) {
		Set<Map.Entry<String,Book>> eSet = bookMap.entrySet();
		Iterator<Map.Entry<String,Book>> eItr = eSet.iterator();
		
		while(eItr.hasNext()) {
			Map.Entry<String, Book> me = eItr.next();
			if(me.getKey().equals(title)) {
				return me.getKey();
			}
		}
		return null;
	}

	public Book selectBook(String key) {
		return bookMap.get(key);
	}

	public HashMap<String,Book> selectAll() {
		return bookMap;
	}

	public ArrayList<Book> sortedBookList() {
		Set<Map.Entry<String, Book>> eSet=bookMap.entrySet();
		Iterator<Map.Entry<String, Book>> eItr=eSet.iterator();
		ArrayList<Book> bookList=new ArrayList();
		while(eItr.hasNext()) {
			Map.Entry<String,Book> me=eItr.next();
			bookList.add(me.getValue());
		}
		bookList.sort(null);
		return bookList;
	}

}
