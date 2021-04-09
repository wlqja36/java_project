package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex25_Output {
	public static void main(String[] args) {
		String pathname = "C:" + File.separator + "Beomstudy" + File.separator + "util" 
				  + File.separator + "ict09.ser";
		File file = new File(pathname);
		Scanner sc = new Scanner(System.in);
		
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			ArrayList<Ex25_VO> list = new ArrayList<Ex25_VO>();
			esc:
			while(true) {
				System.out.print("이름, 국어, 영어, 수학 순으로 적어주세요 : ");
				Ex25_VO vo = new Ex25_VO();
				vo.setName(sc.next()); 
				vo.setKor(sc.nextInt());
				vo.setEng(sc.nextInt());
				vo.setMath(sc.nextInt());
				vo.setSum(vo.getKor()+vo.getEng()+vo.getMath());
				vo.setAvg(((int)((vo.getSum()/3.0)*10)/10.0));
				
				if(vo.getAvg()>=90) vo.setGpa("A");
				else if(vo.getAvg()>=80) vo.setGpa("B");
				else if(vo.getAvg()>=70) vo.setGpa("C");
				else vo.setGpa("F");
				
				list.add(vo);
				while(true) {
					System.out.print("계속 하시겠습니까? (y/n)");
					String msg = sc.next();
					if(msg.equalsIgnoreCase("y")) {
						continue esc;
					}else if(msg.equalsIgnoreCase("n")) {
						break esc;
					}else {
						System.out.println("잘못 입력 하셨습니다.");
						continue;
					}
				}
				
			}
			oos.writeObject(list);
			oos.flush();
			sc.close();
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				oos.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		
		
	}
}
