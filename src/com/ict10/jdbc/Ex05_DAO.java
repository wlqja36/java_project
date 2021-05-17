package com.ict10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;


	
	// DAO란 Data Access Object 의 약어로서 실질적으로 DB에 접근하는 객체를 말한다.
	// DAO의 사용 이유는 효율적인 커넥션 관리와 보안성 때문이다.
	// DAO는 DB를 사용해 데이터를 조화하거나 조작하는 기능을 전담하도록 만든 오브젝트를 말한다.
	
public class Ex05_DAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	int result = 0;
	
	//DB에 접속하는 역활을 수행한다.
	public Ex05_DAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://203.236.220.96:3306/test01db?characterEncording=utf-8&serverTimezone=UTC";
			String user = "test02";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	// 각종 DB접근 메소드 만들기
	// 전체 정보 출력하는 메소드
	public void getList() {
		try {
			String sql = "select * from book order by bookid";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("도서번호\t도서명\t출판사\t가격");
			while(rs.next()) {
				System.out.print(rs.getInt("bookid")+"\t");
				System.out.print(rs.getString("bookname")+"\t");
				System.out.print(rs.getString("publisher")+"\t");
				System.out.println(rs.getInt("price"));
			}
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) {

			}
		}
	}
	// 삽입하는 메소드
	public void getInsert(int i_bookid, String i_bookname, String i_publisher, int i_price) {
		try {
			String sql = "insert into book values(?,?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, i_bookid);
			pstmt.setString(2, i_bookname);
			pstmt.setString(3, i_publisher);
			pstmt.setInt(4, i_price);
			
			result = pstmt.executeUpdate();
			if(result >0) {
				System.out.println("삽입성공");
			}	
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
	// 삭제하는 메소드
	public void getDelete(int delete_id) {
		try {
			String sql = "delete from book where bookid = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, delete_id);
			
			
			result = pstmt.executeUpdate();
			if(result > 0) {
				System.out.println("삭제성공");
			}	
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
	// 수정하는 메소드
	public void getUpdate(int u_bookid, String u_bookname, String u_publisher, int u_price) {
		try {
			String sql = "update book set bookname = ?, publisher = ?, price = ? where bookid = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(4, u_bookid);
			pstmt.setString(1, u_bookname);
			pstmt.setString(2, u_publisher);
			pstmt.setInt(3, u_price);
			
			result = pstmt.executeUpdate();
			if(result >0) {
				System.out.println("수정성공");
			}	
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
	// 검색하는 메소드
	public void getSelect(int s_bookid) {
		try {
			String sql = "select * from book where bookid = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, s_bookid);
			rs = pstmt.executeQuery();
			System.out.println("도서번호\t도서명\t출판사\t가격");
			while(rs.next()) {
				System.out.print(rs.getInt("bookid")+"\t");
				System.out.print(rs.getString("bookname")+"\t");
				System.out.print(rs.getString("publisher")+"\t");
				System.out.println(rs.getInt("price"));
			}
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) {

			}
		}
	}
}
