package com.ict06.thread;

public class Ex02 {
	public void add(int k1, int k2) {
		int sum = k1 + k2;
		System.out.println(sum);
		System.out.println("2"+Thread.currentThread().getName());
	}
	
	
	public int sub(int k1, int k2) {
		System.out.println("4"+Thread.currentThread().getName());
		int res = k1 - k2;
		return res;
	}
}
