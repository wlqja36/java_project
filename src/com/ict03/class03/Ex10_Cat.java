package com.ict03.class03;

public class Ex10_Cat extends Ex09_Animal {
	String name = "다홍이";
	int age = 1;
	
	public void hobby() {
		System.out.println("쥐잡이");
	}
	@Override
	public void sound() {
		System.out.println("애옹애옹");
	}
}
