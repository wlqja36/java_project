package com.ict06.thread;

public class Ex09_main {
	public static void main(String[] args) {
		Ex07 t1 = new Ex07();
		Ex08 t2 = new Ex08();
		Ex09 t3 = new Ex09();
		
		// Ex07,08,09는 Runnable를 상속받았기 때문에 start()가 없다.
//		t1.start(); // Runnable은 run()만 가지고있기 때문에 start() 가 없다.
		
		//실행 run()메소드를 가진 클래스 즉 타겟을 지정해야한다
//		Thread thread1 = new Thread(); // 타겟이없음.
		Thread thread1 = new Thread(t1);
		thread1.start();
		
		new Thread(t2).start();
		
		Thread thread3 = new Thread(t3);
		thread3.start();
		
		// 안드로이드에서 많이 사용하는 방법(익멱 내부 클래스)
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true) {
					System.out.println(Thread.currentThread().getName()+": ㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁ");
				}
				
			}
		}).start();
		
	}
}
