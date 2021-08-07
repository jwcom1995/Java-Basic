package com.test03.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		
		ServerSocket serverSocket = null;  	//요청을 받음
		Socket serviceSocket = null;		//통신을 위한 연결
		PrintWriter out = null;				//출력
		BufferedReader in = null;			//클라이언트로 부터 읽어드린 내용
		
		//서버생성
		serverSocket = new ServerSocket(8888);
		
		while(true) {
			System.out.println("client를 기다립니다.");
			//클라이언트의 요청 수락
			serviceSocket = serverSocket.accept();
			System.out.println("client가 접속했습니다.....");
			
			//data를 읽어서
			in = new BufferedReader(new InputStreamReader(serviceSocket.getInputStream()));
		
			//보내주겠다.
			out = new PrintWriter(serviceSocket.getOutputStream(),true);
			
			String inputLine = null;
			while((inputLine=in.readLine()) != null) {
				System.out.println("클라이언트가 보낸 메시지: "+inputLine);
				out.print(inputLine);
			}
			
			out.close();
			in.close();
			serviceSocket.close();
			serverSocket.close();
		}		
		
	}
}
