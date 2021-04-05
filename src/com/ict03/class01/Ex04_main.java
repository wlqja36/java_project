package com.ict03.class01;

public class Ex04_main {
	public static void main(String[] args) {
		Ex04 ex04 = new Ex04();

		int k1 = ex04.add();
		int k2 = ex04.add2(100);
		int k3 = ex04.add3(100, 1000);
		int k4 = ex04.add4(90, 80, 90);
		
		System.out.println("k1 = " + k1 );
		System.out.println("k2 = " + k2 );
		System.out.println("k3 = " + k3 );
		System.out.println("k4 = " + k4 );

	}
}
