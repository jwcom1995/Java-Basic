package test01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import common.JDBCTemplate;

public class DBTest06 extends JDBCTemplate{
	public void selectAll() {
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs =null;
		
		String sql = "SELECT * FROM MYTEST";
		
		try {
			con = getConnection();
			pstm=con.prepareStatement(sql);
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstm);
			close(con);
		}
	}

	public void selectOne() {
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		int no=0;
		
		String sql = "SELECT * FROM MYTEST WHERE MNO=?";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("찾을 번호 : ");
		no=sc.nextInt();
		
		try {
			con=getConnection();
			pstm=con.prepareStatement(sql);
			
			pstm.setInt(1, no);
			rs=pstm.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+":"+rs.getString(2)+":"+rs.getString(3));
			}
			
		} catch (SQLException e) {			
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstm);
			close(con);
			sc.close();
		}
	}

	public void insert() {
		Connection con = null;
		PreparedStatement pstm = null;
		int res = 0;
		int no;
		String name,nickname;
		
		String sql = "INSERT INTO MYTEST VALUES(?, ?, ?)";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----데이터 입력 ------");
		System.out.print("번호 입력: ");
		no=sc.nextInt();
		System.out.print("이름 입력: ");
		name=sc.next();
		System.out.print("별명 입력: ");
		nickname=sc.next();
		
		try {
			con=getConnection();
			pstm=con.prepareStatement(sql);
			
			pstm.setInt(1, no);
			pstm.setString(2, name);
			pstm.setString(3, nickname);
			
			res=pstm.executeUpdate();
			
			if(res>0) {
				System.out.println("Insert 실행");
				commit(con);
			} else {
				System.out.println("Insert 실패");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstm);
			close(con);
			sc.close();
		}
	}
	
	public void delete() {
		Connection con = null;
		PreparedStatement pstm = null;
		int res = 0;
		int no;
		
		String sql = "DELETE FROM MYTEST WHERE MNO=?";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("삭제할 번호 입력: ");
		no=sc.nextInt();
		
		try {
			con=getConnection();
			pstm=con.prepareStatement(sql);
			
			pstm.setInt(1, no);
			
			res=pstm.executeUpdate();
			
			if(res>0) {
				System.out.println("Delete 실행");
				commit(con);
			} else {
				System.out.println("Delete 실패");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstm);
			close(con);
			sc.close();
		}
	}
	
	public void update() {
		Connection con = null;
		PreparedStatement pstm = null;
		int res = 0;
		int no;
		String name,nickname;
		
		String sql = "UPDATE MYTEST SET MNAME=?,NICKNAME=? WHERE MNO=?";
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("업데이트를 원하는 번호 입력: ");
		no=sc.nextInt();
		System.out.print("수정된 이름 입력: ");
		name=sc.next();
		System.out.print("수정된 별명 입력: ");
		nickname=sc.next();
		
		try {
			con=getConnection();
			pstm=con.prepareStatement(sql);
			
			pstm.setString(2, nickname);
			pstm.setString(1, name);
			pstm.setInt(3, no);
			
			res=pstm.executeUpdate();
			
			if(res>0) {
				System.out.println("Update 실행");
				commit(con);
			} else {
				System.out.println("Update 실패");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstm);
			close(con);
			sc.close();
		}
	}
}
