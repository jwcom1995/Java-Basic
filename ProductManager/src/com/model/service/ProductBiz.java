package com.model.service;

import java.sql.Connection;
import java.util.List;

import com.common.JDBCTemplate;
import com.model.dao.ProductDao;
import com.model.dto.Product;

public class ProductBiz extends JDBCTemplate{
	
	ProductDao dao = new ProductDao();
	
	public List<Product> selectAll(){
		Connection con = getConnection();
		List<Product> list =dao.selectAll(con);
		
		close(con);
		
		return list;
	}
	
	public Product selectOne(String p_name) {
		Connection con = getConnection();
		Product p = dao.selectOne(con, p_name);
		
		close(con);
		
		return p;
	}
	
	public int insert(Product dto) {
		Connection con = getConnection();
		int rs =dao.insert(con, dto);
		
		if(rs>0) {
			commit(con);
		} else {
			rollback(con);
		}
		close(con);
		
		return rs;
	}
	
	public int update(Product dto) {
		Connection con = getConnection();
		int rs = dao.update(con, dto);
		
		if(rs>0) {
			commit(con);
		} else {
			rollback(con);
		}
		close(con);
		
		return rs;
	}
	
	public int delete(String product_id) {
		Connection con=getConnection();
		int rs=dao.delete(con, product_id);
		
		if(rs>0) {
			commit(con);
		} else {
			rollback(con);
		}
		close(con);
		
		return rs;
	}
}
