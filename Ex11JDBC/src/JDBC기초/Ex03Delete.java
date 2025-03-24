package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex03Delete {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 사용자로부터 아이디와 비밀번호를 입력받기
		System.out.print("삭제할 ID 입력 : ");
		String id = sc.next();
		System.out.print("삭제할 PW 입력 : ");
		String pw = sc.next();

		Connection conn = null;
		PreparedStatement psmt = null;


		try {
	
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// DB 연결 통로 열기(url, user, password)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);

			String sql = "DELETE FROM DATADESIGNMEMBER WHERE ID = ? AND PW = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);
			
			
			int row = psmt.executeUpdate();
			
			if(row>0) {
				System.out.println("회원탈퇴 성공.");
			} else {
				System.out.println("회원탈퇴 실패.");

			}

		}catch(

	Exception e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally
	{
		

		try {

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
