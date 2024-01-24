package january2024.study0123;

interface ICalculator {
	int add(int x, int y);

	int sub(int x, int y);

	int mul(int x, int y);

	int div(int x, int y);
}

class Calculator implements ICalculator {

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x + y;
	}

	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return x - y;
	}

	@Override
	public int mul(int x, int y) {
		// TODO Auto-generated method stub
		return x * y;
	}

	@Override
	public int div(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println(x / y);
		return x / y;
	}

}

public class Calt {

	public static void main(String[] args) {
		ICalculator cal = new Calculator();
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
