package Faburary2024.Study0202;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class StudyMakeClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		new MakeClientSocket();
		
	}

}

class MakeClientSocket {
	Socket socket = null;

	PrintWriter writer = null;
	BufferedReader reader = null;

	public MakeClientSocket() {
		try {
			socket = new Socket("192.168.0.183", 2000);//호스트 Ip주소의 2000번 포트로 해당 서버를 찾아감
			writer = new PrintWriter(socket.getOutputStream(), true);
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String str = null;
			BufferedReader sReader = new BufferedReader(new InputStreamReader(System.in));
			while ((str = sReader.readLine()) != null) {
				writer.println(str);
				System.out.println("output" + str);
			}
			writer.close();
			reader.close();
			sReader.close();
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
