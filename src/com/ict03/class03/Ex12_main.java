package com.ict03.class03;

import java.util.Scanner;

public class Ex12_main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("�����ϼ��� (1. �����   2. ������) : ");
	
	int s1 = sc.nextInt();
	/*
	if(s1==1) {
		Ex10_Cat cat = new Ex10_Cat();
		cat.sound();
		cat.hobby();
		cat.like();
		cat.sleep();
		
	}else if(s1==2) {
		Ex11_dog dog = new Ex11_dog();
		dog.sound();
		dog.hobby();
		dog.like();
		dog.sleep();
		
	}*/
	
	// �θ�Ŭ������ �̿��ؼ� ����
		Ex09_Animal animal = null;
		if (s1 == 1) {
			animal = new Ex10_Cat();
		} else if (s1 == 2) {
			animal = new Ex11_dog();
		}
		// Ư¡ : �θ�Ŭ������ ���� �޼ҵ�� ��� �Ұ�
		animal.sound();
		//animal.hobby(); ->�����߻� . �θ�Ŭ������ ��������������
		animal.like();
		animal.sleep();
		

	}
}
