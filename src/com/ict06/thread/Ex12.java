package com.ict06.thread;

public class Ex12 implements Runnable{
	@Override
	public void run() {
		System.out.println("run 시작");
		for (int i = 1; i < 51; i++) {
			System.out.println(Thread.currentThread().getName()+": "+i);
			
		}
		
		
		System.out.println("run 끝");
		
		
	}

}
