package january2024.Study0129;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test0129_6 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 이름, 학과, 학번, 학점평균을 입력하세요.");
		while (true) {
			for (int i = 1; i <= 4; i++) {
				System.out.print(">> ");
				String str = sc.nextLine();
				list.add(str);
			}

			System.out.println("--------------------------------------");
			try {
				for (String s : list) {
					StringTokenizer st = new StringTokenizer(s, ",");
					if (st.hasMoreTokens()) {
						System.out.print("이름 : ");
						System.out.println(st.nextToken());
					}
					if (st.hasMoreTokens()) {
						System.out.print("학과 : ");
						System.out.println(st.nextToken());
					}
					if (st.hasMoreTokens()) {
						System.out.print("학번 : ");
						System.out.println(st.nextToken());
					}
					if (st.hasMoreTokens()) {
						System.out.print("평균 : ");
						System.out.println(st.nextToken());
					}
				}
			} catch (Exception e) {
				System.out.println("제대로 입력안해?");
				list = new ArrayList<>();
				continue;
			}

		}
	}
}