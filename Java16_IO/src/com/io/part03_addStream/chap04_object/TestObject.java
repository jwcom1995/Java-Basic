package com.io.part03_addStream.chap04_object;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestObject {
	
	public void fileSave() {
		Member m = new Member("user01","pass01","이창진",25,'남');
		
		ObjectOutputStream objOut = null;
		
		try {
			objOut = new ObjectOutputStream(new FileOutputStream("member.txt"));
			
			objOut.writeObject(m);
			objOut.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				objOut.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileOpen() {
		try (ObjectInputStream objIn=new ObjectInputStream(new FileInputStream("member.txt"));) {
			Member m = (Member)objIn.readObject();
			
			System.out.println(m);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
