package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

// 객체 직렬화 : ObjectOutputStream : writeObjec()
public class Ex23_Output {
	public static void main(String[] args) {
		// 객체 직렬화 : 특정 클래스(VO)를 객체로 만들어 특정위치에 .ser 파일로 만들어 저장한다.
		// 객체들이 가지고 있는 내용이 직렬화 되어 있다.(사람은 정보를 제대로 볼 수없다.)

		String pathname = "C:" + File.separator + "Beomstudy" + File.separator + "util" 
						  + File.separator + File.separator + "ict07.ser";
		File file = new File(pathname);
		
		
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			// 객체 직렬화를 하기 위한 객체 만듦
			Ex23_VO vo1 = new Ex23_VO("고길동", 34, 77.9, true);
			
			
			
			
			// 객체 직렬화
			oos.writeObject(vo1);
			oos.flush();
			
			
			
		} catch (Exception e) {

		} finally {
			try {
				oos.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {

			}
		}

	}
}
