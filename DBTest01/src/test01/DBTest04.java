package test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBTest04 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection con = null;
		Statement stmt = null;
		int res = 0;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url ="jdbc:oracle:thin:@localhost:1521:XE";
		String id = "KH";
		String pw = "KH";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 번호: ");
		int no = sc.nextInt();
		String sql = "DELETE FROM MYTEST WHERE MNO="+no;
		//System.out.println(sql);
		
		Class.forName(driver);
		con = DriverManager.getConnection(url,id,pw);
		stmt = con.createStatement();
		res = stmt.executeUpdate(sql);
		
		if(res>0) {
			System.out.println("delete 성공!");
		} else {
			System.out.println("delete 실패!");
		}
		
		stmt.close();
		con.close();
		sc.close();
	}
}
