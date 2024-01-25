package january2024.study0125;

public class TodayEx2 {

	public static void main(String[] args) {
		MyPoint p = new MyPoint(3, 50);
		MyPoint q = new MyPoint(4, 50);
		System.out.println(p);
		if(p.equals(q)) System.out.println("같은 점");
		else System.out.println("다른 점");
	}
}

class MyPoint<T> {
	int num1;
	int num2;

	public MyPoint(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public String toString() {
		return "Point(" + num1 + ", " + num2 + ")";
	}

	public boolean equals(MyPoint a) {
		if ((this.num1 == a.num2) && (this.num2 == a.num2))
			return true;
		return false;
	}
}