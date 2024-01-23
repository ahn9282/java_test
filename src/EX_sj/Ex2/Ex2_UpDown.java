package EX_sj.Ex2;

public class Ex2_UpDown {
	static int count = 10;
	static boolean end = false;

	Ex2_UpDown(int num, int ran) {
		--count;
		if (num > ran) {
			System.out.println("Down ===> " + count + "번 남아 있습니다.");// 입력 값이 랜덤 값보다 클 경우
		} else if (num < ran) {
			System.out.println("Up ===> " + count + "번 남아 있습니다.");// 입력 값이 랜덤 값보다 작을 경우
		} else if (num == ran) {
			System.out.println("일치");
			System.out.println("ㅊㅋㅊㅋ");
			endNow();// 반복문을 끝내도록 하는 boolean타입 end를 true로 반환하는 메서드활용
		}
	}
	void countRe() {// 재경기를 위한 static int count값을 다시 10으로 초기화
	}
	boolean endNow() {
		this.end = true;// 숫자를 맞출경우 end를 true로
		return end;
	}
}