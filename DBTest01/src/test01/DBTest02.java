package test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest02 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//0. 준비
		Connection con =null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String id= "KH";
		String pw= "KH";
		String sql = "SELECT * FROM DEPT";
		
		//1.드라이버 등록
		Class.forName(driver);
		//2.db연결
		con = DriverManager.getConnection(url,id,pw);
		//3. 쿼리 실행 및 결과 리턴
		stmt = con.createStatement();
		rs= stmt.executeQuery(sql);
		
		while (rs.next()) {
			System.out.println(rs.getInt(1)+":\t"+rs.getString(2)+":\t["+rs.getString("LOC")+"]");
		}
		
		//4.선언했던 역순으로 종료
		rs.close();
		stmt.close();
		con.close();
	}

}
