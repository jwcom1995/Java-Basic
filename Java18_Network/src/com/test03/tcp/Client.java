package com.test03.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws UnknownHostException {
		
		Socket clientSocket;
		PrintWriter out = null;
		BufferedReader in = null;		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("server에 접속합니다..");
		String serverIp = InetAddress.getLocalHost().getHostAddress();
		System.out.println(serverIp);
		try {
			clientSocket= new Socket("localhost",8888);
			
			//클라이언트 입장에서 출력
			out = new PrintWriter(clientSocket.getOutputStream(),true);
			//보낸메세지를 받기위한 스트림
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			//위의 두 과정으로 클라이언트와 서버 스트림이 연결됨
			
			//데이터 넘기고 처리
			String inputLine;
			
			while((inputLine=sc.nextLine()) != null) {
				out.print(inputLine);
				System.out.println("server로 부터 다시 받은 메시지 : "+in.readLine());
			}
			
			in.close();
			out.close();
			clientSocket.close();
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
		
	}
}
