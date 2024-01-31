package january2024.Study0131;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StudyFilterStream1 {

	public static void main(String[] args) throws IOException {
	
		try(
		DataOutputStream out = new DataOutputStream(new FileOutputStream("data.dat"))){
			out.writeInt(370);
			out.writeDouble(3.14);
				}catch(IOException e) {
					e.printStackTrace();
				}
		try(DataInputStream in = new DataInputStream(new FileInputStream("data.dat"))){
			int num1= in.readInt();
			double num2= in.readDouble();
			System.out.println(num1);
			System.out.println(num2);
		}catch(IOException e) {
			e.printStackTrace();
		}
}
		
	}


