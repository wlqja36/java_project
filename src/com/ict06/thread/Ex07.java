package com.ict06.thread;


// Runnable 인터페이스는 run()만 가지고 있다.
public class Ex07 implements Runnable{
	@Override
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName()+": 111111111");
		}
	}

}
