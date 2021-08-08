package test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TEST3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	      String[] queryArr = new String[5];
	      for (int i = 0; i < queryArr.length; i++) {
	    	  queryArr[i] = "INSERT INTO TB_PRAC VALUES('USER"+i+"', '강동희"+i+"', 'PWD1', 941025)";
	         System.out.println(queryArr[i].toString());
	      }
	      String quary2 = "SELECT * FROM TB_PRAC";
	      
	      Class.forName("oracle.jdbc.driver.OracleDriver");
	      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "KH", "KH");
	      Statement stmt = con.createStatement();
	      for(int i = 0 ; i < queryArr.length;i++) {
	    	  stmt.execute(queryArr[i]);
	      }
	      ResultSet rs = stmt.executeQuery(quary2);
	      while (rs.next()) {
	      System.out.println(rs.getString(1)+" ,"+rs.getString(2)+" ,"+rs.getString(3)+" ,"+rs.getString(4));
	  //    stmt.execute(queryArr[2]);
	      }
	      rs.close();
	      
	      stmt.close();
	      con.close();
	      
	   }
}
