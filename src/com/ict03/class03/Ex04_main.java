package com.ict03.class03;

public class Ex04_main {
	public static void main(String[] args) {
		Ex03 ex03 = new Ex03();
		System.out.println(ex03);
		
		// 부모와 자식이 같이 가지고 있으면 
		// 자식이 가지고있는 멤버를 먼저 사용한다.
		System.out.println(ex03.name);
		
		// 자식에게 없는 멤버는 부모가 가지고 있는 멤버에서 사용
		System.out.println(ex03.addr);
		
		
		// 메소드도 마찬가지이다.
		ex03.sound();
		ex03.prn();
		System.out.println("===============");
		System.out.println(Ex03.hobby);
		System.out.println(Ex02.car);
		System.out.println(ex03.name);
		
		// 자식과 부모가 같은 메소드를 가지고 있으면
		// 자식 메소드를 실행한다.
		
		ex03.eat();
	}
}
