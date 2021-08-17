package test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.Scanner;

public class DBTest03 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//준비
		Connection con = null;
		Statement stmt = null;
		//ResultSet rs = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String id = "KH";
		String pw = "KH";
		
	
		//입력
		int no = 0;
		String name = null;
		String nickname = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("번호 입력 : ");
		no = sc.nextInt();
		System.out.print("이름 입력 : ");
		name =sc.next();
		System.out.print("별명 입력 : ");
		nickname=sc.next();
		
		//INSERT INTO MYTEST VALUES(ㅁ,ㅁ,ㅁ)
		String sql = "INSERT INTO MYTEST VALUES("+no+", '"+name+"', '"+nickname+"')";
		//System.out.print(sql);
		
		Class.forName(driver);
		con = DriverManager.getConnection(url,id,pw);
		
		stmt = con.createStatement();
		// SELECT문 사용할때 사용 stmt.executeQuery();
		// 나머지 쿼리문 stmt.executeUpdate();
		int res = stmt.executeUpdate(sql);
		
		if(res>0){
			System.out.println("insert 성공!");
		}else {
			System.out.println("insert 실패");
		}
		
		stmt.close();
		con.close();
		sc.close();
	}
}
