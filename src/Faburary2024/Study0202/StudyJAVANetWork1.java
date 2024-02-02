package Faburary2024.Study0202;

import java.net.InetAddress;
import java.util.Scanner;

public class StudyJAVANetWork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InetAddressEx();
		new InetAddressEx();
	}

}
class InetAddressEx{
Scanner scanner;
public InetAddressEx() {
	System.out.println("Host 이름을 입력 : ");
	scanner = new Scanner(System.in);
	try {
		InetAddress inetAddress = InetAddress.getByName(scanner.next());
		
		System.out.println("Computer NAME : " + inetAddress.getHostName());
		System.out.println("Computer IP :" + inetAddress.getHostAddress());
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
}