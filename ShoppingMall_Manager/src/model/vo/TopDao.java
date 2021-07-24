package model.vo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TopDao {
	private HashMap<String,Top> topStock = new HashMap<>();
	private String pNum="000000";
	public void setData() {
		BufferedReader br = null;
		
		try {
			br=new BufferedReader(new FileReader("Topdb.txt"));
		
			String tmp=null;
			while((tmp=br.readLine())!=null) {
				String temp = tmp.substring(1, tmp.length()-1);
				
				String[] product = temp.split(",");
				Top t = new Top(product[0],product[1],product[2],product[3],Integer.parseInt(product[4]),product[5],product[6]);
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
			bw=new BufferedWriter(new FileWriter("Topdb.txt",true));
			bw.write("["+topData[0]+","+topData[1]+","+topData[2]+","+topData[3]+","+topData[4]+","+topData[5]+","+topData[6]+"]");
			Top t = new Top(topData[0],topData[1],topData[2],topData[3],Integer.parseInt(topData[4]),topData[5],topData[6]);
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
	
	public void showData() {
		Set<String> kSet = topStock.keySet();
		Iterator<String> kItr = kSet.iterator();
		
		while(kItr.hasNext()) {
			String tempKey = kItr.next();
			Top tempT =topStock.get(tempKey);
			System.out.println(tempT.toString());
		}
	}
}
