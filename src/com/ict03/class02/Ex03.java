package com.ict03.class02;

import java.util.Random;

public class Ex03 {
	public static void main(String[] args) {
		// ���� : Math.random(), Random Ŭ����

		// 1. Random Ŭ����
		Random r = new Random();

		// ���� �ڷ����� �����͸� �������� ����

		System.out.println("boolean �� : " + r.nextBoolean());
		System.out.println("int �� : " + r.nextInt());
		System.out.println("long �� : " + r.nextLong());

		// �Ǽ����´� 0.0�̻� ~ 1.0�̸�
		System.out.println("float �� : " + r.nextFloat());
		System.out.println("double �� : " + r.nextDouble());
		System.out.println();

		// Ư�� ������ �����ؼ� ����ϴ� ���
		// 1)nextInt(����) : 0 ~ ���������� �� �� �߻�
		int s1 = r.nextInt(3); // 0~2
		System.out.println(s1);

		// 2) (int)(nextDouble() * ����) : 0~���������� ���� �߻�
		int s2 = (int) (r.nextDouble() * 3);// 0~2
		System.out.println(s2);

		// 2. Math Ŭ���� : �����ڰ� ����.
		// �޼ҵ� ���� static�̴�.
		// ��ü ���� ���� ȣ�� ����
		// 1) random() : 0.0 ~ 1.0 �̸�
		System.out.println(Math.random());

		// 2) Ư�� ������ ������ ��
		int s3 = (int) (Math.random() * 3); // 0~2
		System.out.println(s3);
		
		
		// 3) abs : ���밪 ��ȯ
		System.out.println(Math.abs(100));
		System.out.println(Math.abs(-100));
		
		// 4) ceil(�ø�), round(�ݿø�), floor(����)
		System.out.println("�ø� :" + Math.ceil(3.45));
		System.out.println("�ø� :" + Math.ceil(3.55));
		
		System.out.println("���� :" + Math.floor(3.45));
		System.out.println("���� :" + Math.floor(3.55));
		
		System.out.println("�ݿø� :" + Math.round(3.45));
		System.out.println("�ݿø� :" + Math.round(3.55));
		
		
		
		// 5) max �� �� ū �� ã��
		//    min �� �� ���� �� ã��
		System.out.println("max : " + Math.max(44.9, 45));
		System.out.println("min : " + Math.min(-44.9, -45));
		
		// 6) pow(double a, double b) : ����
		
		System.out.println(Math.pow(2, 3)); //2�� 3��
		System.out.println(Math.pow(3, 2)); //3�� 2��
		

		
		
		
		
	}
}
