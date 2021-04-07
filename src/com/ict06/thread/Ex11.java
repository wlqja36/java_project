package com.ict06.thread;

public class Ex11 implements Runnable{
	@Override
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName()+": 1111111");
		}
		
	}
}
