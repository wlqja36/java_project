package com.ict09.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex05 {
	public static void main(String[] args) {
		
		
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
			
			// 쿼리작성
			String sql = "insert into student_tb(No, name, det, addr, tel) "
					+ "values(1, '홍길동', '정통', '서울', '010-7777-9999')";
			
			
			// db 보낼 준비
			stmt = conn.createStatement();
			
			// db 결과 받기
			result = stmt.executeUpdate(sql);
			
			if(result >0 ) {
				sql = "select * from student_tb";
				stmt = conn.createStatement();
				rs= stmt.executeQuery(sql);
				
				while(rs.next()) {
					System.out.print(rs.getString("No")+"\t");
					System.out.print(rs.getString("name")+"\t");
					System.out.print(rs.getString("det")+"\t");
					System.out.print(rs.getString("addr")+"\t");
					System.out.print(rs.getString("tel"));
					System.out.println();
				}
			}else {
				System.out.println("실패");
			}
		} catch (Exception e) {
			System.out.println("실패"+e);
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				
			}
		}
	}
	
}
