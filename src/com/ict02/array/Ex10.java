package com.ict02.array;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 번호, 국어, 영어, 수학 점수를 입력받아서
		// 번호, 총점, 평균, 학점, 순위를 구하고 정렬하기.

		/*
		 * System.out.print("입력할 인원수를 적어주세요"); int N = sc.nextInt(); int[][] arr = new
		 * int [N][5];
		 * 
		 * 
		 * 
		 * 
		 * for (int i = 0; i < N; i++) {
		 * System.out.println("차례대로 적어주세요.(번호, 국어, 영어, 수학 점수)"); int num=sc.nextInt();
		 * int kor = sc. nextInt(); int eng = sc.nextInt(); int math = sc.nextInt();
		 * 
		 * for (int j = 0; j < arr[i].length-1; j++) { switch(j) { case 0 : arr[i][j]=
		 * num; break; case 1 : arr[i][j]= kor+math+eng; break; case 2 : arr[i][j]=
		 * (int)(arr[i][j-1]/3.0*10)/10; break; case 3 : arr[i][j]= math; break; case 4
		 * : arr[i][j]= num; break;
		 * 
		 * 
		 * }
		 * 
		 * 
		 * } arr[i][4]=1; }
		 */

		int[][] arr1 = new int[5][5];

		for (int i = 0; i < arr1.length; i++) {
			System.out.println("번호 : ");
			int num1 = sc.nextInt();

			System.out.println("국어 : ");
			int kor1 = sc.nextInt();

			System.out.println("영어 : ");
			int eng1 = sc.nextInt();

			System.out.println("수학 : ");
			int math1 = sc.nextInt();

			int sum1 = kor1 + eng1 + math1;
			int avg1 = sum1 / 3;
			int hak1 = 0;
			if (avg1 >= 90) {
				hak1 = 'A';
			} else if (avg1 >= 80) {
				hak1 = 'B';
			} else if (avg1 >= 70) {
				hak1 = 'C';
			} else {
				hak1 = 'F';
			}
			int rank1 = 1;
			/*
			 * arr1[i][0] = num1; arr1[i][1] = sum1; arr1[i][2] = avg1; arr1[i][3] = hak1;
			 * arr1[i][4] = rank1;
			 */
			int[] person = new int[5];
			person[0] = num1;
			person[1] = sum1;
			person[2] = avg1;
			person[3] = hak1;
			person[4] = rank1;

			arr1[i] = person;

		}

		//순위
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if(i==j) continue;
				if(arr1[i][1] < arr1[j][1]) {
					arr1[i][4]++;
				}
			}
		}
		
		//정렬
		int[] temp1 = new int[5];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i+1; j < arr1.length; j++) {
				if(arr1[i][4] > arr1[j][4]) {
					temp1 = arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp1;
				}
			}
			
		}
		
		// 출력
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				if (j == 3) {
					System.out.print((char)(arr1[i][j]) + " ");
				} else {
					System.out.print(arr1[i][j] + " ");
				}
			}
			System.out.println();
		}

	}
}
