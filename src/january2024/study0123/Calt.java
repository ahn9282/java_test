package january2024.study0123;

interface ICalculator {
	int add(int x, int y);

	int sub(int x, int y);

	int mul(int x, int y);

	int div(int x, int y);
}

class Calculator implements ICalcurator {
	int a;
	int b;

	public int add(int x, int y) {
		return x + y;
	}

	public int sub(int x, int y) {
		return x - y;
	}

	public int mul(int x, int y) {
		return x * y;
	}

	public int div(int x, int y) {
		return x / y;
	}
}

public class Calt {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		try {
			System.out.println(cal.add(6, 5));
			System.out.println(cal.sub(6, 5));
			System.out.println(cal.mul(6, 5));
			System.out.println(cal.div(6, 0));
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("계산기 종료");
		}
	}

}
