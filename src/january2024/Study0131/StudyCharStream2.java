package january2024.Study0131;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class StudyCharStream2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("읽을 파일 : ");
		String src = sc.nextLine();
		try (Writer out = new FileWriter(src)) {
			for(int ch = 65; ch < 92;ch++) {
				out.write(ch);
			}
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
