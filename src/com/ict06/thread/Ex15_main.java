package com.ict06.thread;

public class Ex15_main {
	public static void main(String[] args) {
		Ex15 t1 = new Ex15();
		Thread thread1 = new Thread(t1,"tiger");
		Thread thread2 = new Thread(t1,"lion");
		thread1.start();
		thread2.start();
	}
}
