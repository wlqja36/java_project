package com.ict07.IO;

import java.io.File;
import java.io.IOException;

public class Ex03 {
	public static void main(String[] args) {
		// 작업할 특정 위치 지정
		String pathname = "C:" + File.separator + "Beomstudy" + File.separator + "util" + File.separator
				+ "io_test.txt";

		File file = new File(pathname);
		try {
			boolean b1 = file.createNewFile();
			if (b1) {
				System.out.println("파일 생성이 되었습니다.");
			} else {
				System.out.println("파일 생성에 실패하였습니다.(같은이름이 있으면 실패)");
			}

			pathname = "C:" + File.separator + "Beomstudy" + File.separator + "util" + File.separator + "IO_test";

			File file2 = new File(pathname);
			boolean b2 = file2.mkdirs();
			if (b2) {
				System.out.println("디렉토리 생성이 되었습니다");
			} else {
				System.out.println("디렉토리 생성에 실패하였습니다.");
			}
			// 디렉토리 삭제(비어있어야 삭제 가능)
			File file3 = new File(pathname);
			boolean b3 = file3.delete();
			if(b3) {
				System.out.println("디렉토리 삭제 성공");
			}else {
				System.out.println("디렉토리 삭제 실패");
			}
			
			// 파일 삭제
			pathname = "C:" + File.separator + "Beomstudy" + File.separator + "util" + File.separator
					+ "IO_test"+File.separator+"test.txt";
			File file4 = new File(pathname);
			boolean b4 = file4.delete();
			if(b4) {
				System.out.println("파일 삭제 성공");
			}else {
				System.out.println("파일 삭제 실패");
			}
			System.out.println();
			
			// 경로표시 (다 똑같이 표시된다.)
			pathname = "C:" + File.separator + "Beomstudy" + File.separator + "util";
			File file5 = new File(pathname);
			System.out.println(file5.getAbsolutePath());
			System.out.println(file5.getCanonicalPath());
			System.out.println(file5.getPath());
			
			
			
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
