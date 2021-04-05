package com.ict02.array;

public class Ex04 {
	public static void main(String[] args) {
		// 순위 구하기
		// 1. 모든 사람의 순위를 1등으로 초기화한다.
		// 2. 모든 사람들과 비교 해야한다.(단, 자기 자신은 비교할 필요가 없다.(i=j)cotinue)
		// 3. i보다 j가 크면 i순위를 증가한다.
		int[] su = { 270, 265, 280, 290, 285 };
		int[] rank = { 1, 1, 1, 1, 1 };

		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su.length; j++) {
				if(su[i]==su[j]) continue;
				if (su[i] < su[j]) {
					rank[i]++;
				}
			}
		}
		for (int i = 0; i < rank.length; i++) {
			System.out.println(rank[i]);
		}

	}
}
