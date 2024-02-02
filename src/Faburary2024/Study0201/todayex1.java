package Faburary2024.Study0201;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class todayex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(InputStream in = new FileInputStream("data.dat");
				OutputStream out = new FileOutputStream("data1.dat")){
			
			int data;
			while(true) {
				data = in.read();
				if(data == -1)break;
				out.write(data);
			}
					
			
		}catch(Exception e) {
			
		}
	}

}
