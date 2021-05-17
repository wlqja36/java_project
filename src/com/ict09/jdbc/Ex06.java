package com.ict09.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// 데이터를 받아서 VO에 넣자
		Scanner sc = new Scanner(System.in);
		ArrayList<VO> list = new ArrayList<VO>();
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			// 계정을 만들때 'test02'@'%'
			String url = "jdbc:mysql://203.236.220.96:3306/test02db?characterEncording=utf-8&serverTimezone=UTC";
			String user = "test02";
			String password = "1111";

			conn = DriverManager.getConnection(url, user, password);
			// 정보 받기
			esc:
			while(true) {
				
				System.out.print("학번 : ");
				int no = sc.nextInt();
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("학과 : ");
				String det = sc.next();
				System.out.print("주소 : ");
				String addr = sc.next();
				System.out.print("전화번호 : ");
				String tel = sc.next();
				
				// 받은 정보 저장
				list.add(new VO(no, name, det, addr, tel));
				
				
				while(true) {
					System.out.println("계속할까요?(y/n)");
					String msg = sc.next();
					if(msg.equalsIgnoreCase("y")) {
						continue esc;
					}else if(msg.equalsIgnoreCase("n")){
						break esc;
						
					}else {
						continue;
					}
				}
			}
			// 저장 정보 처리
			for(int i = 0; i< list.size(); i++) {
				// 쿼리작성
				String sql = "insert into student_tb(No, name, det, addr, tel) "
						+ "values("+list.get(i).getNo()+", '"+list.get(i).getName()+"', '"+list.get(i).getDet()+"','"+list.get(i).getAddr()+"', '"+list.get(i).getTel()+"')";
				stmt = conn.createStatement();
				result = stmt.executeUpdate(sql);
				
				if(result <0) {
					System.out.println("오류 발생");
				}
			}
			String sql = "select * from student_tb";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.print(rs.getInt("No")+"\t");
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getString("det")+"\t");
				System.out.print(rs.getString("addr")+"\t");
				System.out.print(rs.getString("tel"));
				System.out.println();
				
			}

			
			
		} catch (Exception e) {
			System.out.println("실패" + e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {

			}
		}
	}

}
