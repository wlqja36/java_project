package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Ex09 {
	public static void main(String[] args) {
//		c:\\study\\util\\test100.txt에
//		이름 : 000
//		나이 : 00
//		전화번호 : 000-0000-0000 
//		작성하는 코딩을 하시오
		
//		쓰고 -> 읽기 
//		그림파일/음악파일을 util위치에 넣을것인데.
//		util\\res에  util위치에 있는 그림파일/음악파일을 복사/이동 할것.
		
		
		String pathname = "C:"+File.separator+"Beomstudy"+File.separator+"util"+File.separator+"test100.txt";
		
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			
			String msg = "이름 : 윤지범\n나이 : 26\n전화번호 : 010-2320-4438";
			byte[] b = msg.getBytes();
			bos.write(b);
			bos.flush();
			
		} catch (Exception e) {
		}finally {
			try {
				bos.close();
				fos.close();
			} catch (Exception e2) {

			}
		}
	}
}
