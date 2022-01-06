package com.vn.poly;

public class Student {
	
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setMark(20);
		
		Student student2 = new Student();
		student2.setMark(7);
		
		System.out.println(student1.getMark());
		System.out.println(student2.getMark());
		
		
	}
	
	private String name;
	private double mark;
	
	public Student(String name, double mark) {
		super();
		this.name = name;
		this.mark = mark;
	}
	
	public Student() {
		super();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		if(mark > 10 || mark < 0) {
			System.out.println("Mark input incorrect");
			return;
		}
		this.mark = mark;
	}
	
	

}
