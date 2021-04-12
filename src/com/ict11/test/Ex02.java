package com.ict11.test;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] arr = new int[5][5];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("번호 : ");
			int no = sc.nextInt();
			System.out.println("국어 : ");
			int kor = sc.nextInt();
			System.out.println("영어 : ");
			int eng = sc.nextInt();
			System.out.println("수학 : ");
			int math = sc.nextInt();

			int sum = kor + eng + math;
			int avg = sum / 3;
			int hak = 0;
			if (avg > 90) {
				hak = 'A';
			} else if (avg >= 80) {
				hak = 'B';
			} else {
				hak = 'F';
			}
			int rank = 1;
			int[] person = new int[5];
			person[0] = no;
			person[1] = sum;
			person[2] = avg;
			person[3] = hak;
			person[4] = rank;
			arr[i] = person;
		}

		// 순위 구하기
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					continue;
				} else if (arr[i][2] <= arr[j][2]) {
					arr[i][4]++;
				}

			}

		}

		// 정렬하기(총점으로) 출력까지.

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					continue;
				} else if (arr[i][1] >= arr[j][1]) {
					int[] temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("번호\t총점\t평균\t학점\t순위");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j == 3) {
					System.out.print((char) (arr[i][j]) + "\t");
				} else {
					System.out.print(arr[i][j] + "\t");
				}
			}
			System.out.println();
		}
	}
}
