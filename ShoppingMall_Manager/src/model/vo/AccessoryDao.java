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

public class AccessoryDao {
	private HashMap<String,Accessory> AcsryStock = new HashMap<>();
	public void setData() {
		BufferedReader br = null;
		
		try {
			br=new BufferedReader(new FileReader("AccessoryDB.txt"));
		
			String tmp=null;
			while((tmp=br.readLine())!=null) {
				String temp = tmp.substring(1, tmp.length()-1);
				
				String[] product = temp.split(",");
				Accessory ac = new Accessory(product[0],product[1],product[2],Integer.parseInt(product[3]),Integer.parseInt(product[4]));
				AcsryStock.put(product[0], ac);
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
			bw=new BufferedWriter(new FileWriter("AccessoryDB.txt",true));
			bw.write("["+topData[0]+","+topData[1]+","+topData[2]+","+topData[3]+","+topData[4]+"]\n");
			Accessory ac = new Accessory(topData[0],topData[1],topData[2],Integer.parseInt(topData[3])-1,Integer.parseInt(topData[4])-1);
			AcsryStock.put(topData[0], ac);
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
	
	public void showData() {
		Set<String> kSet = AcsryStock.keySet();
		Iterator<String> kItr = kSet.iterator();
		
		while(kItr.hasNext()) {
			String tempKey = kItr.next();
			Accessory tempAc =AcsryStock.get(tempKey);
			System.out.println(tempAc.toString());
		}
	}
	
	public ArrayList<Product> searchData(String word) {
		Set<String> kSet = AcsryStock.keySet();
		Iterator<String> kItr = kSet.iterator();
		ArrayList<Product> sData = new ArrayList<Product>(); 
		
		while(kItr.hasNext()) {
			String tempKey = kItr.next();
			if(tempKey.contains(word)) {
				sData.add(AcsryStock.get(tempKey));
			}
		}
		return sData;
	}
	
}
