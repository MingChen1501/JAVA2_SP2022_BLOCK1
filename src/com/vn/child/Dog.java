package com.vn.child;

import com.vn.poly.Animal;

public class Dog extends Animal {

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
