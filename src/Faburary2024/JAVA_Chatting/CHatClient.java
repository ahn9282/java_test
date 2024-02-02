package Faburary2024.JAVA_Chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class CHatClient {
	public static void main(String[] args) {
		Socket socket = null;

		try {
			socket = new Socket("localhost",7777);
			System.out.println("Start");

			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);
			sender.start();
			receiver.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
