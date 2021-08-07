package com.test02.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Server {
	public static void main(String[] args) throws IOException {
		//소켓 생성
		DatagramSocket ds = new DatagramSocket();
		System.out.println("발신자입니다.");
		
		//보낼 data
		byte[] buff = "연습 메세지입니다".getBytes();
		
		//packet으로 감싼다.
		DatagramPacket senddP = new DatagramPacket(buff,buff.length, InetAddress.getByName("localhost"),9999);
		
		//보낸다.
		ds.send(senddP);
		
		//종료
		ds.close();
		ds.disconnect();
	}
}
