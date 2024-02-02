package Faburary2024.Study0202;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class StudyJAVANetWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Host(server) 이름을 입력 : ");
		try {
			InetAddress inetAddress = InetAddress.getByName(scanner.next());
				System.out.println(inetAddress.getHostName());
		    	System.out.println(inetAddress.getHostAddress());
		    	
				}catch(UnknownHostException e) {
					e.printStackTrace();
				}
	}

}
