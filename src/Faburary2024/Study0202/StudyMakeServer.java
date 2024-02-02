package Faburary2024.Study0202;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

class MakeServerSocket {

	ServerSocket serversocket = null;
	Socket socket = null;

	PrintWriter writer = null;
	BufferedReader reader = null;
	String lineStr = null;

	public MakeServerSocket() {
		try {
			serversocket = new ServerSocket(2000);//2000번 포트의 서버 소켓 생성
			while (true) {
				socket = serversocket.accept(); // 클라이언트를 기다림
				System.out.println("클라이언트 요청");
				writer = new PrintWriter(socket.getOutputStream(), true);
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				while ((lineStr = reader.readLine()) != null) {
					writer.write(lineStr);
					System.out.println("input : " + lineStr);
				}
				writer.close();
				reader.close();
				socket.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

public class StudyMakeServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new MakeServerSocket();
	}

}
