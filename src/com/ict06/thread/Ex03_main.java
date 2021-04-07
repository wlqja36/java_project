package com.ict06.thread;

public class Ex03_main {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Ex03 t1 = new Ex03();
		t1.go();
		System.out.println("수고하셨습니다.");
		System.out.println("==============");
		
		// 스레드 처리하기 위해서 start()를 호출했다.
		// run()로 가야하지만 start()가 있어서 start()로 간다.
		// 이것은 스레드 처리가 아니다.
		// Ex03에 있는 start()를 주석처리하면
		// start() => run()로 가게되면
		// 이것을 스레드 처리했다고 한다.
		System.out.println(Thread.currentThread().getName());
		t1.start();
		System.out.println("수고하셨습니다.");
		System.out.println("==============");
		
		
		
	}
}
