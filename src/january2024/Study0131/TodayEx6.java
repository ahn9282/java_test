package january2024.Study0131;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class TestText {
	int num = 0;
	String str;
	int number =1;
	List<String> list = new ArrayList<>();

	void ReadText() {
		int index = 0;
		try (BufferedReader br = new BufferedReader(new FileReader("system.ini"))) {
			str = " ";
			while (true) {
				str = br.readLine();
				if (str == null)
					break;
				list.add(str);
				System.out.println(str);
				num += 1;
			}

		} catch (Exception e) {
			// TODO Auto-generated method stub
			e.printStackTrace();
		}
	}

	void UpdateToUpperCase() {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("system.ini"))) {
			for (int i = 0; i < num; i++) {
				str = list.get(i);
				str = str.toUpperCase();
				bw.write(number + ". ");
				bw.write(str, 0, str.length());
				bw.newLine();
				System.out.println(str);
				number++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class TodayEx6 {

	public static void main(String[] args) {
		TestText tt = new TestText();
		tt.ReadText();
		tt.UpdateToUpperCase();
	}
}