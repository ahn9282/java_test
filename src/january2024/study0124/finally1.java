package january2024.study0124;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class finally1 {

	public static void main(String[] args) {
		Path file = Paths.get("C:\\Users\\tjqwn\\Simple.txt");

		BufferedWriter writer = null;

		try {

			writer = Files.newBufferedWriter(file);

			writer.write('A');
			writer.write('Z');
			writer.write("sdasd");
			writer.write("야야야");
			writer.append("지지지지");

			if (writer != null)
				writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("종료로 마침");
			if(writer != null)
				try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					System.out.println("ddd");
				}
		}
	}
}
