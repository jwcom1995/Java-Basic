package com.model.dao;

import java.util.ArrayList;
import java.util.List;

import com.common.JDBCTemplate;
import com.model.dto.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDao extends JDBCTemplate{
	
	public List<Product> selectAll(Connection con){
		
		PreparedStatement pstm= null;
		ResultSet rs = null;
		
		List<Product> list = new ArrayList<Product>();
		
		String sql = "SELECT * FROM PRODUCT";
		
		try {
			con=getConnection();
			pstm=con.prepareStatement(sql);
			rs=pstm.executeQuery();
			
			while(rs.next()) {
				Product p = new Product();
				
				p.setProduct_id(rs.getString(1));
				p.setP_name(rs.getString(2));
				p.setPrice(rs.getInt(3));
				p.setDescription(rs.getString(4));
				p.setStock(rs.getInt(5));
				
				list.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstm);
			close(con);
		}
		return list;
	}
	
	public Product selectOne(Connection con, String p_name) {
		
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM PRODUCT WHERE P_NAME=?";
		
		Product p = new Product();
	
		try {
			con=getConnection();
			pstm=con.prepareStatement(sql);
			
			pstm.setString(1, p_name);
			rs=pstm.executeQuery();
			
			while(rs.next()) {
				p.setProduct_id(rs.getString(1));
				p.setP_name(rs.getString(2));
				p.setPrice(rs.getInt(3));
				p.setDescription(rs.getString(4));
				p.setStock(rs.getInt(5));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstm);
			close(con);
		}		
		return p;
	}
	
	
}
