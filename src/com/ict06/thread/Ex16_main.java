package com.ict06.thread;

public class Ex16_main {
	public static void main(String[] args) {
		Ex16 t1 = new Ex16();
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t1);
		thread1.start();
		thread2.start();
		
		
	}
}
