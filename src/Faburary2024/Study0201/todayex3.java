package Faburary2024.Study0201;

import java.util.HashMap;
import java.util.Scanner;

public class todayex3 {

	public static void main(String[] args) {
		HashMap<String, Integer> menu = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		menu.put("에스프레소", 2000);
		menu.put("아메리카노", 2500);
		menu.put("카푸치노", 3000);

		try {
			while (true) {
				System.out.println("메뉴 입력 : ");
				String str = sc.nextLine();
				if (menu.get(str) == null)
					break;
				else if (str.contentEquals("그만"))
					break;
				System.out.println(menu.get(str) + "원 입니다.");
			}
		} catch (Exception e) {

		}

	}
}
