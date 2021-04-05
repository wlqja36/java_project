package com.ict03.class02;

import java.util.Random;
import java.util.Scanner;

//가위바위보 계속할건지 물어보고 그만했을때의 승률나오게
// 컴퓨터는 랜덤으로 가위(0), 바위(1), 보(2)를 갖는다
// 사용자는 가위바위보를 선택해서 컴퓨터와 게임을한다
//야구게임 . (9번안에 맞춰야함. 9번넘으면 종료, 3아웃되도 종료, 맞춰도 종료)
// 사용되는 숫자는 0~9 서로 다른숫자, 숫자맞지만 위치가틀리면 볼, 숫자와 위치가 맞으면 스트라이크, 숫자와 위치가 맞는게없으면 아웃
// 야구게임은 다음주 월요일까지
public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
/*
		String[] cpu = { "가위", "바위", "보" };
		int cnt = 0;
		int win = 0;
		a:
		while (true) {
			int ran = r.nextInt(2);
			System.out.print("cpu와 가위바위보 합니다. 숫자로 입력해주세요 (1-가위, 2-바위, 3-보)");
			int user = sc.nextInt();
			if (ran == 0) {
				if (user == 1) {
					System.out.println("비겼습니다.");
					cnt++;
				} else if (user == 2) {
					System.out.println("이겼습니다.");
					cnt++;
					win++;
				} else if (user == 3) {
					System.out.println("졌습니다.");
					cnt++;
				} else {
					System.out.println("지정된 숫자를 입력해주세요.");
				}

			}
			if (ran == 1) {
				if (user == 1) {
					System.out.println("졌습니다.");
					cnt++;
				} else if (user == 2) {
					System.out.println("비겼습니다.");
					cnt++;

				} else if (user == 3) {
					System.out.println("이겼습니다.");
					cnt++;
					win++;
				} else {
					System.out.println("지정된 숫자를 입력해주세요.");
				}
			}
			if (ran == 2) {
				if (user == 1) {
					System.out.println("이겼습니다.");
					cnt++;
					win++;
				} else if (user == 2) {
					System.out.println("졌습니다.");
					cnt++;
				} else if (user == 3) {
					System.out.println("비겼습니다.");
					cnt++;
				} else {
					System.out.println("지정된 숫자를 입력해주세요.");
				}
			}
			while (true) {
				System.out.println("더 하시겠습니까? yes or no");
				String conti = sc.next();
				if (conti.equalsIgnoreCase("no") || conti.equalsIgnoreCase("n")) {
					break a;
				} else if (conti.equalsIgnoreCase("yes") || conti.equalsIgnoreCase("y")) {
					break;
				} else {
					System.out.println("잘못 입력하셨습니다.");
				}
			}
		}
		int rate = (int)((win / (cnt * 10.0)) * 1000.0);
		System.out.println("당신의 승률은 : " + rate + "% 입니다.");
		*/
		
		
		int totalcount = 0;
		int vcnt = 0;
		esc:
		while(true) {
			totalcount++;
			//컴퓨터
			int computer = (int)(Math.random()*3); // 0,1,2
			System.out.print("1.가위 2.바위, 3.보");
			int user = sc.nextInt();
			if(computer==0) {
				if(user==1) {
					System.out.println("비김");
				}else if(user ==2) {
					System.out.println("이김");
				}else if(user ==3) {
					System.out.println("짐");
				}
				
			}else if(computer ==1) {
				if(user==1) {
					System.out.println("짐");
				}else if(user ==2) {
					System.out.println("비김");
				}else if(user ==3) {
					System.out.println("이김");
				}
			}else if(computer ==2) {
				if(user==1) {
					System.out.println("이김");
				}else if(user ==2) {
					System.out.println("짐");
				}else if(user ==3) {
					System.out.println("비김");
				}
			}
			while(true) {
				System.out.println("계속할까요?(y/n) >>");
				String msg = sc.next();
				if(msg.equalsIgnoreCase("y")) {
					continue esc;
				}else if(msg.equalsIgnoreCase("n")) {
					break esc;
				}else {
					continue;
				}
			}
		}
		System.out.println("수고하셨습니다.");
		System.out.println("당신의 도전횟수 : "+totalcount+", 승률 : " + (vcnt/totalcount)*100+"%");
		
		
		
		
	}

}
