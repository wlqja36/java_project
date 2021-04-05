package com.ict03.class07;

import java.util.Random;
import java.util.Scanner;

public class baseball {
	// 야구게임 . (9번안에 맞춰야함. 9번넘으면 종료, 3아웃되도 종료, 맞춰도 종료)
	// 사용되는 숫자는 0~9 서로 다른숫자, 숫자맞지만 위치가틀리면 볼,
	// 숫자와 위치가 맞으면 스트라이크, 숫자와 위치가 맞는게없으면 아웃
	// 야구게임은 다음주 월요일까지

	public static void main(String[] args) {

		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.println("야구게임 시작합니다.");
		int[] arr = new int[3];
		int[] chk = new int[10];

		
		for (int i = 0; i < arr.length; i++) {
			int num = r.nextInt(9);
			while (true) {
				if (chk[num] == 0) {
					arr[i] = num;
					chk[num] = 1;
					break;
				} else {
					num = r.nextInt(9);
				}
			}

		}
		int cnt = 0;
		int out = 0;
		while (true) {
			int strike = 0;
			int ball = 0;
			
			System.out.print("숫자를 3개 입력하세요 (ex.3 1 2) : ");
			int[] user = new int[3];
			for (int i = 0; i < user.length; i++) {
				user[i] = sc.nextInt();
			}
			
			if(user[0]==arr[0]) {
				strike++;
				
			}else if(chk[user[0]]==1) {
				ball++;
				
			}
			if(user[1]==arr[1]) {
				strike++;
				
			}else if(chk[user[1]]==1) {
				ball++;
				
			}
			if(user[2]==arr[2]) {
				strike++;
				
			}else if(chk[user[2]]==1) {
				ball++;
				
			}
			
			if(strike==3) {
				System.out.println("정답입니다. 게임을 종료합니다.");
				break;
			}else if(strike == 0 && ball == 0){
				out++;
				System.out.println(out+"아웃입니다.");
				
			}else {
				System.out.println(strike+"스트라이크 "+ball+"볼 입니다.");
			}
			
			if(out==3) {
				System.out.println("3아웃이므로 종료합니다.");
				break;
			}
			
			cnt++;
			if(cnt == 10) {
				System.out.println("9회 모두 소진하였습니다. 게임을 종료합니다.");
				System.out.print("정답은 : ");
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i]);
				}
				System.out.print("입니다.");
				
				break;
			}
			

		}

	}

}
