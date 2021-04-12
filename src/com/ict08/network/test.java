package com.ict08.network;


public class test {
	//시험
	public static void main(String[] args) {
		
		ThreadTest t1 = new ThreadTest();
		Thread thread_1 = new Thread(t1,"dog");
		thread_1.start();
		
		Thread thread_2 = new Thread(t1, "cat");
		thread_2.start();
				
		
		
	}
	
}
class ThreadTest implements Runnable{
	int x =0;
	
	@Override
	public synchronized void run() {
		
		
		for (int i = 0; i < 100; i++) {
			
			if(i==50||i==100) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else {
				notify();
			}
			System.out.println(Thread.currentThread().getName()+(++x));
		}
		
	}

	
}

