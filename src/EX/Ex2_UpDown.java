package EX;

public class Ex2_UpDown {
	static int count = 10;
	static  boolean end= false;

	Ex2_UpDown(int num, int ran) {
		--count;
		if (num > ran) {
			System.out.println("Down ===> " + count + "번 남아 있습니다.");
		} else if (num < ran) {
			System.out.println("Up ===> " + count + "번 남아 있습니다.");
		} else if (num == ran) {
			System.out.println("일치");
			System.out.println("ㅊㅋㅊㅋ");
			endNow();
		}
	}

	void countRe() {
		this.count = 10;
	}

	boolean endNow() {
		this.end = true;
		return end;
	}
}
