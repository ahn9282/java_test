package january2024.Study0131;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class StudyIOStream2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("대상 파일 : ");
		String src = sc.nextLine();
		System.out.print("사본 이름 : ");
		String dst = sc.nextLine();
		try(
		OutputStream out = new FileOutputStream(dst);
		InputStream in = new FileInputStream(src)){
		int data;
				while(true) {
					data = in.read();
					if(data == -1) 
						break;
					out.write(data);
				}
				}catch(IOException e) {
					e.printStackTrace();
				}
}
		
	}


