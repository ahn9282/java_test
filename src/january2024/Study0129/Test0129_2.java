package january2024.Study0129;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test0129_2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		for (int i = 1; i <= 5; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print(i + "번째 별명 입력 :");
			String str = sc.nextLine();
			list.add(str);
		}
		String longname = "";
		int max = 0;
		for (String s : list) {
			if (s.length() > max) {
				max = s.length();
				longname = s;
			}
		}
		System.out.println("이름이 제일 긴 사람 : " + longname);
	}
}