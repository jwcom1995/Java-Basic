package customer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CustomerDao {
	HashMap<String, Customer> csList = new HashMap<>();

	public void setData() {
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader("CustomersDb.txt"));
			String tmp = null;
			while ((tmp = br.readLine()) != null) {
				String temp = tmp.substring(1, tmp.length() - 1);
				String[] cusInfo = temp.split(",");
				Customer c = new Customer(cusInfo[0], cusInfo[1], cusInfo[2], cusInfo[3]);
				csList.put(cusInfo[0], c);
			}
		} catch (FileNotFoundException e) {
			System.out.println("db파일이 존재하지 않습니다.");
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

	public void addData(String[] csData) {
		BufferedWriter bw = null;
		if (checkData(csData[0])) {
			try {
				bw = new BufferedWriter(new FileWriter("CustomersDB.txt", true));
				bw.write("[" + csData[0] + "," + csData[1] + "," + csData[2] + "," + csData[3] + "]\n");
				Customer c = new Customer(csData[0], csData[1], csData[2], csData[3]);
				csList.put(csData[0], c);
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} else {
		}
	}

	public boolean checkData(String id) {

		Set<String> kSet = csList.keySet();
		Iterator<String> kItr = kSet.iterator();

		while (kItr.hasNext()) {
			String tempKey = kItr.next();
			if (tempKey.equals(id)) {
				return false;
			}
		}
		return true;
	}
	
	public boolean checkData(String id, String pwd) {
		
		Set<String> kSet = csList.keySet();
		Iterator<String> kItr = kSet.iterator();

		while (kItr.hasNext()) {
			String tempKey = kItr.next();
			if (tempKey.equals(id)) {
				Customer c= csList.get(id);
				if(c.getPwd().equals(pwd)) {
					return true;
				}else {
					return false;
				}
			}
		}
		return false;
	}
	
	public Customer getData(String id) {
		Customer c = new Customer();
		Set<String> kSet = csList.keySet();
		Iterator<String> kItr = kSet.iterator();

		while (kItr.hasNext()) {
			String tempKey = kItr.next();
			if (tempKey.equals(id)) {
				c=csList.get(id);
			}
		}
		return c;
	}
}
