package com.ict06.thread;

public class Ex06_main {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Ex04 t1 = new Ex04();
		Ex05 t2 = new Ex05();
		Ex06 t3 = new Ex06();
		
		// 스레드처리는 병렬처리의 증거
		t1.start();
		t2.start();
		t3.start();
		
	}
}
