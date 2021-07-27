package com.kh.collection.silsub3.model.vo;

public class Book implements Comparable {
	private String bNo;	 //도서번호
	private int category;	//장르분류 번호
	private String title;	//도서 제목
	private String author;	//도서 저자
	
	public Book() {}

	public Book( int category, String title, String author) {
	
		this.category = category;
		this.title = title;
		this.author = author;
	}

	public String getbNo() {
		return bNo;
	}

	public void setbNo(String bNo) {
		this.bNo = bNo;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
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

	@Override
	public String toString() {
		String str = "Book [도서번호=" + bNo + ", 카테고리=";
		switch(category) {
		case 1:
			str+="인문";
			break;
		case 2:
			str+="자연과학";
			break;
		case 3:
			str+="의로";
			break;
		default:
			str+="기타";
		}
		str +=", 책제목=" + title + ", 작가=" + author + "]";
		return  str;
	}
	@Override
	public int compareTo(Object arg0) {
		String otherTitle = ((Book)arg0).getTitle();
		return (title.compareTo(otherTitle));
	}
	
	
	
}
