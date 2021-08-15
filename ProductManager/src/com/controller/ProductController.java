package com.controller;

import java.util.List;
import java.util.Scanner;

import com.model.dto.Product;
import com.model.service.ProductBiz;

public class ProductController {
	
	ProductBiz pBiz= new ProductBiz();
	Scanner sc = new Scanner(System.in);
	
	public List<Product> selectAll(){
		List<Product> list =pBiz.selectAll();
		
		return list;
	}
	
	public Product selectOne() {
		
		String p_name;
		
		System.out.print("제품명을 입력하세요 : ");
		p_name=sc.nextLine();
				
		Product p = pBiz.selectOne(p_name);
		
		return p;
	}
	
	public int insert() {
		
		Product p = new Product();
		
		String product_id;
		String p_name;
		String description;
		int stock;
		int price;
				
		System.out.print("상품 아이디 : ");
		product_id=sc.nextLine();
		p.setProduct_id(product_id);
		
		System.out.print("상품명 : ");
		p_name=sc.nextLine();
		p.setP_name(p_name);
		
		System.out.print("상품가격 : ");
		price=Integer.parseInt(sc.nextLine());
		p.setPrice(price);
		
		System.out.print("상품상세정보 : ");
		description=sc.nextLine();
		p.setDescription(description);
		
		System.out.print("재고 : ");
		stock=Integer.parseInt(sc.nextLine());
		p.setStock(stock);
				
		int rs = pBiz.insert(p);
		
		return rs;
	}
	
	public int update() {
		Product p = new Product();
		
		String product_id;
		String p_name;
		String description;
		int stock;
		int price;
				
		System.out.print("상품 아이디 : ");
		product_id=sc.nextLine();
		p.setProduct_id(product_id);
		
		System.out.print("상품명 : ");
		p_name=sc.nextLine();
		p.setP_name(p_name);
		
		System.out.print("상품가격 : ");
		price=Integer.parseInt(sc.nextLine());
		p.setPrice(price);
		
		System.out.print("상품상세정보 : ");
		description=sc.nextLine();
		p.setDescription(description);
		
		System.out.print("재고 : ");
		stock=Integer.parseInt(sc.nextLine());
		p.setStock(stock);
				
		int rs = pBiz.update(p);
		
		return rs;
	}
	
	public int delete() {
		
		String product_id;
		
		System.out.print("상품 아이디 : ");
		product_id=sc.nextLine();
		
		int rs = pBiz.delete(product_id);
		
		return rs;
	}
}
