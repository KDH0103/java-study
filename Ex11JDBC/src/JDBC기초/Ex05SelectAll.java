package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex05SelectAll {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("모든 회원 정보를 열람하시겠습니까? Y/N: ");
		String id = sc.next();


		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		try {
		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);

			if (conn != null) {
				System.out.println("연결 성공!");
			} else {
				System.out.println("연결 실패...");
			}

			
			String sql = "SELECT * FROM DATADESIGNMEMBER";

			psmt = conn.prepareStatement(sql);
			
			rs = psmt.executeQuery();
			
			System.out.println("===== 전체 회원 조회 ======");
	        System.out.println("Id\t이름\t나이\t점수");
			
			while (rs.next()) {
	
				String idd = rs.getString("id");
				String namee =rs.getString("name");
				int agee =rs.getInt("age");
				int scoree =rs.getInt("score");
		        System.out.printf("%-10\t%-5d\t%-15s\n", "Alice", 30, "New York");
				System.out.println(idd+"\t\t"+namee+"\t"+agee+"\t"+scoree);
				}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
	

			try {
				if (rs != null)
					rs.close();
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
				
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
		}

	}

}
