package com.ict02.array;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("입력할 인원수를 정하세요 : ");
		int num = sc.nextInt();

		String[] name = new String[num];
		int[] kor = new int[num];
		int[] eng = new int[num];
		int[] math = new int[num];
		int[] rank = new int[num];
		//입력
		for (int i = 0; i < num; i++) {
			System.out.print("1. 이름을 적어주세요 : ");
			name[i] = sc.next();
			System.out.print("2. 수학 영어 수학 점수를 적어주세요(ex.90 70 50) : ");
			kor[i] = sc.nextInt();
			eng[i] = sc.nextInt();
			math[i] = sc.nextInt();
			rank[i] = 1;

		}

		// 가공 : 처리 // 총점, 평균, 학점
		int[] sum = new int[num];
		double[] avg = new double[num];
		String[] hak = new String[num];

		for (int i = 0; i < num; i++) {
			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = (int) (sum[i] / 3.0 * 10) / 10.0;

			if (avg[i] >= 90) {
				hak[i] = "A";
			} else if (avg[i] >= 80) {
				hak[i] = "B";
			} else if (avg[i] >= 70) {
				hak[i] = "C";
			} else {
				hak[i] = "F";
			}
		}
		// 가공 : 처리 // 순위
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (sum[i] < sum[j]) {
					rank[i]++;
				}
			}
		}

		// 출력 ( 자바 이스케이프문자 : \t-탭 \n-줄바꿈
		System.out.println("이 름 \t총 점\t평 균\t학 점\t순 위");
		for (int i = 0; i < num; i++) {
			System.out.print(name[i] + "\t");
			System.out.print(sum[i] + "\t");
			System.out.print(avg[i] + "\t");
			System.out.print(hak[i] + "\t");
			System.out.println(rank[i]);

		}
		sc.close();
	}
}
