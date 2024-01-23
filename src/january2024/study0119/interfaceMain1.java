package january2024.study0119;

public class interfaceMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printable prn = new Printer();
		prn.print("안녕하세요");
		Cal sum = new Cal();
		sum.add(2, 7);
		sum.sub(9, 7);
		sum.multi(2, 7);
	}

}

interface Printable {
	public abstract void print(String doc);
}

interface ICalcurator {
	int add(int num1, int num2);
	int sub(int num1, int num2);
	int multi(int num1, int num2);
}

class Cal implements ICalcurator {
	public int add(int num1, int num2) {
		System.out.println(num1 + num2);
		return num1 + num2;
	}
	public int sub(int num1, int num2) {
		System.out.println(num1 - num2);
		return num1 - num2;
	}
	public int multi(int num1, int num2) {
		System.out.println(num1 * num2);
		return num1 * num2;
	}
}

class Printer implements Printable {
	@Override
	public void print(String doc) {
		System.out.println(doc);
	}
}