package EX;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean play = true;
		while (play) {
			System.out.println("게임시작 1");
			System.out.println("게임종료 2");
			System.out.print(">>");
			int select = sc.nextInt();
			if (select == 1) {
				play = true;
			} else {
				System.out.println("게임을 종료합니다.");
				play = false;
				break;
			}

			int TARGET = (int) (Math.random() * 50) + 1;
			for (int i = 0; i < 10; i++) {
				System.out.print("숫자를 입력해주세요 : ");
				int num = sc.nextInt();
				Ex2_UpDown game = new Ex2_UpDown(num, TARGET);
				if(game.count== 0) {
					System.out.println("실패!");
					System.out.println("다시 도전하세요~");
					play = false;
					break;
				}else if(game.end) {
					game.countRe();
					break;
				}else {
					
				}
			}
		}
	}

}
