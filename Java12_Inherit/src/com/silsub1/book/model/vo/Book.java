package com.silsub1.book.model.vo;

import javax.print.attribute.standard.JobKOctets;

public class Book {
	private String title;
	private String author;
	private int price;
	
	public Book() {}
	
	public Book(String title) {
		this.title=title;
	}

	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return this.title+", "+this.author+", "+price;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(this==obj) {
			return true;
		}
		
		if(obj==null) {
			return false;
		}
		
		Book bk = (Book)obj;
		if(author==null) {
			if(bk.author!=null) {
				return false;
			}
		}
		else if(!this.author.equals(bk.author)) {
			return false;
		}
		
		if(title==null) {
			if(bk.title!=null)
				return false;
		} else if(!title.equals(bk.title)) {
			return false;
		}
		
		if(price !=bk.price) {
			return false;
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		return (author+title+price).hashCode();
	}
}
