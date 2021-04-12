package com.ict11.test;

public class Ex03 implements Runnable {
	int x = 0;

	@Override
	public synchronized void run() {

		for (int i = 0; i < 100; i++) {

			if (i == 50 || i == 100) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				notify();
			}
			System.out.println(Thread.currentThread().getName() + (++x));
		}

	}
}
