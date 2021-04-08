package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex13 {
	public static void main(String[] args) {
		// DataOutputStream 과 DataInputStream
		// 기본 자료형을 주고 받을 때 사용 
		// FileInputStream 과 FileOutputStream과 다른점은
		// 이진데이터(0,1)를 입출력 할 때 사용한다.(타 시스템과 입출력 할때 유리)
		
		// ** 입력순서와 출력순서가 다르면 데이터의 결과가 달라질 수 있다.
		// BufferedInputStream과 BufferedOutputStream을 활용할 수 있다.
		
		
		String pathname = "C:" + File.separator + "Beomstudy" + File.separator + "util" + File.separator + "ict03.txt";
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		DataOutputStream dos = null;
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;
		
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			dos = new DataOutputStream(bos);
			
			
			// 쓰기 메소드 : wrteXXX (XXX는 기본 자료형을 말한다.)
			// 메모장의 열기를 해도 읽을 수가 없다.
			dos.writeLong(126L);
			dos.writeBoolean(true);
			dos.writeFloat(3.14f);
			dos.writeInt(256);
			dos.writeDouble(346.41);
			dos.writeChar('A');
			dos.flush();
		
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);
			
			// 읽는 메소드 : readXXX (XXX는 기본자료형을 말한다)
			// 위에서 썻던 순서대로 적어야함. 안그럴시 오류가 나거나 데이터가 망가짐.
			System.out.println(dis.readLong());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readFloat());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				dis.close();
				bis.close();
				fis.close();
				dos.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		
		
		
		
		
		
	}
}
