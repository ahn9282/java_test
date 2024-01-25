package january2024.study0125;

import java.util.Scanner;

public class TodayEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean play = true;
		while (play) {
			int count = 0;
			String str = sc.nextLine();
			if (str.equals("그만")) {
				play = false;
				System.out.println("종료합니다...");
				break;
			}
			for (char c : str.toCharArray()) {
				if (c == ' ')
					count++;
			}
			System.out.println("어절 개수는 " + count);

		}
	}
}
