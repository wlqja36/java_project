package com.ict11.ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex01 {
	public static void main(String[] args) {
		// DB 처리에 필요한 클래스 3개
		Connection conn = null;
		PreparedStatement pstmt = null; // statement를 상송받는 인터페이스
		ResultSet rs = null; // select 문의 결과를 받는 클래스 cursor를 사용해서 정보 추출
		int result = 0; // select 문을 제외한 나머지 결과를 받을 때 사용
		try {
			// 1. 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			// 2. 접속정보 (3개)
			String url = "jdbc:oracle:thin:@192.168.1.18:1521:xe";
			String user = "c##beom";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
						
			// 쿼리문 작성 (select, insert, update, delete, ...)
			String sql = "select * from book order by bookid";
			
			// 쿼리 구문 적용
			pstmt = conn.prepareStatement(sql);
			
			// 실제 DB에 적용하고 결과받기
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getInt("bookid")+"\t");
				System.out.print(rs.getString("bookname")+"\t");
				System.out.print(rs.getString("publisher")+"\t");
				System.out.println(rs.getInt("price"));
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) {

			}
		}
	}
}
