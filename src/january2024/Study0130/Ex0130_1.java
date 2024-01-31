package january2024.Study0130;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Ex0130_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		while (true) {

			Scanner sc = new Scanner(System.in);
			System.out.print("나라 이름과 인구를 입력하세요 : (예시 : KOREA 5000)");
			String str = sc.next();
			if (str.equals("그만"))
				break;
			int num = sc.nextInt();
			String k = str;
			int v = num;
			map.put(k, v);
		}

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("인구 검색 >>");
			String str = sc.nextLine();
			if (str.equals("그만"))
				break;
			System.out.println(map.get("asd"));
			if (map.containsKey(str)) {
				System.out.println(str + "의 인구는 " + map.get(str));
			} else {
				System.out.println(str + " 나라는 없습니다.");
			}

		}
	}

}
