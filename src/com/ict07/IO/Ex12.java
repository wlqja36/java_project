package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex12 {
	public static void main(String[] args) {
		
		
		// 읽는 위치
		String pathname_1 = "C:" + File.separator + "Beomstudy" + File.separator + "util" + File.separator + "java_1.png";
		File read_file = new File(pathname_1);
		
		// 쓰는 위치
		String pathname_2 = "C:" + File.separator + "Beomstudy" + File.separator + "util" + File.separator + "res" + File.separator+"java_1.png";
		File write_file = new File(pathname_2);
		
		// 먼저 읽어서 쓰기
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		// OutputStream
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream(read_file);
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream(write_file);
			bos = new BufferedOutputStream(fos);
			
			
			// 그림, 소리, 동영상 파일들을 처리할 때는 무조건 1byte씩 처리 해야된다.
			int k = 0;
			
			// 1byte 읽기
			while( (k = bis.read()) != -1) {
				//1byte 쓰기
				bos.write(k);
				
				
			}
			bos.flush();
			
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				bos.close();
				fos.close();
				bis.close();
				fis.close();
				// 파일이 열려 있으면 삭제할 수 없다.
				// 읽은파일 삭제
				//read_file.delete();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		
		
		
		
	}
}
