package com.vn.slide1;

public class Dog extends Animal {
	
	private String id;
	
	public Dog() {
		super();
	}
	
	public Dog(String id) {
		super();
	}

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name = "Milu";
		dog.makeSound();
		dog.getName();
	}
	
	@Override
	public void makeSound() {
		System.out.println("I am a dog");
	}

	@Override
	protected void getName() {
		System.out.println(this.name);
	}

}
