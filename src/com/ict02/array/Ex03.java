package com.ict02.array;

import java.util.Arrays;
import java.util.Collections;

public class Ex03 {
	public static void main(String[] args) {
		int[] su = { 3, 4, 9, 5, 6, 1, 7, 2, 10, 8 };
		int temp = 0; // 자리변경을 위한 변수

		for (int i = 0; i < su.length - 1; i++) {
			for (int j = i + 1; j < su.length; j++) {
				// i보다 j가 작으면 자리변경(오름차순)
				// i보다 j가 크면 자리변경(내림차순)
				if (su[i] < su[j]) {
					temp = su[j];
					su[j] = su[i];
					su[i] = temp;

				}

			}
		}

		for (int i = 0; i < su.length; i++) {
			System.out.println(su[i]);
		}
		System.out.println("===================");
		int[] su2 = { 3, 4, 9, 5, 6, 1, 7, 2, 10, 8 };
		
		//Arrays.sort(배열) 메소드는 해당 배열을 오름차순 하는 기능
		Arrays.sort(su2);
		
		for (int i = 0; i < su2.length; i++) {
			System.out.println(su2[i]);
		}
		
		System.out.println("===================");
		// Integer[] 나중에배움
		// 클래스를 자료형 배열로 사용-참조자료형 (참조자료형 배열 일 때 내림차순 가능)
		Integer[] su3 = { 3, 4, 9, 5, 6, 1, 7, 2, 10, 8 };
		
		//Arrays.sort(배열, Collections.reversOrder)
		Arrays.sort(su3, Collections.reverseOrder());
		
		for (int i = 0; i < su3.length; i++) {
			System.out.println(su3[i]);
		}
		
		
		//일부만 정렬하기
		int[] su4 = { 3, 4, 9, 5, 6, 1, 7, 2, 10, 8 };
		Arrays.sort(su4, 0, 4); // 0,1,2,3 요소만 정렬
		for (int i = 0; i < su4.length; i++) {
			System.out.println(su4[i]);
		}
		
	}
}
