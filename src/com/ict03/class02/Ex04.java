package com.ict03.class02;

import java.util.Random;
import java.util.Scanner;

//���������� ����Ұ��� ����� �׸��������� �·�������
// ��ǻ�ʹ� �������� ����(0), ����(1), ��(2)�� ���´�
// ����ڴ� ������������ �����ؼ� ��ǻ�Ϳ� �������Ѵ�
//�߱����� . (9���ȿ� �������. 9�������� ����, 3�ƿ��ǵ� ����, ���絵 ����)
// ���Ǵ� ���ڴ� 0~9 ���� �ٸ�����, ���ڸ����� ��ġ��Ʋ���� ��, ���ڿ� ��ġ�� ������ ��Ʈ����ũ, ���ڿ� ��ġ�� �´°Ծ����� �ƿ�
// �߱������� ������ �����ϱ���
public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
/*
		String[] cpu = { "����", "����", "��" };
		int cnt = 0;
		int win = 0;
		a:
		while (true) {
			int ran = r.nextInt(2);
			System.out.print("cpu�� ���������� �մϴ�. ���ڷ� �Է����ּ��� (1-����, 2-����, 3-��)");
			int user = sc.nextInt();
			if (ran == 0) {
				if (user == 1) {
					System.out.println("�����ϴ�.");
					cnt++;
				} else if (user == 2) {
					System.out.println("�̰���ϴ�.");
					cnt++;
					win++;
				} else if (user == 3) {
					System.out.println("�����ϴ�.");
					cnt++;
				} else {
					System.out.println("������ ���ڸ� �Է����ּ���.");
				}

			}
			if (ran == 1) {
				if (user == 1) {
					System.out.println("�����ϴ�.");
					cnt++;
				} else if (user == 2) {
					System.out.println("�����ϴ�.");
					cnt++;

				} else if (user == 3) {
					System.out.println("�̰���ϴ�.");
					cnt++;
					win++;
				} else {
					System.out.println("������ ���ڸ� �Է����ּ���.");
				}
			}
			if (ran == 2) {
				if (user == 1) {
					System.out.println("�̰���ϴ�.");
					cnt++;
					win++;
				} else if (user == 2) {
					System.out.println("�����ϴ�.");
					cnt++;
				} else if (user == 3) {
					System.out.println("�����ϴ�.");
					cnt++;
				} else {
					System.out.println("������ ���ڸ� �Է����ּ���.");
				}
			}
			while (true) {
				System.out.println("�� �Ͻðڽ��ϱ�? yes or no");
				String conti = sc.next();
				if (conti.equalsIgnoreCase("no") || conti.equalsIgnoreCase("n")) {
					break a;
				} else if (conti.equalsIgnoreCase("yes") || conti.equalsIgnoreCase("y")) {
					break;
				} else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				}
			}
		}
		int rate = (int)((win / (cnt * 10.0)) * 1000.0);
		System.out.println("����� �·��� : " + rate + "% �Դϴ�.");
		*/
		
		
		int totalcount = 0;
		int vcnt = 0;
		esc:
		while(true) {
			totalcount++;
			//��ǻ��
			int computer = (int)(Math.random()*3); // 0,1,2
			System.out.print("1.���� 2.����, 3.��");
			int user = sc.nextInt();
			if(computer==0) {
				if(user==1) {
					System.out.println("���");
				}else if(user ==2) {
					System.out.println("�̱�");
				}else if(user ==3) {
					System.out.println("��");
				}
				
			}else if(computer ==1) {
				if(user==1) {
					System.out.println("��");
				}else if(user ==2) {
					System.out.println("���");
				}else if(user ==3) {
					System.out.println("�̱�");
				}
			}else if(computer ==2) {
				if(user==1) {
					System.out.println("�̱�");
				}else if(user ==2) {
					System.out.println("��");
				}else if(user ==3) {
					System.out.println("���");
				}
			}
			while(true) {
				System.out.println("����ұ��?(y/n) >>");
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
		System.out.println("�����ϼ̽��ϴ�.");
		System.out.println("����� ����Ƚ�� : "+totalcount+", �·� : " + (vcnt/totalcount)*100+"%");
		
		
		
		
	}

}
