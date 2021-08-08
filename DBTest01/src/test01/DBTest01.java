package test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBTest01 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1. 드라이버 등록
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2. DB연결 (Connection 객체 준비)
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","KH","KH");
		
		//3. SQL 실행
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM EMP");
		
		//4.결과리턴
		while(rs.next()) {
			int empno = rs.getInt(1);
			String ename = rs.getString(2);
			int sal = rs.getInt("SAL");
			System.out.println(empno+" "+ename+" "+sal);
		}
		
		//5. 종료
		rs.close();
		stmt.close();
		con.close();
		
	}
}
