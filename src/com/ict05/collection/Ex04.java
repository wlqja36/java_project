package com.ict05.collection;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Ex04 {
	public static void main(String[] args) {
		// 로또 : 1-45 ( 랜덤 , 6자리, 중복안됨)
		Random r = new Random();
		HashSet<Integer> lotto = new HashSet<>();
		for (int i = 0; i < 6; i++) {
			int k = r.nextInt(45)+1; // (int)(Math.random()*45)+1; - (1-45) (Math.random=0.00~0.9999)
			boolean b = lotto.add(k);
			if(!b) { // 중복 되었을 때
				i--;
			}
		}
		System.out.println(lotto);
		
		TreeSet<Integer> lotto2 = new TreeSet<Integer>();
		for (int i = 0; i < 6; i++) {
			int k = r.nextInt(45)+1; // (int)(Math.random()*45)+1; - (1-45) (Math.random=0.00~0.9999)
			boolean b = lotto2.add(k);
			if(!b) { // 중복 되었을 때
				i--;
			}
		}
		System.out.println(lotto2);
	}
}
