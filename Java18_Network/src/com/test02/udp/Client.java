package com.test02.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Client {
	public static void main(String[] args) throws IOException {
		//생성
		DatagramSocket ds = new DatagramSocket(9999);
		System.out.println("수신자 입니다.");
		
		//받을 방 생성
		byte[] buff = new byte[1024];
		
		
		//패킷을 받음
		DatagramPacket receiveP = new DatagramPacket(buff,buff.length);
		
		ds.receive(receiveP);
		System.out.println("----------------");
		System.out.println(new String(receiveP.getData()));
		
		//종료
		ds.close();
		ds.disconnect();
		
	}
}
