package com.ict06.thread;

public class Ex20 {
	public static void main(String[] args) {
		// 공통자원 == 임계영역 => 동기화 처리
		Ex17 c = new Ex17();
		Ex18 producer = new Ex18(c);
		Thread tProducer = new Thread(producer);
		Ex19 customer= new Ex19(c);
		Thread tCustomer = new Thread(customer);
		tProducer.start();
		tCustomer.start();
	}
}
