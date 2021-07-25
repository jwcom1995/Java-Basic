package controller;

import java.util.ArrayList;

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
	
	public void showProduct(int num) {
		switch(num) {
			case 1:
				td.showData();
				break;
			case 2:
				bd.showData();
				break;
			case 3:
				ad.showData();
				break;
			default:
				System.out.println("잘못된 값을 입력하였습니다.");
		}
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
