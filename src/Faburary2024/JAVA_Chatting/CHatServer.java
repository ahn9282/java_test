package Faburary2024.JAVA_Chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class CHatServer {
	public static void main(String[] args) {
		ServerSocket serversocket = null;
		Socket socket = null;

		try {
			serversocket = new ServerSocket(7777);
			socket = serversocket.accept();
			System.out.println("Server is ready");

			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);
			sender.start();
			receiver.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Sender extends Thread {
	Socket socket;
	DataOutputStream out;
	String name;

	public Sender(Socket socket) {
		this.socket = socket;
		try {
			out = new DataOutputStream(socket.getOutputStream());
			name = "[" + socket.getInetAddress()+ ":" + socket.getPort() + "]";
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		Scanner scanner = new Scanner(System.in);
		
		while(out != null) {
			try {
				out.writeUTF(name + scanner.nextLine());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class Receiver extends Thread {
	DataInputStream in;
	Socket socket;
	String name;

	public Receiver(Socket socket) {
		this.socket = socket;
		try {
			in = new DataInputStream(socket.getInputStream());
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	@Override
	public
	void run() {
		while(in != null) {
		try {
			System.out.println(in.readUTF());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
		}
}