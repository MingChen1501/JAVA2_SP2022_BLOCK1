package com.vn.slide1;

public class MayTinh implements MayTinhInterface {
	
	int tinhtong(int a, int b) {
		return a + b;
	}
	
	int tinhtong(int a, int b, int c) {
		return a + b + c;
	}
	
	public static void main(String[] args) {
		MayTinh mayTinh = new MayTinh();
		int tong1 = mayTinh.tinhtong(2, 3);
		int tong2 = mayTinh.tinhtong(1, 2, 3);
		
		System.out.println(tong1);
		System.out.println(tong2);
	}

	@Override
	public void nhan(int a, int b) {
		
	}

}
