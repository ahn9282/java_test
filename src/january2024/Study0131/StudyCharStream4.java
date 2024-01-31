package january2024.Study0131;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class StudyCharStream4 {

	public static void main(String[] args) {
		String ks = "공부에 있어서 돈이 꼭 필요한가?";
				String es = "Life is long if you know how to use it";
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("읽을 파일 : ");
		String src = sc.nextLine();
		try (BufferedWriter out = new BufferedWriter(new FileWriter(src))) {
			out.write(ks, 0 ,ks.length());
			out.newLine();
			out.write(es, 0 ,es.length());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
