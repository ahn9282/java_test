package january2024.study0123;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class exception3 {

	public static void main(String[] args) {
		Path file = Paths.get("C:\\Users\\tjqwn\\Simple.txt");

		BufferedWriter writer = null;

		try {
			writer = Files.newBufferedWriter(file);
		
		writer.write('A');
		writer.write('Z');

		if (writer != null)
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
