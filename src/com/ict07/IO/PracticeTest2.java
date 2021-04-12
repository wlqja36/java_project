package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class PracticeTest2 {
	public static void main(String[] args) {
		// 읽는 위치
				String pathname_1 = "C:" + File.separator + "Beomstudy" + File.separator + "util" + File.separator + "java_1.png";
				File read_file = new File(pathname_1);
				
				// 쓰는 위치
				String pathname_2 = "C:" + File.separator + "Beomstudy" + File.separator + "util" + File.separator + "res" + File.separator+"javatest_1.png";
				File write_file = new File(pathname_2);
				
				FileInputStream fis = null;
				BufferedInputStream bis = null;
				
				FileOutputStream fos = null;
				BufferedOutputStream bos = null;
				
				try {
					fis = new FileInputStream(read_file);
					bis = new BufferedInputStream(fis);
					
					fos = new FileOutputStream(write_file);
					bos = new BufferedOutputStream(fos);
					
					byte[] b = new byte[(int)(read_file.length())];
					bis.read(b);
					bos.write(b);
					bos.flush();
					
					
				} catch (Exception e) {
					System.out.println(e);
				}finally {
					try {
						bis.close();
						fis.close();
						bos.close();
						fos.close();
					} catch (Exception e2) {
						System.out.println(e2);
					}
				}
	}
}
