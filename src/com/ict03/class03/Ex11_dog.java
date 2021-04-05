package com.ict03.class03;

public class Ex11_dog extends Ex09_Animal{
	String name = "댕댕이";
	int age = 3;
	
	public void hobby() {
		System.out.println("신발 물어 뜯기");
	}
	@Override
	public void sound() {
		System.out.println("왈왈");
	}
}
