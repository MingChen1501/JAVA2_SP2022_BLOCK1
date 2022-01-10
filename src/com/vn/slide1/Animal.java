package com.vn.slide1;

public abstract class Animal {
	
	protected String name;
	
	public void makeSound() {
		System.out.println("I am an animal");
	}
	
	protected abstract void getName();

}
