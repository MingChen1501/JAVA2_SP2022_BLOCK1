package com.vn;

public class Person {
	
	public static void main(String[] args) {
		Person tam = new Person();
		tam.setName("Tâm");
		
		System.out.printf("Mình tên là %s", tam.getName());
		
	}
	
	public Person() {
		this.address = "Ha Noi";
	}
	
	public Person(String name) {
		
	}
	
	private String name;
	private int age;
	private String gender;
	private String phoneNo;
	private String address;
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	private Person getInstance() {
		return this;
	}

}
