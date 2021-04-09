package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Ex27_Input {
	public static void main(String[] args) {
		
		String pathname = "C:" + File.separator + "Beomstudy" + File.separator + "util" 
				+ File.separator + "ict11.ser";
		File file = new File(pathname);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			ArrayList<Ex27_VO> list = (ArrayList<Ex27_VO>)(ois.readObject());
			
			System.out.println("이름\t총점\t평균\t학점");
			for (Ex27_VO k : list) {
				int sum = k.getEng()+k.getKor()+k.getMath();
				double avg = (int)((sum/3.0)*10/10.0);
				String hak = "";
				if(avg >= 90) hak="A학점";
				else if(avg >= 80) hak="B학점";
				else if(avg >= 70) hak="C학점";
				else if(avg >= 60) hak="D학점";
				else hak = "F학점";
				System.out.print(k.getName()+"\t");
				System.out.print(sum+"\t");
				System.out.print(avg+"\t");
				System.out.println(hak);
				
			}
			
			
			
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				ois.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}
