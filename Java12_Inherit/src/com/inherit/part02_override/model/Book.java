package com.inherit.part02_override.model;

public class Book {
	private String bookName;
	private String writer;
	private int price;
	
	public Book() {}

	public Book(String bookName, String writer, int price) {
		super();
		this.bookName = bookName;
		this.writer = writer;
		this.price = price;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return this.bookName+", "+this.price+", "+this.writer;
	}
	
	@Override
	public boolean equals(Object obj) {
		//객체의 주소가 같으면 같은 객체
		if(this ==obj) {
			return true;
		}
		
		if(obj == null) {
			return false;
		}
		
		//각 필드별로 비교
		Book other=(Book)obj;
		
		//제목
		if(bookName == null) {
			if(other.bookName!=null) {
				return false;
			}
		} else if(!bookName.equals(other.bookName)) {
			return false;
		}
		
		//작가
				if(writer == null) {
					if(other.writer!=null) {
						return false;
					}
				} else if(!writer.equals(other.writer)) {
					return false;
				}
				
		//가격
				if(price != other.price) {
					return false;
				}
		return true;
	}
	//3.hash code
	@Override
	public int hashCode() {
		return (writer+price+bookName).hashCode();
	}
}
