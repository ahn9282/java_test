package january2024.study0123;

public class tex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal c =new Cal();
		c.add(1, 2);
		System.out.println(c.add(1, 2));
	}
}
interface ICalcurator{
	int add(int num1, int num2);
}
class Cal implements ICalcurator{
	public int add(int num1, int num2) {
		return num1+ num2;
	}
}