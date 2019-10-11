package com.vir.model;

public class Student {
	private int sid;
	private String name;
	private String fathersName;
	private String aadharID;
	private int age;
	private String userName;
	private String password;
	public Student() {
		super();
	}
	public Student(int sid, String name, String fathersName, String aadharID, int age, String userName,
			String password) {
		super();
		this.sid = sid;
		this.name = name;
		this.fathersName = fathersName;
		this.aadharID = aadharID;
		this.age = age;
		this.userName = userName;
		this.password = password;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFathersName() {
		return fathersName;
	}
	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}
	public String getAadharID() {
		return aadharID;
	}
	public void setAadharID(String aadharID) {
		this.aadharID = aadharID;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", fathersName=" + fathersName + ", aadharID=" + aadharID
				+ ", age=" + age + ", userName=" + userName + ", password=" + password + "]";
	}
	
	
	
	
	
	
	


}
