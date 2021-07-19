package com.test01.chap04.constructor;

import java.util.Date;

public class User {
	private String id;
	private String pw;
	private String name;
	private Date date;
	
	public User() {}
	
	public User(String id, String pw, String name, Date date) {
//		this.id=id;
//		this.pw=pw;
//		this.name=name;
		this(id,pw,name);
		this.date=date;
	}
	
	public User(String id, String pw, String name) {
		this.id=id;
		this.pw=pw;
		this.name=name;
	}

	public User(String id, String pw) {
		this.id=id;
		this.pw=pw;
	}
	
	public void information() {
		System.out.println("id : "+id+",name : "+name+", pw : "+pw+", date : "+date);
	}
	
	//setter&getter
	
	public void setId(String id) {
		this.id=id;
	}	
	public String getId() {
		return this.id;
	}
	
	public void setPw(String pw) {
		this.pw=pw;
	}
	public String getPw() {
		return this.pw;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}

	public void setDate(Date date) {
		this.date=date;
	}
	public Date getDate() {
		return this.date;
	}
}