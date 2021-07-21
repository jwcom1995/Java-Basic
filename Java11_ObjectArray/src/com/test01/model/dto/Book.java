package com.test01.model.dto;

public class Book {
	//필드
	private String title;
	private String writer;
	private String publisher;
	

	private int price;
	
	//생성자(기본, 매개변수)
	public Book() {}
	
	public Book(String title, String writer, String publisher, int price) {
		this.title=title;
		this.writer=writer;
		this.publisher=publisher;
		this.price=price;
	}
	
	//getter & setter
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getWriter() {
		return writer;
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	//information
	public String information() {
		return title+", "+writer+", "+publisher+", "+price;
	}
	
}
