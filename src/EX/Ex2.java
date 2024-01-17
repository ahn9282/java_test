package EX;

import java.util.Scanner;

public class Ex2 {
	private boolean play = true;
	Scanner sc = new Scanner(System.in);

	public Ex2() {
		while (play) { // 재경기를 위한 while 반복
			System.out.println("게임시작 1"); // 의사 물어보기
			System.out.println("게임종료 2");
			System.out.print(">>");
			int select = sc.nextInt(); // 입력
			if (select == 1) {
				play = true;
			} else {
				System.out.println("게임을 종료합니다."); // play = 0으로 하고 break를 넣어서 게임 종료
				play = false;
				break;
			}

			int TARGET = (int) (Math.random() * 100) + 1; // 1~50 랜덤값
			for (int i = 0; i < 10; i++) { // 10회 제한이므로 10번 까지 반복
				System.out.print("숫자를 입력해주세요 : ");
				int num = sc.nextInt();
				Ex2_UpDown game = new Ex2_UpDown(num, TARGET); // EX2_UpDown의 객체를 생성 그리고 생성자를 통해 Up과 Down그리고 남은횟수 출력
				if (game.count == 0) { // 남은 횟수가 0일 때
					System.out.println("실패!");
					System.out.println("다시 도전하세요~");
					play = false;
					break;
				} else if (game.end) {
					game.countRe();// 숫자를 맞췄을 때 재경기를 위한 count초기화
					break;
				} else {

				}
			}
		}
	}

}
