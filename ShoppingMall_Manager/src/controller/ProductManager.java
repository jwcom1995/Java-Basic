package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

import model.vo.Accessory;
import model.vo.AccessoryDao;
import model.vo.Bottom;
import model.vo.BottomDao;
import model.vo.Product;
import model.vo.Top;
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
	
	public ArrayList getProduct(int num) {
		ArrayList listProduct=new ArrayList();
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
			listProduct.add(temp.get(kitr.next()));
		}
		return listProduct;
	}
	
	public void sellProduct(Product p,int count) {
		if(p instanceof Accessory) {
			ad.sellProduct(p.getpName(), count);
			System.out.println("A");
		} else if (p instanceof Top) {
			td.sellProduct(p.getpName(), count);
			System.out.println("T");
		} else if(p instanceof Bottom){
			bd.sellProduct(p.getpName(), count);
			System.out.println("B");
		} else {
			System.out.println("입력값 오류");
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
	
	//사용자가 보기 편하게 print결과 변경
	public String printP(Product p) {
		String pInfo="";
		if(p instanceof Top) {
			//이름이 너무 길경우 \t 개수 조절
			if(p.getpName().length()>12) {
				pInfo+=p.getpName()+"\t";
			} else if(p.getpName().replace(" ", "").length()<=5) {
				pInfo+=p.getpName()+"\t\t\t";
			}else {
				pInfo+=p.getpName()+"\t\t";
			}
			pInfo+=((Top) p).getCategory()+"\t";
			pInfo+=p.getBrand()+"\t";
			pInfo+=((Top) p).getGender()+"\t";
			pInfo+=((Top) p).getSize()+"\t";
			if(p.getPrice().length()<7) {
				pInfo+=p.getPrice()+"원\t\t";
			} else {
			pInfo+=p.getPrice()+"원\t";
			}
			pInfo+=p.getStock()+"개\t";
		} 
		
		else if(p instanceof Bottom) {
			//이름이 너무 길경우 \t 개수 조절
			if(p.getpName().length()>12) {
				pInfo+=p.getpName()+"\t";
			} else if(p.getpName().replace(" ", "").length()<=5) {
				pInfo+=p.getpName()+"\t\t\t";
			}else {
				pInfo+=p.getpName()+"\t\t";
			}
			pInfo+=((Bottom) p).getCategory()+"\t";
			pInfo+=p.getBrand()+"\t";
			pInfo+=((Bottom) p).getGender()+"\t";
			pInfo+=((Bottom) p).getSize()+"\t";
			if(p.getPrice().length()<7) {
				pInfo+=p.getPrice()+"원\t\t";
			} else {
			pInfo+=p.getPrice()+"원\t";
			}
			pInfo+=p.getStock()+"개\t";
		} 
		
		else if(p instanceof Accessory){
			//이름이 너무 길경우 \t 개수 조절
			if(p.getpName().length()>12) {
				pInfo+=p.getpName()+"\t";
			}else if(p.getpName().replace(" ", "").length()<=5) {
				pInfo+=p.getpName()+"\t\t\t";
			}else {
				pInfo+=p.getpName()+"\t\t";
			}
			pInfo+=((Accessory) p).getCategory()+"\t";
			pInfo+=p.getBrand()+"\t\t\t";
			if(p.getPrice().length()<7) {
				pInfo+=p.getPrice()+"원\t\t";
			} else {
			pInfo+=p.getPrice()+"원\t";
			}
			pInfo+=p.getStock()+"개\t";
		}
		return pInfo;
	}
}
