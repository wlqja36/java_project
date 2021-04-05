package com.ict03.class04;

public class Ex07_Dog extends Ex06_Animal {
	@Override
	public void eat(String food) {
		System.out.println("개사료");
		
	}@Override
	public String play() {
		
		return "앞마당";
	}@Override
	public void sound() {
		System.out.println("왈왈");
		
	}

}
