package january2024.study0122;

public class ex3 {
	public static void main(String[] args) {
		Calcurator c = new Calcurator();
		c.add(1, 8);
		c.sub(14, 8);
		c.multi(11, 8);
		c.div(16, 8);
}}
interface ICalcurator{
	int add(int num1, int num2);
	int sub(int num1, int num2);
	int multi(int num1, int num2);
	int div(int num1, int num2);
}
class Calcurator implements ICalcurator{
	public int add(int num1, int num2) {
		System.out.println(num1 + num2);
		return num1 + num2 ;
	}
	public int sub(int num1, int num2) {
		System.out.println(num1 - num2);
		return num1 - num2 ;
	}
	public int multi(int num1, int num2) {
		System.out.println(num1 * num2);
		return num1 * num2 ;
	}
	public int div(int num1, int num2) {
		System.out.println(num1 / num2);
		return num1 / num2 ;
	}
}
