package com.vn;

import java.util.Scanner;

public class Employee {
	
	private String fullName;
	private Double salary;
	
	//nhập thông tin nhân viên
	public void input() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Could you enter name:");
		fullName = scanner.nextLine();
		
		System.out.println("Could you enter salary:");
		salary = scanner.nextDouble();

	}
	
	//show thông tin nhân viên
	public void output() {
		System.out.println(fullName + " - " + salary);
	}

}
