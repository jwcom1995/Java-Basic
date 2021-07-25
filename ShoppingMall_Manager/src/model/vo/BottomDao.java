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

public class BottomDao {
	private HashMap<String,Bottom> BottomStock = new HashMap<>();
	private String pNum="000000";
	public void setData() {
		BufferedReader br = null;
		
		try {
			br=new BufferedReader(new FileReader("BottomDB.txt"));
		
			String tmp=null;
			while((tmp=br.readLine())!=null) {
				String temp = tmp.substring(1, tmp.length()-1);
				
				String[] product = temp.split(",");
				Bottom b = new Bottom(product[0],product[1],product[2],Integer.parseInt(product[3]),Integer.parseInt(product[4]),Integer.parseInt(product[5]),product[6]);
				BottomStock.put(product[0], b);
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
			bw=new BufferedWriter(new FileWriter("BottomDB.txt",true));
			bw.write("["+topData[0]+","+topData[1]+","+topData[2]+","+topData[3]+","+topData[4]+","+topData[5]+","+topData[6]+"]\n");
			Bottom b = new Bottom(topData[0],topData[1],topData[2],Integer.parseInt(topData[3])-1,Integer.parseInt(topData[4])-1,Integer.parseInt(topData[5])-1,topData[6]);
			BottomStock.put(topData[0], b);
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
		Set<String> kSet = BottomStock.keySet();
		Iterator<String> kItr = kSet.iterator();
		
		while(kItr.hasNext()) {
			String tempKey = kItr.next();
			Bottom tempB =BottomStock.get(tempKey);
			System.out.println(tempB.toString());
		}
	}
	
	public ArrayList<Product> searchData(String word) {
		Set<String> kSet = BottomStock.keySet();
		Iterator<String> kItr = kSet.iterator();
		ArrayList<Product> sData = new ArrayList<Product>(); 
		
		while(kItr.hasNext()) {
			String tempKey = kItr.next();
			if(tempKey.contains(word)) {
				sData.add(BottomStock.get(tempKey));
			}
		}
		return sData;
	}
}
