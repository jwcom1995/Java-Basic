package com.io.part03_addStream.chap04_object;

import java.io.Serializable;

public class Member implements Serializable {
	
	private static final long serialVersionUID =1L;	//클래스가 수정이 되더라도 버젼 ID=1로 고정, JVM이 맘대로 버젼을 바꾸는걸 방지
	
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	private double point;
	
	//생성자(기본, 매개변수), getter&setter, toString
	
	public Member() {}

	public Member(String userId, String userPwd, String userName, int age, char gender) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.age = age;
		this.gender = gender;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Member [userId=" + userId + ", userPwd=" + userPwd + ", userName=" + userName + ", age=" + age
				+ ", gender=" + gender + "]";
	}
	
}
