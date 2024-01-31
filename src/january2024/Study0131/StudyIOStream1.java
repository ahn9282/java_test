package january2024.Study0131;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StudyIOStream1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		OutputStream out = new FileOutputStream("data.dat");
		out.write(7);
		out.write(7);
		out.close();
		
		InputStream in = new FileInputStream("data.dat");
		in.read();
		System.out.println(in.read());
		System.out.println(in.read());
		System.out.println(in.read());
		int dat = in.read();
		in.close();
		System.out.println(dat);
		
		
	}

}
