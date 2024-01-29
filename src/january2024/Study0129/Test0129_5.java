package january2024.Study0129;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test0129_5 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		while (true) {
			try {
				System.out.print("이름 입력 :");
				for (int i = 1; i <= 5; i++) {
					Scanner sc = new Scanner(System.in);
					String name = sc.nextLine();
					list.add(name);
				}
			} catch (Exception e) {
				System.out.println("제대로 입력하세여");
				list = new ArrayList<>();
				continue;
			}
			break;
		}
		System.out.println("김씨 인 사람 : ");
		for (String s : list) {
			if (s.charAt(0) == '김') {
				System.out.println(s);
			}
		}

	}
}