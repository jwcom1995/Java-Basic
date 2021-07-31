package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

import model.vo.AccessoryDao;
import model.vo.BottomDao;
import model.vo.Product;
import model.vo.TopDao;

public class ProductManager {
	TopDao td = new TopDao();
	BottomDao bd = new BottomDao();
	AccessoryDao ad = new AccessoryDao();
	
	public ProductManager() {}
	public void setData() {
		td.setData();
		bd.setData();
		ad.setData();
	}
	public void addProduct(int num,String[] product) {
		switch(num) {
		case 1:
			td.addData(product);
			break;
		case 2:
			bd.addData(product);
			break;
		case 3:
			ad.addData(product);
			break;
		default:
			System.out.println("잘못된 값을 입력하였습니다.");
		}
	}
	
	public LinkedList getProduct(int num) {
		LinkedList listProduct=new LinkedList();
		HashMap temp;
		switch(num) {
			case 1:
				temp=td.getData();
				break;
			case 2:
				temp=bd.getData();
				break;
			case 3:
				temp=ad.getData();
				break;
			default:
				System.out.println("잘못된 값을 입력하였습니다.");
				return null;
		}
		Set kset =temp.keySet();
		Iterator kitr = kset.iterator();
		while(kitr.hasNext()) {
			listProduct.add(kitr.next());
		}
		return listProduct;
	}

	public ArrayList<Product> searchProduct(String word) {
		ArrayList<Product> sData = new ArrayList<Product>();
		
		ArrayList<Product> temp=td.searchData(word);
		for(int i = 0 ; i < temp.size() ; i++) {
			sData.add(temp.get(i));
		}
		temp=bd.searchData(word);
		for(int i = 0 ; i < temp.size() ; i++) {
			sData.add(temp.get(i));
		}
		temp=ad.searchData(word);
		for(int i = 0 ; i < temp.size() ; i++) {
			sData.add(temp.get(i));
		}
		return sData;
	}
}
