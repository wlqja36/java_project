package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class PracticeTest {
	public static void main(String[] args) {

		String pathname = "C:" + File.separator + "Beomstudy" + File.separator + "util" + File.separator
				+ "test1001.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);

			String msg = "이름 : 윤지범 \n나이 : 26\n전화번호 : 010-2320-4438";
			byte[] b = msg.getBytes();
			bos.write(b);
			bos.flush();

		} catch (Exception e) {
			System.out.println(e);
		} finally {

			try {
				bos.close();
				fos.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}
