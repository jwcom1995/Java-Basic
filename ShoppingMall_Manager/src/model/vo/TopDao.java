package model.vo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TopDao {
	private HashMap<String,Top> topStock = new HashMap<>();
	public void setData() {
		BufferedReader br = null;
		
		try {
			br=new BufferedReader(new FileReader("TopDB.txt"));
		
			String tmp=null;
			while((tmp=br.readLine())!=null) {
				String temp = tmp.substring(1, tmp.length()-1);
				
				String[] product = temp.split(",");
				Top t = new Top(product[0],product[1],product[2],Integer.parseInt(product[3]),Integer.parseInt(product[4]),Integer.parseInt(product[5]),product[6]);
				topStock.put(product[0], t);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("db 파일이 존재하지 않습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void addData(String[] topData) {
		
		BufferedWriter bw = null;
		try {
			bw=new BufferedWriter(new FileWriter("TopDB.txt",true));
			bw.write("["+topData[0]+","+topData[1]+","+topData[2]+","+topData[3]+","+topData[4]+","+topData[5]+","+topData[6]+"]\n");
			Top t = new Top(topData[0],topData[1],topData[2],Integer.parseInt(topData[3])-1,Integer.parseInt(topData[4])-1,Integer.parseInt(topData[5])-1,topData[6]);
			topStock.put(topData[0], t);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public HashMap<String,Top> getData() {
		return topStock;
	}
	
	public ArrayList<Product> searchData(String word) {
		Set<String> kSet = topStock.keySet();
		Iterator<String> kItr = kSet.iterator();
		ArrayList<Product> sData = new ArrayList<Product>(); 
		
		while(kItr.hasNext()) {
			String tempKey = kItr.next();
			if(tempKey.contains(word)) {
				sData.add(topStock.get(tempKey));
			}
		}
		return sData;
	}
	
	public void updateData() {
		BufferedWriter bw = null;
		try {
			bw=new BufferedWriter(new FileWriter("TopDB.txt"));
			Set<String> kSet = topStock.keySet();
			Iterator<String> kItr = kSet.iterator();
			while(kItr.hasNext()) {
				String k=kItr.next();
				Top temp = topStock.get(k);
				bw.write("["+temp.getpName()+","+temp.getPrice()+","+temp.getBrand()+","+temp.getCateNum()+","+temp.getStock()+","+temp.getGenderNum()+","+temp.getSize()+"]\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void sellProduct(String name, int count) {
		int remainStock = topStock.get(name).getStock();
		System.out.println("remainStock:"+remainStock);
		System.out.println("count:"+count);
		if(remainStock-count < 0) {
			System.out.println("재고량이 부족합니다. 올바른 수량을 입력해주세요.");
		} else {
			topStock.get(name).setStock(remainStock-count);
			System.out.println(remainStock-count);
			//달라진 수량을 db에적용
			updateData();
		}
	}
}
